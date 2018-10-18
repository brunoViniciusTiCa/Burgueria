/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.repositorio;

import burgueriarafael.basica.Produto;
import burgueriarafael.interfaces.CrudProdutoInterface;
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
public class ProdutoRepositorio implements CrudProdutoInterface{
   
        Conexao conexao = null;
    
        @Override
    public boolean insert(Produto produto) throws SQLException {
        
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
        String sql = "INSERT INTO produto ( valorProduto, nomeProduto, descricaoProduto ) VALUES"
                + "(?,?,?)";
        
       PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setDouble  (1, produto.getValorProduto());
        preparedstatement.setString  (2, produto.getNomeProduto());
        preparedstatement.setString  (3, produto.getDescricaoProduto());
        
        
        
        preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean update(Produto produto) throws SQLException {
        
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
       
        String sql = "UPDATE produto SET valorProduto = ?, nomeProduto = ?, descricaoProduto = ?"
                + "WHERE idProduto = ?" ;
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setDouble(1, produto.getValorProduto());
        preparedstatement.setString(2, produto.getNomeProduto());
        preparedstatement.setString(3, produto.getDescricaoProduto());
        preparedstatement.setInt(4, produto.getIdProduto());
        
        preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean delete(Produto produto) throws SQLException {
        
        conexao = Conexao.getInstance();
        
        Connection connection = (Connection) conexao.Conectar();
        
        String sql = ("DELETE FROM produto WHERE idproduto = ?");
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, produto.getIdProduto());
        
        preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public List<Produto> select() throws SQLException {
       
        List<Produto> Produtos = new ArrayList<>();

        conexao = Conexao.getInstance();

        java.sql.Connection connection = conexao.Conectar();

        String sql = "SELECT * FROM Produto";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultProduto = preparedStatement.executeQuery();

        while (resultProduto.next()) {

           Produto p = new Produto();

            p.setIdProduto(resultProduto.getInt("idProduto"));  

            p.setValorProduto(resultProduto.getDouble("valorProduto"));

            p.setNomeProduto(resultProduto.getString("nomeProduto"));

            p.setDescricaoProduto(resultProduto.getString("descricaoProduto"));
            
            Produtos.add(p);

        }
        conexao.Desconectar();
        
        return Produtos;

    }

   
    @Override
    public List<Produto> selectByNomeProduto(Produto produto) throws SQLException, Exception {
      
        List<Produto> Produtos = new ArrayList<>();

        conexao = Conexao.getInstance();

        java.sql.Connection connection = conexao.Conectar();

        String sql = "SELECT * FROM produto WHERE nomeProduto = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setString(1, produto.getNomeProduto());

        ResultSet resultProduto = preparedStatement.executeQuery();

        while (resultProduto.next()) {

            Produto p = new Produto();

            p.setIdProduto(resultProduto.getInt("idProduto"));  

            p.setValorProduto(resultProduto.getDouble("valorProduto"));

            p.setNomeProduto(resultProduto.getString("nomeProduto"));

            p.setDescricaoProduto(resultProduto.getString("descricaoProduto"));
            
            Produtos.add(p);

        }
        conexao.Desconectar();
       
        return Produtos;
    }
    
}
