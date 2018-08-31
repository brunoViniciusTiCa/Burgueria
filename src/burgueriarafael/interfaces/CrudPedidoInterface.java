/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.interfaces;

import burgueriarafael.basica.Pedido;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudPedidoInterface {
   
    public boolean Insert(Pedido pedido) throws Exception;
    
    public boolean Update(Pedido pedido) throws Exception;
    
    public boolean Delete(Pedido pedido) throws Exception;
    
    public List<Pedido> select() throws Exception;
   
}
