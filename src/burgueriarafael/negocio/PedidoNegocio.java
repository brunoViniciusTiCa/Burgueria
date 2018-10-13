/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.negocio;

import burgueriarafael.basica.Pedido;
import burgueriarafael.basica.Produto;
import burgueriarafael.interfaces.CrudPedidoInterface;
import burgueriarafael.repositorio.PedidoRepositorio;
import burgueriarafael.validacao.ExceptionMessage.ExceptionMessagePedido;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author BrunoTiCaVini
 */
public class PedidoNegocio implements CrudPedidoInterface{

    private final PedidoRepositorio pedidoRepositorio;
    
    public PedidoNegocio(){
      pedidoRepositorio = new PedidoRepositorio();
    }
    
    @Override
    public boolean insert(Pedido pedido) throws SQLException, Exception {
        return pedidoRepositorio.insert(pedido);
    }

    @Override
    public boolean update(Pedido pedido) throws SQLException, Exception {
       return pedidoRepositorio.update(pedido);
    }

    @Override
    public boolean delete(Pedido pedido) throws SQLException, Exception {
        
        /**Fazer validação ainda referente ao ID... igual na Entidade Cliente!*/
        
        return pedidoRepositorio.delete(pedido);
    }

    @Override
    public List<Pedido> select() throws SQLException, Exception {
        return pedidoRepositorio.select();
    }
    
   
    
    public boolean itensDoPedido(Pedido pedido) throws Exception{
    
        if(pedido.getItemsPedido() == null){
        throw new Exception("Itens Nulo" + ExceptionMessagePedido.ITENS_PEDIDO_NULL);
        }
        if(pedido.getItemsPedido().isEmpty()){
        throw new Exception("Itens vazio" + ExceptionMessagePedido.ITENS_PEDIDO_VAZIO);
        }
        return true;
    }
    
    public boolean statusDoPedido(Pedido pedido) throws Exception{
    
        if(pedido.getStatusDoPedido() == null){
        throw new Exception("Status nulo" + ExceptionMessagePedido.STATUS_PEDIDO_VAZIO);    
        }    
        if(pedido.getStatusDoPedido().isEmpty()){
        throw new Exception("Status vazio" + ExceptionMessagePedido.STATUS_PEDIDO_NULO);
        }
        return true;
    }
   
    
    
}
