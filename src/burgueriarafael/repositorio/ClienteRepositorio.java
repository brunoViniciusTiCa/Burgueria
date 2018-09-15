/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.repositorio;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import burgueriarafael.basica.Cliente;
import burgueriarafael.interfaces.CrudClienteInterface;
import burgueriarafael.util.banco.Conexao;




/**
 *
 * @author BrunoTiCaVini
 */
public class ClienteRepositorio implements CrudClienteInterface{

            Conexao conexao = null;
     
    @Override
    public boolean insert(Cliente cliente) throws SQLException {
        
        conexao = Conexao.getInstance();
        
       Connection connection = conexao.Conectar();
       
        String sql = "INSERT INTO cliente (cpfCliente, telefoneCliente,enderecoCliente, nomeCliente, sexoClient) VALUES "
                + "(?,?,?,?,?)";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        
      
        preparedstatement.setString(1, cliente.getCpfCliente());
        preparedstatement.setString(2, cliente.getTelefoneCliente());
        preparedstatement.setString(3, cliente.getEnderecoCliente());
        preparedstatement.setString(4, cliente.getNomeCliente());
        preparedstatement.setString(5, cliente.getSexoClient());
        
        preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        return true;
        
    }

    @Override
    public boolean update(Cliente cliente) throws SQLException {
        
       conexao = Conexao.getInstance();
       
       Connection connection = conexao.Conectar();
       
       String sql = "UPDATE cliente SET telefoneCliente = ?, enderecoCliente = ?"
               + "WHERE idCliente = ?" ;
      
       PreparedStatement preparedstatement = connection.prepareStatement(sql); 
       
       preparedstatement.setString(1, cliente.getTelefoneCliente());
       preparedstatement.setString(2, cliente.getEnderecoCliente());
       preparedstatement.setInt(3, cliente.getIdCliente());
       
       preparedstatement.executeUpdate();
       
       conexao.Desconectar();
       
       return true;
    }

    @Override
    public boolean delete(Cliente cliente) throws SQLException {
        
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
       String sql = "DELETE FROM cliente WHERE idCliente = ?";
       PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, cliente.getIdCliente());
        
        preparedstatement.execute();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public List<Cliente> select() throws SQLException {
        
         List<Cliente> clienteList = new ArrayList();
         
         conexao = Conexao.getInstance();
         
         java.sql.Connection connection =  conexao.Conectar();
         
         String sql = "Select * From cliente";
         PreparedStatement preparedstatement = connection.prepareStatement(sql);
         ResultSet resultCliente = preparedstatement.executeQuery();
         
         while(resultCliente.next()){
         
            Cliente c = new Cliente();
            c.setIdCliente(resultCliente.getInt("idCliente"));
            c.setCpfCliente(resultCliente.getString("cpfCliente"));
            c.setTelefoneCliente(resultCliente.getString("telefoneCliente"));
            c.setEnderecoCliente(resultCliente.getString("enderecoCliente"));
            c.setNomeCliente(resultCliente.getString("nomeCliente"));
            c.setSexoClient(resultCliente.getString("sexoClient"));
            
            clienteList.add(c);
         }
        
         conexao.Desconectar();
        return clienteList;
    }

   

}
    

