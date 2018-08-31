/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.interfaces;

import burgueriarafael.basica.Cliente;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudClienteInterface {
    
    public boolean Insert(Cliente Cliente) throws Exception;
    
    public boolean Update(Cliente cliente) throws Exception;
    
    public boolean Delete(Cliente cliente) throws Exception;
    
    public List<Cliente> select() throws Exception;
}
