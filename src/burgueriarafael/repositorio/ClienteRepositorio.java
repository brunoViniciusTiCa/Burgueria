/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.repositorio;

import burgueriarafael.basica.Cliente;
import burgueriarafael.interfaces.CrudClienteInterface;
import burgueriarafael.util.banco.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class ClienteRepositorio implements CrudClienteInterface{

            Conexao conexao = new Conexao();
     
    @Override
    public boolean Insert(Cliente cliente) throws Exception {
        
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
        String sql = "INSERT INTO(idCliente,cpfCliente, telefoneCliente, enderecoCliente,nomeCliente,sexoClient VALUES"
                + "?,?,?,?,?,?)";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, cliente.getIdCliente());
        preparedstatement.setString(2, cliente.getCpfCliente());
        preparedstatement.setString(3, cliente.getTelefoneCliente());
        preparedstatement.setString(4, cliente.getEnderecoCliente());
        preparedstatement.setString(4, cliente.getNomeCliente());
        preparedstatement.setString(5, cliente.getSexoClient());
        
        preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        return true;
    }

    @Override
    public boolean Update(Cliente cliente) throws Exception {
        
       conexao = Conexao.getInstance();
       
       Connection connection = conexao.Conectar();
       
       String sql = "UPDATE Funcionario set idCliente = ?"
               + "telefoneCliente = ?, enderecoCliente = ? " ;
       
       PreparedStatement preparedstatement = connection.prepareStatement(sql); 
       
       preparedstatement.setInt(1, cliente.getIdCliente());
       preparedstatement.setString(2, cliente.getTelefoneCliente());
       preparedstatement.setString(3, cliente.getEnderecoCliente());
       
       preparedstatement.executeUpdate();
       
       conexao.Desconectar();
       
       return true;
    }

    @Override
    public boolean Delete(Cliente cliente) throws Exception {
        
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
       String sql = "DELETE Cliente Where idCliente = ?";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, cliente.getIdCliente());
        
        conexao.Desconectar();
        
         preparedstatement.execute();
        
        return true;
    }

    @Override
    public List<Cliente> select() throws Exception {
        
         List<Cliente> Clientes = new ArrayList();
         
         conexao = Conexao.getInstance();
         
         java.sql.Connection connection =  conexao.Conectar();
         
         String sql = "Select * From Cliente";
         
         PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
         ResultSet ResultCliente = preparedstatement.executeQuery();
         
         while(ResultCliente.next()){
         
            Cliente c = new Cliente();
            
            c.setIdCliente(ResultCliente.getInt("idCliente"));
            c.setCpfCliente(ResultCliente.getString("cpfCliente"));
            c.setTelefoneCliente(ResultCliente.getString("telefoneCliente"));
            c.setEnderecoCliente(ResultCliente.getString("enderecoCliente"));
            c.setNomeCliente(ResultCliente.getString("nomeCliente"));
            c.setSexoClient(ResultCliente.getString("sexoClient"));
            
            conexao.Desconectar();
         }
        return Clientes;
    }
    
}
