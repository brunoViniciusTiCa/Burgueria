/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.negocio;

import burgueriarafael.basica.Cliente;
import burgueriarafael.interfaces.CrudClienteInterface;
import burgueriarafael.repositorio.ClienteRepositorio;
import burgueriarafael.validacao.ExceptionMessage;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class ClienteNegocio implements CrudClienteInterface{

     ClienteRepositorio clienteRep = null;
    
     @Override
    public boolean insert(Cliente cliente) throws SQLException, Exception {
        
        validarCamposNullouVaziosClientes();
        
        clienteRep = new ClienteRepositorio();
        clienteRep.insert(cliente);
        
        return true;
    }

    @Override
    public boolean update(Cliente cliente) throws SQLException, Exception {
        validarCamposNullouVaziosClientes();
        
        clienteRep = new ClienteRepositorio();
        clienteRep.update(cliente);
        
        return true;
    }

    @Override
    public boolean delete(Cliente cliente) throws SQLException, Exception {
        validarCamposNullouVaziosClientes();
        
        clienteRep = new ClienteRepositorio();
        clienteRep.delete(cliente);
        
        return true;
    }

    @Override
    public List<Cliente> select() throws SQLException, Exception {
        clienteRep = new ClienteRepositorio();
        return clienteRep.select();
    }

    private void validarCamposNullouVaziosClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
