/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.basica;

import java.sql.Timestamp;




/**
 *
 * @author BrunoTiCaVini
 */
public class NotaFiscal {
    
          /*CREATE TABLE NotaFiscal (idNF    INTEGER PRIMARY KEY AUTO_INCREMENT, 
			   DATANF TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                           valorProduto DECIMAL NOT NULL,
                           nomeProduto  VARCHAR (40) NOT NULL,
                           valorTotal DECIMAL NOT NULL,
			   statusDoPedido CHAR(1) CHECK (statusDoPedido = 'A' OR statusDoPedido = 'F'),
			   quantidadeProduto INTEGER NOT NULL,
			   idCliente  INTEGER REFERENCES Cliente(idCliente),
			   idProduto  INTEGER REFERENCES Produto(idProduto),
                           idFuncionario INTEGER REFERENCES Funcionario(idFuncionario));
						 */

    private int idNf;
    private Timestamp horaData;
    private Double valorProduto;
    private String nomeProduto;
    private Double valorTotal;
    private int quantidadeProduto;
    private Cliente cliente = new Cliente();
    private Produto produto = new Produto();
    private Pedido pedido = new Pedido();
    private Funcionario funcionario = new Funcionario();
    
    NotaFiscal Nf = new NotaFiscal();
    
    
    public String toString(){
    
       return "Nota Fiscal: " + this.Nf;
        
    }

    /**
     * @return the idNf
     */
    public int getIdNf() {
        return idNf;
    }

    /**
     * @param idNf the idNf to set
     */
    public void setIdNf(int idNf) {
        this.idNf = idNf;
    }

    /**
     * @return the horaData
     */
    public Timestamp getHoraData() {
        return horaData;
    }

    /**
     * @param horaData the horaData to set
     */
    public void setHoraData(Timestamp horaData) {
        this.horaData = horaData;
    }

    /**
     * @return the valorProduto
     */
    public Double getValorProduto() {
        return valorProduto;
    }

    /**
     * @param valorProduto the valorProduto to set
     */
    public void setValorProduto(Double valorProduto) {
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
     * @return the valorTotal
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the quantidadeProduto
     */
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    /**
     * @param quantidadeProduto the quantidadeProduto to set
     */
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
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

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
