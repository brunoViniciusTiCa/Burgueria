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
   
        Conexao conexao = new Conexao();
    @Override
    public boolean insert(Produto produto) throws SQLException {
        conexao = Conexao.getInstance();
        
        Connection connection = (Connection) conexao.Conectar();
        
        String sql = "INSERT INTO produto (idProduto, dataProduto, descricaoProduto, statusDoProduto,horaDoPruduto, idCliente)"
                + "(?,?,?,?,?,?)";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, produto.getIdProduto());
        preparedstatement.setDate(2, produto.getDataProduto());
        preparedstatement.setString(3, produto.getDescricaoProduto());
        preparedstatement.setString(4, produto.getStatusDoProduto());
        preparedstatement.setTime(5, produto.getHoraDoPruduto());
        preparedstatement.setInt(6, produto.getCliente().getIdCliente());
        
        preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean update(Produto produto) throws SQLException {
        
        conexao = Conexao.getInstance();
        
        Connection connection = (Connection) conexao.Conectar();
       
        String sql = "UPDATE produto set idproduto = ? , dataProduto = ?, descricaoProduto = ?, statusDoProduto = ?,"
                + "horaDoPruduto = ?";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, produto.getIdProduto());
        preparedstatement.setDate(2, produto.getDataProduto());
        preparedstatement.setString(3, produto.getDescricaoProduto());
        preparedstatement.setString(4, produto.getStatusDoProduto());
        preparedstatement.setTime(5, produto.getHoraDoPruduto());
        
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

        Connection connection = (Connection) conexao.Conectar();

        String sql = "SELECT * FROM produto";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultProduto = preparedStatement.executeQuery();

        while (resultProduto.next()) {

            Produto p = new Produto();

            p.setIdProduto(resultProduto.getInt("idProduto"));  

            p.setDataProduto(resultProduto.getDate("dataProduto"));

            p.setDescricaoProduto(resultProduto.getString("descricaoProduto"));

            p.setStatusDoProduto(resultProduto.getString("statusDoProduto"));
            
            p.setHoraDoPruduto(resultProduto.getTime("horaDoPruduto"));

            p.getCliente().setIdCliente(resultProduto.getInt("idCliente"));

            Produtos.add(p);

        }
        conexao.Desconectar();

        return Produtos;

    }
    
}
