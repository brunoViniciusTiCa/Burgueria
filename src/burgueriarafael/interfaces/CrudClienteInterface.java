/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.interfaces;

import burgueriarafael.basica.Cliente;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudClienteInterface {
    
    public boolean insert(Cliente cliente) throws SQLException, Exception;
    
    public boolean update(Cliente cliente) throws SQLException, Exception;
    
    public boolean delete(Cliente cliente) throws SQLException, Exception;
    
    public List<Cliente> select() throws SQLException, Exception;
    
    public List<Cliente> selectByNomeCliente(Cliente cliente)throws SQLException, Exception;
    
     public List<Cliente> selectByCpfCliente(Cliente cliente)throws SQLException, Exception;
     
     
}
