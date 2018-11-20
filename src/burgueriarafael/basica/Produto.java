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
public class Produto{ 
    
      /*CREATE TABLE Produto   (idProduto INTEGER PRIMARY KEY AUTO_INCREMENT,
                                valorProduto DOUBLE NOT NULL,
			        nomeProduto Varchar(40)NOT NULL,
                                descricaoProduto VARCHAR(50) NOT NULL);*/
    
     private int idProduto;
     private double valorProduto;
     private String nomeProduto;
     private String descricaoProduto;
     

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
     * @return the valorProduto
     */
    public double getValorProduto() {
        return valorProduto;
    }

    /**
     * @param valorProduto the valorProduto to set
     */
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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
    

        
   
     
}
