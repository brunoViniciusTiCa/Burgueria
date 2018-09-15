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
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author BrunoTiCaVini
 */
public class NotaFiscalRepositorio implements CrudNotaFiscalInterface{

      Conexao conexao = new Conexao();
       
    @Override
    public boolean insert(NotaFiscal notafiscal) throws SQLException {
        
        conexao = Conexao.getInstance();
        
        Connection connection = (Connection) conexao.Conectar();
        
       String sql = "INSERT INTO NotaFiscal(idNf, dataNF, horaNF, idFuncionario,idCliente,idPedido,idProduto)"
               + "VALUES (?,?,?,?,?,?,?)";
       
       PreparedStatement preparedstatement = connection.prepareCall(sql);
       
       preparedstatement.setInt(1, notafiscal.getIdNf());
       preparedstatement.setDate(2, notafiscal.getDataNF());
       preparedstatement.setTime(3, notafiscal.getHoraNF());
       preparedstatement.setInt(4,  notafiscal.getFuncionario().getIdFuncionario());
       preparedstatement.setInt(5, notafiscal.getCliente().getIdCliente());
       preparedstatement.setInt(6, notafiscal.getPedido().getIdPedido());
       preparedstatement.setInt(7, notafiscal.getProduto().getIdProduto());
       
       preparedstatement.executeUpdate();
       
        return true;
    }

    @Override
    public boolean update(NotaFiscal notafiscal) throws SQLException {
        
        conexao = Conexao.getInstance();
        
        Connection connection = (Connection) conexao.Conectar();
        // funcionario, cliente, produto, pedido
        String sql = "UPDATE nota fiscal set idNf = ?, funcionario = ?, cliente = ? , produto = ?, pedido = ?";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
         
        preparedstatement.setInt   (1, notafiscal.getIdNf());
        preparedstatement.setString(2 , notafiscal.getFuncionario().getNomeFuncionario());
        preparedstatement.setString(3, notafiscal.getCliente().getNomeCliente());
        preparedstatement.setString(4, notafiscal.getProduto().getDescricaoProduto());
        preparedstatement.setString(5, notafiscal.getPedido().getNomePedido());
        
        preparedstatement.executeUpdate();
        
        return true;
    }

    @Override
    public boolean delete(NotaFiscal notafiscal) throws SQLException {
        conexao = Conexao.getInstance();
        
        Connection connection = (Connection) conexao.Conectar();
        
        String sql = "DELETE FROM nota fiscal WHERE idNF = ?";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, notafiscal.getIdNf());
        
        preparedstatement.execute();
        
        return true;
    }

    @Override
    public List<NotaFiscal> select() throws SQLException {
        List<NotaFiscal> NotaFiscais = new ArrayList<>();

        conexao = Conexao.getInstance();

        Connection connection = (Connection) conexao.Conectar();

        String sql = "SELECT * FROM notafiscal";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultNotaFiscal = preparedStatement.executeQuery();

        while (resultNotaFiscal.next()) {

            NotaFiscal nf = new NotaFiscal();

            nf.setIdNf(resultNotaFiscal.getInt("idNf")); 

            nf.setDataNF(resultNotaFiscal.getDate("dataNF"));

            nf.setHoraNF(resultNotaFiscal.getTime("horaNF"));

            nf.getFuncionario().setIdFuncionario(resultNotaFiscal.getInt("idFuncionario"));
            
            nf.getCliente().setIdCliente(resultNotaFiscal.getInt("idCliente"));
            
            nf.getProduto().setIdProduto(resultNotaFiscal.getInt("idProduto"));
            
            nf.getPedido().setIdPedido(resultNotaFiscal.getInt("idPedido"));
            
            NotaFiscais.add(nf);
            
            preparedStatement.execute();

        }
        conexao.Desconectar();

        return NotaFiscais;
    }
 }
    

