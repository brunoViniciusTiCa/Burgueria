/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.repositorio;

import burgueriarafael.basica.Funcionario;
import burgueriarafael.interfaces.CrudFuncionarioInterface;
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
public class FuncionarioRepositorio implements CrudFuncionarioInterface{
    
     Conexao conexao = new Conexao();

    @Override
    public boolean insert(Funcionario funcionario) throws SQLException {
        conexao = Conexao.getInstance();
        Connection connection = conexao.Conectar();
        
        String sql = "INSERT INTO Funcionario (cpfFuncionario,telefoneFuncionario,enderecoFuncionario,nomeFuncionario,sexoFuncionario)"
                + " VALUES(?,?,?,?,?)";
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql); 
       
        
        preparedStatement.setString(1 , funcionario.getCpfFuncionario());
        preparedStatement.setString(2, funcionario.getTelefoneFuncionario());
        preparedStatement.setString(3, funcionario.getEnderecoFuncionario());
        preparedStatement.setString(4, funcionario.getNomeFuncionario());
        preparedStatement.setString(5, funcionario.getSexoFuncionario());

        preparedStatement.executeUpdate();        
        
        conexao.Desconectar();
        return true;
        
    }

    @Override
    public boolean update(Funcionario funcionario) throws SQLException {
        
        conexao = Conexao.getInstance();
        
        Connection connection =  conexao.Conectar();
        
        String sql = "UPDATE funcionario set telefoneFuncionario = ?, enderecoFuncionario = ? "
                + "WHERE idFuncionario = ? ";
        
        PreparedStatement preparedstatemant = connection.prepareStatement(sql);
        
        
        preparedstatemant.setString(1, funcionario.getTelefoneFuncionario());
        preparedstatemant.setString(2, funcionario.getEnderecoFuncionario());
        preparedstatemant.setInt   (3, funcionario.getIdFuncionario());
        
        preparedstatemant.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean delete(Funcionario funcionario) throws SQLException {
       
        conexao.Conectar();
        
        Connection connection =  conexao.Conectar();
        
        String sql = "DELETE FROM funcionario WHERE idFuncionario = ?";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, funcionario.getIdFuncionario());
        
        preparedstatement.execute();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public List<Funcionario> select() throws SQLException {
        
        List<Funcionario> Funcionarios = new ArrayList<>();
       
        conexao = Conexao.getInstance();
       
        java.sql.Connection connection = conexao.Conectar();
        
        String sql = "Select * from Funcionario";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);

        ResultSet resultFuncionario = preparedstatement.executeQuery();
        
        while(resultFuncionario.next()) {
          
            Funcionario f = new Funcionario();
            
            f.setIdFuncionario(resultFuncionario.getInt("IdFuncionario"));
            f.setCpfFuncionario(resultFuncionario.getString("cpfFuncionario"));
            f.setTelefoneFuncionario(resultFuncionario.getString("telefoneFuncionario"));
            f.setEnderecoFuncionario(resultFuncionario.getString("enderecoFuncionario"));
            f.setNomeFuncionario(resultFuncionario.getString("nomeFuncionario"));
            f.setSexoFuncionario(resultFuncionario.getString("sexoFuncionario"));
           
            Funcionarios.add(f);
            
        }
        conexao.Desconectar();
        return Funcionarios;
    }

    @Override
    public List<Funcionario> selectByNomeFuncionario(Funcionario funcionario) throws SQLException, Exception {
       List<Funcionario> Funcionarios = new ArrayList<>();
       
        conexao = Conexao.getInstance();
       
        java.sql.Connection connection = conexao.Conectar();
        
        String sql = "Select * from Funcionario WHERE nomeFuncionario = ? ";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setString(1, funcionario.getNomeFuncionario());

        ResultSet resultFuncionario = preparedstatement.executeQuery();
        
        while(resultFuncionario.next()) {
          
            Funcionario f = new Funcionario();
            
            f.setIdFuncionario(resultFuncionario.getInt("IdFuncionario"));
            f.setCpfFuncionario(resultFuncionario.getString("cpfFuncionario"));
            f.setTelefoneFuncionario(resultFuncionario.getString("telefoneFuncionario"));
            f.setEnderecoFuncionario(resultFuncionario.getString("enderecoFuncionario"));
            f.setNomeFuncionario(resultFuncionario.getString("nomeFuncionario"));
            f.setSexoFuncionario(resultFuncionario.getString("sexoFuncionario"));
           
            Funcionarios.add(f);
            
        }
        conexao.Desconectar();
        return Funcionarios;
    }
    
        @Override
    public List<Funcionario> selectByCPFFuncionario(Funcionario funcionario) throws SQLException, Exception {
       List<Funcionario> Funcionarios = new ArrayList<>();
       
        conexao = Conexao.getInstance();
       
        java.sql.Connection connection = conexao.Conectar();
        
        String sql = "Select * from Funcionario WHERE cpfFuncionario = ? ";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setString(1, funcionario.getNomeFuncionario());

        ResultSet resultFuncionario = preparedstatement.executeQuery();
        
        while(resultFuncionario.next()) {
          
            Funcionario f = new Funcionario();
            
            f.setIdFuncionario(resultFuncionario.getInt("IdFuncionario"));
            f.setCpfFuncionario(resultFuncionario.getString("cpfFuncionario"));
            f.setTelefoneFuncionario(resultFuncionario.getString("telefoneFuncionario"));
            f.setEnderecoFuncionario(resultFuncionario.getString("enderecoFuncionario"));
            f.setNomeFuncionario(resultFuncionario.getString("nomeFuncionario"));
            f.setSexoFuncionario(resultFuncionario.getString("sexoFuncionario"));
           
            Funcionarios.add(f);
            
        }
        conexao.Desconectar();
        return Funcionarios;
    }
    
}
