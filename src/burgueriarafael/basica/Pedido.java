/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.basica;

/**
 *
 * @author BrunoTiCaVini
 */
public class Pedido {
    
       
      /*CREATE TABLE Pedido     (idPedido INTEGER PRIMARY KEY AUTO_INCREMENT,
			       ItemsPedido VARCHAR(40) NOT NULL,
			       StatusDoPedido VARCHAR(1)  CHECK (statusDoPedido = 'ABERTO' OR statusDoPedido = 'FECHADO') ,
			       ValorProduto DECIMAL NOT NULL);*/
    
    private int    idPedido;
    private String itemsPedido;
    private String statusDoPedido;
    private Produto produto = new Produto();

    /**
     * @return the idPedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the itemsPedido
     */
    public String getItemsPedido() {
        return itemsPedido;
    }

    /**
     * @param itemsPedido the itemsPedido to set
     */
    public void setItemsPedido(String itemsPedido) {
        this.itemsPedido = itemsPedido;
    }

    /**
     * @return the statusDoPedido
     */
    public String getStatusDoPedido() {
        return statusDoPedido;
    }

    /**
     * @param statusDoPedido the statusDoPedido to set
     */
    public void setStatusDoPedido(String statusDoPedido) {
        this.statusDoPedido = statusDoPedido;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    

 
 


   
    
   
    
}
