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
public class PedidoRepositorio implements CrudPedidoInterface{
   
            Conexao conexao = new Conexao();
    
    @Override
    public boolean insert(Pedido pedido) throws SQLException {
        
         conexao = Conexao.getInstance();
         
         Connection connection = (Connection) conexao.Conectar();
         
         String sql = " INSER INTO pedido (idPedido, valorProduto, nomeProduto, descricaoProduto)"
                 + "VALUES (?,?,?,?)";
         
         PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
         preparedstatement.setInt(1, pedido.getIdPedido());
         preparedstatement.setDouble(2 , pedido.getValorPedido());
         preparedstatement.setString(3, pedido.getNomePedido());
         preparedstatement.setString(4, pedido.getDescricaoPedido());
         
         preparedstatement.executeUpdate();
         
         conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean update(Pedido pedido) throws SQLException {
        
        conexao = Conexao.getInstance();
        
        Connection connection = (Connection) conexao.Conectar();
        
        String sql = "UPDATE pedido set idPedido = ?, nomePedido = ? , descricaoPedido = ?";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, pedido.getIdPedido());
        preparedstatement.setString(2, pedido.getNomePedido());
        preparedstatement.setString(3, pedido.getDescricaoPedido());
        
        preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean delete(Pedido pedido) throws SQLException {
     
        conexao = Conexao.getInstance();
        
        Connection connection = (Connection) conexao.Conectar();
        
        String sql = "DELETE FROM pedido WHERE idpedido = ?";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, pedido.getIdPedido());
        
        preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;        
    }

    @Override
    public List<Pedido> select() throws SQLException {
       List<Pedido> Pedidos = new ArrayList<>();

        conexao = Conexao.getInstance();

        Connection connection = (Connection) conexao.Conectar();

        String sql = "SELECT * FROM pedido";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultPedido = preparedStatement.executeQuery();

        while (resultPedido.next()) {

            Pedido p = new Pedido();

            p.setIdPedido(resultPedido.getInt("idPedido"));  //nome do campo

            p.setValorPedido(resultPedido.getDouble("ValorPedido"));

            p.setNomePedido(resultPedido.getString("nomePedido"));

            p.setDescricaoPedido(resultPedido.getString("DescricaoPedido"));

            Pedidos.add(p);

        }
        conexao.Desconectar();

        return Pedidos;
    }
    
}
