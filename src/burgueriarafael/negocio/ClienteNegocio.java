/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.negocio;

import burgueriarafael.basica.Cliente;
import burgueriarafael.interfaces.CrudClienteInterface;
import burgueriarafael.repositorio.ClienteRepositorio;
import burgueriarafael.validacao.ExceptionMessage.ExceptionMessageCliente;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class ClienteNegocio implements CrudClienteInterface {
    
    private final ClienteRepositorio clienteRepositorio;
    
    public ClienteNegocio(){
      clienteRepositorio = new ClienteRepositorio();
    }

    @Override
    public boolean insert(Cliente cliente) throws SQLException, Exception {
        return clienteRepositorio.insert(cliente);
    }

    @Override
    public boolean update(Cliente cliente) throws SQLException, Exception {
        return clienteRepositorio.update(cliente);
       
    }

    @Override
    public boolean delete(Cliente cliente) throws SQLException, Exception {
        if(!validarId(cliente)){
        throw new Exception("Cpf nulo" + ExceptionMessageCliente.VALIDAR_ID_CLIENTA);
        }
        if(! clienteRepositorio.isCpfExistenteCliente(cliente)){
        throw new Exception("Cliente já existe" + ExceptionMessageCliente.CLIENTE_NAO_EXISTE);
        }
        return clienteRepositorio.delete(cliente); 
    }

    @Override
    public List<Cliente> select() throws SQLException, Exception {
      return clienteRepositorio.select();
    }

    @Override
    public List<Cliente> selectByNomeCliente(Cliente cliente) throws SQLException, Exception {
        validarNomeCliente(cliente);
        return clienteRepositorio.selectByNomeCliente(cliente);
    }

    @Override
    public List<Cliente> selectByCpfCliente(Cliente cliente) throws SQLException, Exception {
        validarCpfNullVazio(cliente); 
        return clienteRepositorio.selectByNomeCliente(cliente);
    }
    
     
    public boolean validarId(Cliente cliente) throws SQLException, Exception{
     
      return clienteRepositorio.isIdCliente(cliente);
    }
    
    
    public boolean isCpfExistente(Cliente cliente) throws SQLException, Exception {
        validarCpfNullVazio(cliente);
        return clienteRepositorio.isCpfExistenteCliente(cliente);
    }
    
    /** Daqui em diante apenas validações dos atributos da entidade Cliente, Validando campos
     *  @Cliente 
     */
    private boolean validarCpfNullVazio(Cliente cliente) throws Exception {
        
        if(cliente.getCpfCliente() == null) {
          throw new Exception("Cpf nulo" + ExceptionMessageCliente.CPF_CLIENTE_NULL);
         }
         if(cliente.getCpfCliente().isEmpty()){
          throw new Exception("Cpf Vazio" + ExceptionMessageCliente.CPF_CLIENTE_VAZIO);
         }
         if(cliente.getCpfCliente().length() != 11){
         throw new Exception("Tamanhao de cpf invalido." + ExceptionMessageCliente.CPF_CLIENTE_TAMANHO);
         }
         return true;
    }
    
    public boolean validarTelefoneNullVazio(Cliente cliente) throws Exception{
         
        if(cliente.getTelefoneCliente() == null){
        throw new Exception("Telefone nulo" + ExceptionMessageCliente.TELEFONE_CLIENTE_NULL);
        }
        if(cliente.getTelefoneCliente().isEmpty()){
        throw new Exception("Telefone vazio" + ExceptionMessageCliente.TELEFONE_CLIENTE_VAZIO);
        }
        if(cliente.getTelefoneCliente().length() != 11){
        throw new Exception("Tamanho do telefone invalido." + ExceptionMessageCliente.TELEFONE_CLIENTE_TAMANHO);    
        }
        return true;
    }
    
    public boolean validarEnderecoNullVazio(Cliente cliente) throws Exception {
    
        if(cliente.getEnderecoCliente() == null){
        throw new Exception("Endereço nulo" + ExceptionMessageCliente.ENDERECO_CLIENTE_NULL);    
        }
        if(cliente.getEnderecoCliente().isEmpty()){
        throw new Exception("Endereço vazio" + ExceptionMessageCliente.CPF_CLIENTE_VAZIO);
        }
        if(cliente.getEnderecoCliente().length() != 40){
        throw new Exception("Endereço vazio" + ExceptionMessageCliente.ENDERECO_CLIENTE_TAMANHO);
        }
        return true;
    } 
    
    public boolean validarNomeCliente(Cliente cliente) throws Exception {
        
        if(cliente.getNomeCliente() == null){
        throw new Exception("Nome nulo" + ExceptionMessageCliente.NOME_CLIENTE_NULL);
        }
        if(cliente.getNomeCliente().isEmpty()){
        throw new Exception("Nome Vazio" + ExceptionMessageCliente.NOME_CLIENTE_VAZIO);
        }
        return true;
    }
    
    public boolean validarSexoCliente(Cliente cliente) throws Exception{
       
        if(cliente.getSexoCliente() == null){
        throw new Exception("Sexo nulo" + ExceptionMessageCliente.SEXO_CLIENTE_NULL);
        }
        if(cliente.getSexoCliente().isEmpty()){
        throw new Exception("Sexo vazio" + ExceptionMessageCliente.SEXO_CLIENTE_VAZIO);
        }
        if(cliente.getSexoCliente().length() != 1){
        throw new Exception("Sexo tamho excedente" + ExceptionMessageCliente.SEXO_CLIENTE_TAMANHO);
        }
        if((cliente.getSexoCliente() != "M") || (cliente.getSexoCliente()!= "F")){
         throw new Exception("sexo M ou F" + ExceptionMessageCliente.SEXO_CLIENTE_M_OU_F);
        }
        return true;
    }
    
   
}
