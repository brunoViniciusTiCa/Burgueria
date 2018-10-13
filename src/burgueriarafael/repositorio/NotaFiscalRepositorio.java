/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.repositorio;

import burgueriarafael.basica.NotaFiscal;
import burgueriarafael.interfaces.CrudNotaFiscalInterface;
import burgueriarafael.util.banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author BrunoTiCaVini
 */
public class NotaFiscalRepositorio implements CrudNotaFiscalInterface{

            Conexao conexao = null;
       
    @Override
    public boolean insert(NotaFiscal notafiscal) throws SQLException{
        
       conexao = Conexao.getInstance();
        
       Connection connection = conexao.Conectar();
        
       String sql = "INSERT INTO notafiscal (valorProduto, nomeProduto, valorTotal, quantidadeProduto, idCliente, idProduto, idPedido, idFuncionario) "
               + "VALUES (?,?,?,?,?,?,?,?)";
       
       PreparedStatement preparedstatement = connection.prepareStatement(sql);
       
       preparedstatement.setDouble(1,  notafiscal.getProduto().getValorProduto());
       preparedstatement.setString(2,  notafiscal.getProduto().getNomeProduto());
       preparedstatement.setDouble(3,  notafiscal.getValorTotal());
       preparedstatement.setInt   (4,  notafiscal.getQuantidadeProduto());
       preparedstatement.setInt   (5,  notafiscal.getCliente().getIdCliente());
       preparedstatement.setInt   (6,  notafiscal.getProduto().getIdProduto());
       preparedstatement.setInt   (7,  notafiscal.getPedido().getIdPedido());
       preparedstatement.setInt   (8,  notafiscal.getFuncionario().getIdFuncionario());
       
       preparedstatement.executeUpdate();
       
       conexao.Desconectar();
       
        return true;
    }

    @Override
    public boolean update(NotaFiscal notafiscal) throws SQLException {
        
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
        String sql = "UPDATE notafiscal SET nomeProduto = ?, statusDoPedido = ?, quantidadeProduto = ?"
                   + "WHERE idNF = ?";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
        preparedstatement.setString(1, notafiscal.getNomeProduto());
        preparedstatement.setInt   (2, notafiscal.getQuantidadeProduto());
        preparedstatement.setInt   (3, notafiscal.getIdNf());
        
        preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean delete(NotaFiscal notafiscal) throws SQLException {
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
        String sql = "DELETE FROM notafiscal WHERE idNF = ?";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, notafiscal.getIdNf());
        
        preparedstatement.execute();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public List<NotaFiscal> select() throws SQLException {
        
        List<NotaFiscal> NotaFiscais = new ArrayList<>();

        conexao = Conexao.getInstance();

        java.sql.Connection connection = conexao.Conectar();

        String sql = "SELECT * FROM NotaFiscal";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
       ResultSet resultNotaFiscal = preparedStatement.executeQuery();

        while (resultNotaFiscal.next()) {

            NotaFiscal nf = new NotaFiscal();

            nf.setIdNf(resultNotaFiscal.getInt("idNf")); 
            
            nf.setHoraData(resultNotaFiscal.getTimestamp("horaData"));
            
            nf.setValorProduto(resultNotaFiscal.getDouble("valorProduto"));
            
            nf.setNomeProduto(resultNotaFiscal.getString("nomeProduto"));
            
            nf.setValorTotal(resultNotaFiscal.getDouble("valorTotal"));   
            
            nf.setQuantidadeProduto(resultNotaFiscal.getInt("quantidadeProduto"));   
            
            nf.getCliente().setIdCliente(resultNotaFiscal.getInt("idCliente"));
            
            nf.getProduto().setIdProduto(resultNotaFiscal.getInt("idProduto"));
            
            nf.getPedido().setIdPedido(resultNotaFiscal.getInt("idPedido"));
            
            nf.getFuncionario().setIdFuncionario(resultNotaFiscal.getInt("idFuncionario"));
            
            NotaFiscais.add(nf);
            
            preparedStatement.execute();

        }
        conexao.Desconectar();

        return NotaFiscais;
    }

    @Override
    public List<NotaFiscal> selectById(NotaFiscal notafiscal) throws SQLException, Exception {
        
        List<NotaFiscal> NotaFiscais = new ArrayList<>();

        conexao = Conexao.getInstance();

        java.sql.Connection connection = conexao.Conectar();

        String sql = "SELECT * FROM notafiscal WHERE idNF = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setInt(1, notafiscal.getIdNf());
       
        ResultSet resultNotaFiscal = preparedStatement.executeQuery();
       
    while (resultNotaFiscal.next()) {

            NotaFiscal nf = new NotaFiscal();

            nf.setIdNf(resultNotaFiscal.getInt("idNf")); 
            
            nf.setHoraData(resultNotaFiscal.getTimestamp("horaData"));
            
            nf.setValorProduto(resultNotaFiscal.getDouble("valorProduto"));
            
            nf.setNomeProduto(resultNotaFiscal.getString("nomeProduto"));
            
            nf.setQuantidadeProduto(resultNotaFiscal.getInt("quantidadeProduto"));   
            
            nf.setNomeProduto(resultNotaFiscal.getString("nomeProduto"));
            
            nf.getCliente().setIdCliente(resultNotaFiscal.getInt("idCliente"));
            
            nf.getProduto().setIdProduto(resultNotaFiscal.getInt("idProduto"));
            
            nf.getPedido().setIdPedido(resultNotaFiscal.getInt("idPedido"));
            
            nf.getFuncionario().setIdFuncionario(resultNotaFiscal.getInt("idFuncionario"));
            
            NotaFiscais.add(nf);
            
            preparedStatement.execute();

        }
        conexao.Desconectar();

        return NotaFiscais;
    }

    @Override
    public List<NotaFiscal> selectByData(NotaFiscal notafiscal) throws SQLException, Exception {
         List<NotaFiscal> NotaFiscais = new ArrayList<>();

        conexao = Conexao.getInstance();

        java.sql.Connection connection = conexao.Conectar();

        String sql = "SELECT * FROM notafiscal WHERE DATANF_HORANF = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setTimestamp(1, notafiscal.getHoraData());
        
        ResultSet resultNotaFiscal = preparedStatement.executeQuery();
       
        while (resultNotaFiscal.next()) {

            NotaFiscal nf = new NotaFiscal();

            nf.setIdNf(resultNotaFiscal.getInt("idNf")); 
            
            nf.setHoraData(resultNotaFiscal.getTimestamp("horaData"));
            
            nf.setValorProduto(resultNotaFiscal.getDouble("valorProduto"));
            
            nf.setNomeProduto(resultNotaFiscal.getString("nomeProduto"));
            
            nf.setQuantidadeProduto(resultNotaFiscal.getInt("quantidadeProduto"));   
            
            nf.setNomeProduto(resultNotaFiscal.getString("nomeProduto"));
            
            nf.getCliente().setIdCliente(resultNotaFiscal.getInt("idCliente"));
            
            nf.getProduto().setIdProduto(resultNotaFiscal.getInt("idProduto"));
            
            nf.getPedido().setIdPedido(resultNotaFiscal.getInt("idPedido"));
            
            nf.getFuncionario().setIdFuncionario(resultNotaFiscal.getInt("idFuncionario"));
            
            NotaFiscais.add(nf);
            
            preparedStatement.execute();

        }
        conexao.Desconectar();

        return NotaFiscais;
    }
 }
    

