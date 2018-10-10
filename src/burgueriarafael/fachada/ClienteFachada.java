/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.fachada;

import burgueriarafael.basica.Cliente;
import burgueriarafael.negocio.ClienteNegocio;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class ClienteFachada {
    
    ClienteNegocio clientenegocio = null;
    
    
    public boolean salvaCliente(Cliente cliente) throws Exception {
     clientenegocio = new ClienteNegocio();
     clientenegocio.insert(cliente);
     
     return true;
    }
    
    public boolean alterarCliente(Cliente cliente) throws Exception {
    clientenegocio = new ClienteNegocio();
    clientenegocio.update(cliente);
    
    return true;
    }
    
    public boolean deletarCliente(Cliente cliente) throws Exception {
    clientenegocio = new ClienteNegocio();
    clientenegocio.delete(cliente);
    
    return true;
    }
    
    public List<Cliente> consultarCliente() throws Exception {
    
        clientenegocio = new ClienteNegocio();
        return clientenegocio.select();
        
    }
}
