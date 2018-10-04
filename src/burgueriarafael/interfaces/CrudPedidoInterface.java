/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.interfaces;

import burgueriarafael.basica.Pedido;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudPedidoInterface  {
    
    public  boolean insert(Pedido pedido) throws SQLException, Exception;
    
    public boolean update(Pedido pedido) throws SQLException, Exception;
    
    public boolean delete(Pedido pedido) throws SQLException, Exception;
    
    public List<Pedido> select() throws SQLException, Exception;
    

}
