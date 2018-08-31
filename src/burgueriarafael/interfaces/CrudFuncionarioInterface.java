/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.interfaces;

import burgueriarafael.basica.Funcionario;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudFuncionarioInterface {
    
    public boolean Insert(Funcionario funcionario) throws Exception;
    
    public boolean Update(Funcionario funcionario) throws Exception;
    
    public boolean Delete(Funcionario funcionario) throws Exception;
    
    public List<Funcionario> select() throws Exception;
    
}
