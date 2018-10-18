/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.interfaces;

import burgueriarafael.basica.Funcionario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudFuncionarioInterface {
    
    public boolean insert(Funcionario funcionario) throws SQLException, Exception;
    
    public boolean update(Funcionario funcionario) throws SQLException, Exception;
    
    public boolean delete(Funcionario funcionario) throws SQLException, Exception;
    
    public List<Funcionario> select() throws SQLException, Exception;
    
    public List<Funcionario> selectByNomeFuncionario(Funcionario funcionario) throws SQLException, Exception;
    
    public List<Funcionario> selectByCPFFuncionario(Funcionario funcionario) throws SQLException, Exception;
    
    
}
