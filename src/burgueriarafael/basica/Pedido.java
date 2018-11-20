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
				statusDoPedido VARCHAR(10)  CHECK (statusDoPedido = 'ABERTO' OR statusDoPedido = 'FECHADO') ,
				valorProduto   DECIMAL NOT NULL,
                                nomeProduto Varchar(40)NOT NULL,
                                qtdProduto integer not null,
                                idProduto integer references Produto(idProduto)); */
    
    private int     idPedido;
    private String  statusDoPedido;
    private int     qtdProduto;
    private Produto produto = new Produto();

    /**
     * @return the qtdProduto
     */
    public int getQtdProduto() {
        return qtdProduto;
    }

    /**
     * @param qtdProduto the qtdProduto to set
     */
    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    
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
