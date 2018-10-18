/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.fachada;


import burgueriarafael.basica.Funcionario;
import burgueriarafael.negocio.FuncionarioNegocio;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class FuncionarioFachada {
    
    FuncionarioNegocio funcionarionegocio = null;
    
    public boolean inserirFuncionario(Funcionario funcionario) throws Exception{
    
         funcionarionegocio = new FuncionarioNegocio();
         funcionarionegocio.insert(funcionario);
        
         return true;
    }
    
    public boolean alterarFuncionario(Funcionario funcionario) throws Exception{
    
        funcionarionegocio = new FuncionarioNegocio();
        funcionarionegocio.update(funcionario);
        
        return true;
    }
    public boolean deletarFuncionario(Funcionario funcionario) throws Exception {
     
        funcionarionegocio = new FuncionarioNegocio();
        funcionarionegocio.delete(funcionario);
     
        return true;
    }
    
    public List<Funcionario> consultarFuncionario() throws Exception {
            
           funcionarionegocio = new FuncionarioNegocio();
           return funcionarionegocio.select();
    }
    
    public boolean selectByIdFuncionario (Funcionario funcionario) throws Exception {
    
       funcionarionegocio = new FuncionarioNegocio();
       //funcionarionegocio.selectByIdFuncionario(funcionario);
        
        return true;
    }
    
    public boolean selectByNomeFuncionario (Funcionario funcionario) throws Exception {
    
        funcionarionegocio = new FuncionarioNegocio();
        funcionarionegocio.selectByNomeFuncionario(funcionario);
        
        return true;
    }
    
}
