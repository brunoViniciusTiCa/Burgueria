/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.repositorio;

import burgueriarafael.basica.Pedido;
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
         
          String sql = "INSERT INTO pedido (itemsPedido, statusDoPedido, valorProduto) VALUES"
                + "(?,?,?)";
         
  
         PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
         preparedstatement.setString(1, pedido.getItemsPedido());
         preparedstatement.setString(2, pedido.getStatusDoPedido());
         preparedstatement.setDouble(3, pedido.getProduto().getValorProduto());
         
         preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean update(Pedido pedido) throws SQLException, Exception {
       
        conexao = Conexao.getInstance();
         
         Connection connection = conexao.Conectar();
         
          String sql = "UPDATE pedido SET itemsPedido = ?, statusDoPedido = ?, valorProduto = ?"
                + "WHERE idPedido = ?";
         
  
         PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
         preparedstatement.setString(1, pedido.getItemsPedido());
         preparedstatement.setString(2, pedido.getStatusDoPedido());
         preparedstatement.setDouble(3, pedido.getProduto().getValorProduto());
         preparedstatement.setInt(4, pedido.getIdPedido());
         
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

            p.setItemsPedido(resultPedido.getString("itemsPedido"));

            p.setItemsPedido(resultPedido.getString("statusDoPedido"));

            p.getProduto().setValorProduto(resultPedido.getDouble("valorProduto"));
            
            Pedido.add(p);

        }
        conexao.Desconectar();
        
        return Pedido;

    }
}
