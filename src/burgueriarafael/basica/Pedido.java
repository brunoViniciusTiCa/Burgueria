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
          /*CREATE TABLE Produto (idProduto INTEGER PRIMARY KEY,
                            valorProduto MONEY NOT NULL,
		            nomeProduto Varchar(40)NOT NULL,
    			    descricaoProduto VARCHAR(50) NOT NULL); */
    
    private int idPedido;
    private double valorPedido;
    private String nomePedido;
    private String descricaoPedido;

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
     * @return the valorPedido
     */
    public double getValorPedido() {
        return valorPedido;
    }

    /**
     * @param valorPedido the valorPedido to set
     */
    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    /**
     * @return the nomePedido
     */
    public String getNomePedido() {
        return nomePedido;
    }

    /**
     * @param nomePedido the nomePedido to set
     */
    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    /**
     * @return the descricaoPedido
     */
    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    /**
     * @param descricaoPedido the descricaoPedido to set
     */
    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }
    


   
}
