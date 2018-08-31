/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.basica;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author BrunoTiCaVini
 */
public class Produto {

       /*CREATE TABLE Pedido   (idPedido INTEGER PRIMARY KEY,
			     dataPedido DATE NOT NULL, 
			     descricaoProduto VARCHAR(60) NOT NULL,
			     statusDoPedido CHAR(1) NOT NULL,
			     horaDoPedido TIME NOT NULL,
			     idCliente INTEGER REFERENCES Cliente(idCliente));*/
    
     private int idProduto;
     private Date dataProduto;
     private String descricaoProduto;
     private String statusDoProduto;
     private Time horaDoPruduto;
     private Cliente cliente = new Cliente();
    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the dataProduto
     */
    public Date getDataProduto() {
        return dataProduto;
    }

    /**
     * @param dataProduto the dataProduto to set
     */
    public void setDataProduto(Date dataProduto) {
        this.dataProduto = dataProduto;
    }

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    /**
     * @return the statusDoProduto
     */
    public String getStatusDoProduto() {
        return statusDoProduto;
    }

    /**
     * @param statusDoProduto the statusDoProduto to set
     */
    public void setStatusDoProduto(String statusDoProduto) {
        this.statusDoProduto = statusDoProduto;
    }

    /**
     * @return the horaDoPruduto
     */
    public Time getHoraDoPruduto() {
        return horaDoPruduto;
    }

    /**
     * @param horaDoPruduto the horaDoPruduto to set
     */
    public void setHoraDoPruduto(Time horaDoPruduto) {
        this.horaDoPruduto = horaDoPruduto;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
  


}
