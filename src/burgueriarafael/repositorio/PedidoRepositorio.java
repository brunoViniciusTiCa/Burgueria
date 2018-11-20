/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.repositorio;

import burgueriarafael.basica.Pedido;
import burgueriarafael.basica.Produto;
import burgueriarafael.interfaces.CrudPedidoInterface;
import burgueriarafael.util.banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class PedidoRepositorio implements CrudPedidoInterface {

            Conexao conexao = null;
    
    @Override
    public boolean insert(Pedido pedido) throws SQLException {
         
          conexao = Conexao.getInstance();
         
         Connection connection = conexao.Conectar();
         
          String sql = "INSERT INTO pedido (statusDoPedido, valorProduto, nomeProduto, idProduto) VALUES"
                + "(?,?,?,?)";
         
  
         PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
         
         preparedstatement.setString(1, pedido.getStatusDoPedido());
         preparedstatement.setDouble(2, pedido.getProduto().getValorProduto());
         preparedstatement.setString(3, pedido.getProduto().getNomeProduto());
         preparedstatement.setInt(4, pedido.getProduto().getIdProduto());
         
         preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    
    @Override
    public boolean update(Pedido pedido) throws SQLException, Exception {
       
        conexao = Conexao.getInstance();
         
         Connection connection = conexao.Conectar();
       
         String sql = "UPDATE pedido SET statusDoPedido = ?, qtdProduto  = ?"
               + "WHERE idPedido = ?";
         
  
         PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
         
         preparedstatement.setString(1, pedido.getStatusDoPedido());
         preparedstatement.setDouble(2, pedido.getProduto().getValorProduto());
         preparedstatement.setString(3, pedido.getProduto().getNomeProduto());
         preparedstatement.setInt(4, pedido.getQtdProduto());
         preparedstatement.setInt(5, pedido.getIdPedido());
         
         
         preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean delete(Pedido pedido) throws SQLException, Exception {
     
        conexao = Conexao.getInstance();
         
         Connection connection = conexao.Conectar();
         
          String sql = "DELETE FROM pedido WHERE idPedido = ?";
         
         PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
         preparedstatement.setInt(1, pedido.getIdPedido());
       
         preparedstatement.executeUpdate();
        
         conexao.Desconectar();
        
        return true;
    }

    @Override
    public List<Pedido> select() throws SQLException, Exception {
     List<Pedido> Pedido = new ArrayList<>();

        conexao = Conexao.getInstance();

        java.sql.Connection connection = conexao.Conectar();

       String sql = "SELECT * FROM Pedido";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultPedido = preparedStatement.executeQuery();

        while (resultPedido.next()) {

           Pedido p = new Pedido();

            p.setIdPedido(resultPedido.getInt("idPedido"));  

            p.setStatusDoPedido(resultPedido.getString("statusDoPedido"));

            p.getProduto().setValorProduto(resultPedido.getDouble("valorProduto"));
            
            p.getProduto().setNomeProduto(resultPedido.getString("nomeProduto"));
            
            p.setQtdProduto(resultPedido.getInt("qtdProduto "));
            
            p.getProduto().setIdProduto(resultPedido.getInt("idProduto "));
            
            Pedido.add(p);

        }
        conexao.Desconectar();
        
        return Pedido;

    }
    
    public List<Produto> selecionarNome(Produto produto) throws SQLException, Exception{
    
     
        List<Produto> Produto = new ArrayList<>();

        conexao = Conexao.getInstance();

        java.sql.Connection connection = conexao.Conectar();

        String sql = "SELECT * FROM Produto WHERE idProduto = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultProduto = preparedStatement.executeQuery();

        while (resultProduto.next()) {

           Produto p = new Produto();

           
           //p.setNomeProduto(resultProduto.getString("nomeProduto"));
           p.setIdProduto(resultProduto.getInt("idProduto"));
           //p.setIdPedido(resultPedido.getInt("idPedido"));  

            
            Produto.add(p);

        }
        conexao.Desconectar();
                
        
       return Produto;
        
    
    }
    
    
}
