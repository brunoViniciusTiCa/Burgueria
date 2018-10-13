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
       
        String sql = "INSERT INTO cliente (cpfCliente, telefoneCliente,enderecoCliente, nomeCliente, sexoCliente) VALUES "
                + "(?,?,?,?,?)";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setString(1, cliente.getCpfCliente());
        preparedstatement.setString(2, cliente.getTelefoneCliente());
        preparedstatement.setString(3, cliente.getEnderecoCliente());
        preparedstatement.setString(4, cliente.getNomeCliente());
        preparedstatement.setString(5, cliente.getSexoCliente());
        
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
       preparedstatement.setInt   (3, cliente.getIdCliente());
       
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
            c.setSexoCliente(resultCliente.getString("sexoCliente"));
            
            clienteList.add(c);
         }
        
         conexao.Desconectar();
        return clienteList;
    }

    @Override
    public List<Cliente> selectByNomeCliente(Cliente cliente) throws SQLException, Exception {
        
         List<Cliente> clienteList = new ArrayList();
         
         conexao = Conexao.getInstance();
         
         java.sql.Connection connection =  conexao.Conectar();
         
         String sql = "Select * From cliente WHERE nomeCliente = ? ";
         
         PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
         preparedstatement.setString(1, cliente.getNomeCliente());
         
         ResultSet resultClienteNome = preparedstatement.executeQuery();
         
         while(resultClienteNome.next()){
         
            Cliente c = new Cliente();
            c.setIdCliente(resultClienteNome.getInt("idCliente"));
            c.setCpfCliente(resultClienteNome.getString("cpfCliente"));
            c.setTelefoneCliente(resultClienteNome.getString("telefoneCliente"));
            c.setEnderecoCliente(resultClienteNome.getString("enderecoCliente"));
            c.setNomeCliente(resultClienteNome.getString("nomeCliente"));
            c.setSexoCliente(resultClienteNome.getString("sexoCliente"));
            
            clienteList.add(c);
         }
        conexao.Desconectar();
        
        return clienteList;
    }

    @Override
    public List<Cliente> selectByCpfCliente(Cliente cliente) throws SQLException, Exception {
        List<Cliente> clienteList = new ArrayList();
         
         conexao = Conexao.getInstance();
         
         java.sql.Connection connection =  conexao.Conectar();
         
         String sql = "Select * From cliente WHERE cpfCliente = ? ";
         PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
         preparedstatement.setString(1, cliente.getCpfCliente());
         
         ResultSet resultCliente = preparedstatement.executeQuery();
         
         while(resultCliente.next()){
         
            Cliente c = new Cliente();
            c.setIdCliente(resultCliente.getInt("idCliente"));
            c.setCpfCliente(resultCliente.getString("cpfCliente"));
            c.setTelefoneCliente(resultCliente.getString("telefoneCliente"));
            c.setEnderecoCliente(resultCliente.getString("enderecoCliente"));
            c.setNomeCliente(resultCliente.getString("nomeCliente"));
            c.setSexoCliente(resultCliente.getString("sexoCliente"));
            
            clienteList.add(c);
         }
        
        conexao.Desconectar();
        return clienteList;
    }
    
    public boolean isCpfExistenteCliente(Cliente cliente) throws SQLException, Exception {
        boolean exists = false;
        conexao = Conexao.getInstance();
        Connection connection = conexao.Conectar();

        String sql = "SELECT cpf FROM cliente WHERE cpfCliente = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, cliente.getCpfCliente());

        ResultSet resultPessoa = preparedStatement.executeQuery();
        if (resultPessoa.next()) {
            if (resultPessoa.getString("cpfcliente") != null) {
                exists = true;
            }
        }
        conexao.Desconectar();
        return exists;
    }
    
    public boolean isIdCliente(Cliente cliente) throws SQLException, Exception{
        boolean exists = false;
        conexao = Conexao.getInstance();
        Connection connection = conexao.Conectar();
        
        String sql = "SELECT cpf FROM cliente WHERE idCliente = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, cliente.getIdCliente());
        
        ResultSet resultCliente = preparedStatement.executeQuery();
        if (resultCliente.next()) {
            if (resultCliente.getString("idCliente") != null) {
                exists = true;
            }
        }
        return exists;
    }

  

  
    
    

   

}
    

