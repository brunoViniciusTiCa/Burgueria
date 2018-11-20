/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.fachada;

import burgueriarafael.basica.Pedido;
import burgueriarafael.negocio.PedidoNegocio;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class PedidoFachada {
    
    PedidoNegocio pedidonegocio = null;
    
    public boolean salvarPedido(Pedido pedido) throws Exception{
      
        pedidonegocio = new PedidoNegocio();
        pedidonegocio.insert(pedido);
    
        return true;
    }
    
    public boolean alterarPedido(Pedido pedido) throws Exception{
      
        pedidonegocio = new PedidoNegocio();
        pedidonegocio.update(pedido);
        
        return true;
    }
    
    public boolean deletarPedido(Pedido pedido) throws Exception{
     
        pedidonegocio = new PedidoNegocio();
        pedidonegocio.delete(pedido);
    
        return true;
    }
    
    public List<Pedido> select() throws Exception {
    
        pedidonegocio = new PedidoNegocio();
        return pedidonegocio.select();
    
    
    }
}
