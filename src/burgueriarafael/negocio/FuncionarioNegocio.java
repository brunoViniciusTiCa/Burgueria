/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.negocio;

import burgueriarafael.basica.Funcionario;
import burgueriarafael.interfaces.CrudFuncionarioInterface;
import burgueriarafael.repositorio.FuncionarioRepositorio;
import burgueriarafael.validacao.ExceptionMessage.ExceptionMessageFuncionario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class FuncionarioNegocio implements CrudFuncionarioInterface{
   
    private final FuncionarioRepositorio funcionarioRepositorio;
    
    public FuncionarioNegocio(){
       funcionarioRepositorio = new FuncionarioRepositorio();
    }

    @Override
    public boolean insert(Funcionario funcionario) throws SQLException, Exception {
        return funcionarioRepositorio.insert(funcionario);
    }

    @Override
    public boolean update(Funcionario funcionario) throws SQLException, Exception {
        return funcionarioRepositorio.update(funcionario);
    }

    @Override
    public boolean delete(Funcionario funcionario) throws SQLException, Exception {
        return funcionarioRepositorio.delete(funcionario);
    }

    @Override
    public List<Funcionario> select() throws SQLException, Exception {
        return funcionarioRepositorio.select();
    }

    @Override
    public List<Funcionario> selectByIdFuncionario(Funcionario funcionario) throws SQLException, Exception {
        return funcionarioRepositorio.selectByIdFuncionario(funcionario);
    }

    @Override
    public List<Funcionario> selectByNomeFuncionario(Funcionario funcionario) throws SQLException, Exception {
        return funcionarioRepositorio.selectByNomeFuncionario(funcionario);
    }
    
    public boolean validarCpfFuncionario(Funcionario funcionario) throws Exception{
    
        if(funcionario.getCpfFuncionario() == null) {
         throw new Exception("Cpf nulo" + ExceptionMessageFuncionario.CPF_FUNCIONARIO_NULL);
        } 
        if(funcionario.getCpfFuncionario().isEmpty()){
        throw new Exception("Cpf Vazio" + ExceptionMessageFuncionario.CPF_FUNCIONARIO_VAZIO);
        }
        if(funcionario.getCpfFuncionario().length() != 11){
        throw new Exception("Cpf tamanhao" + ExceptionMessageFuncionario.CPF_FUNCIONARIO_TAMANHO);
        }
        return true;
    }
    
    public boolean validarTelefoneFuncionario(Funcionario funcionario) throws Exception{
    
        if(funcionario.getTelefoneFuncionario() == null) {
        throw new Exception("Telefone Nulo" + ExceptionMessageFuncionario.TELEFONE_FUNCIONARIO_NULL);
        }
        if(funcionario.getTelefoneFuncionario().isEmpty()){
        throw new Exception("Telefone Vazio" + ExceptionMessageFuncionario.TELEFONE_FUNCIONARIO_VAZIO);
        }
        if(funcionario.getTelefoneFuncionario().length() != 11){
        throw new Exception("Tamanho telefone" + ExceptionMessageFuncionario.TELEFONE_FUNCIONARIO_TAMANHAO);
        }
        
        return true;
    }
    
    public boolean validarEnderecoFuncionario(Funcionario funcionario) throws Exception{
    
        if(funcionario.getEnderecoFuncionario() == null){
        throw new Exception("Endereco nulo" + ExceptionMessageFuncionario.ENDERECO_FUNCIONAR_NULL);
        }
        if(funcionario.getEnderecoFuncionario().isEmpty()){
        throw new Exception("Endereco vazio" + ExceptionMessageFuncionario.ENDERCO_FUNCIOANARIO_VAZIO);
        }
        if(funcionario.getEnderecoFuncionario().length() != 40){
        throw new Exception("Tamanho endereço" + ExceptionMessageFuncionario.ENDERCO_FUNCIOANARIO_TAMANHO);
        }
        return true;
    }
    
    public boolean validarNomeFuncionario(Funcionario funcionario) throws Exception {
    
        if(funcionario.getNomeFuncionario() == null){
        throw new Exception("Nome nulo" + ExceptionMessageFuncionario.NOME_FUNCIONARIO_NULL);
        }
        if(funcionario.getNomeFuncionario().isEmpty()){
        throw new Exception("Nome Vazio" + ExceptionMessageFuncionario.NOME_FUNCIONARIO_VAZIO);
        }
        if(funcionario.getNomeFuncionario().length() != 40){
        throw new Exception("Nome Vazio" + ExceptionMessageFuncionario.NOME_FUNCIONARIO_TAMANHO);
        }
        return true;
    } 
    
    public boolean valildarSexoFuncionario(Funcionario funcionario) throws Exception {
    
        if(funcionario.getSexoFuncionario() == null){
        throw new Exception("Sexo nulo" + ExceptionMessageFuncionario.SEXO_FUNCIONARIO_NULL);
        }
        if(funcionario.getSexoFuncionario().isEmpty()){
        throw new Exception("Sexo Vazi" + ExceptionMessageFuncionario.SEXO_FUNCIONARIO_VAZIO);
        }
        if(funcionario.getSexoFuncionario().length() != 1){
        throw new Exception("Quantidade de Caracteres" + ExceptionMessageFuncionario.SEXO_FUNCIONARIO_TAMANHO);
        }
    
        return true;
    }
    
    
    
}
