/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.repositorio;

import burgueriarafael.basica.Funcionario;
import burgueriarafael.interfaces.CrudFuncionarioInterface;
import burgueriarafael.util.banco.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
       

/**
 *
 * @author BrunoTiCaVini
 */
public class FuncionarioRepositorio implements CrudFuncionarioInterface{
    
     Conexao conexao = new Conexao();

    @Override
    public boolean Insert(Funcionario funcionario) throws Exception {
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
        String sql = "INSERT INTO Funcionario (idFuncionario,cpfFuncionario,telefoneFuncionario,enderecoFuncionario,nomeFuncionario,sexoFuncionario VALUES(?,?,?,?,?,?))";
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql); 
       
        preparedStatement.setInt(1, funcionario.getIdFuncionario());
        preparedStatement.setString(2 , funcionario.getCpfFuncionario());
        preparedStatement.setString(3, funcionario.getTelefoneFuncionario());
        preparedStatement.setString(4, funcionario.getEnderecoFuncionario());
        preparedStatement.setString(5, funcionario.getNomeFuncionario());
        preparedStatement.setString(6, funcionario.getSexoFuncionario());

        preparedStatement.executeUpdate();        
        
        conexao.Desconectar();
        return true;
        
    }

    @Override
    public boolean Update(Funcionario funcionario) throws Exception {
        
        conexao.Conectar();
        
        Connection connection = conexao.Conectar();
        
        String sql = "UPDATE funcionario set idFuncionario = ?"
                + "telefoneFuncionario = ?, enderecoFuncionario = ?)";
        
        PreparedStatement preparedstatemant = connection.prepareStatement(sql);
        
        preparedstatemant.setInt(1, funcionario.getIdFuncionario());
        preparedstatemant.setString(2, funcionario.getTelefoneFuncionario());
        preparedstatemant.setString(3, funcionario.getEnderecoFuncionario());
        
        preparedstatemant.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean Delete(Funcionario funcionario) throws Exception {
       
        conexao.Conectar();
        
        Connection connection = conexao.Conectar();
        
        String sql = "DELETE funcionario Where idFuncionario = ?";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, funcionario.getIdFuncionario());
        
        preparedstatement.execute();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public List<Funcionario> select() throws Exception {
        
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
            
            conexao.Desconectar();
        
        }
        return Funcionarios;
    }
    
}
