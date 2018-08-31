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
public class NotaFiscal {
    
    private int idNf;
    private Date dataNF;
    private Time horaNF;
    private Funcionario funcionario = new Funcionario();
    private Cliente cliente = new Cliente();
    private Produto produto = new Produto();
    private Pedido pedido = new Pedido();


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
     * @return the dataNF
     */
    public Date getDataNF() {
        return dataNF;
    }

    /**
     * @param dataNF the dataNF to set
     */
    public void setDataNF(Date dataNF) {
        this.dataNF = dataNF;
    }

    /**
     * @return the horaNF
     */
    public Time getHoraNF() {
        return horaNF;
    }

    /**
     * @param horaNF the horaNF to set
     */
    public void setHoraNF(Time horaNF) {
        this.horaNF = horaNF;
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
    
     /*CREATE TABLE NotaFiscal (idNF INTEGER PRIMARY KEY, 
			       dataNF DATE NOT NULL, 
			       horaNF TIME NOT NULL,
			       idFuncionario INTEGER REFERENCES Funcionario(idFuncionario),
			       idCliente INTEGER REFERENCES Cliente(idCliente), 
			       idProduto INTEGER REFERENCES Produto(idProduto),
			       idPedido  INTEGER REFERENCES Pedido(idPedido));*/
    
 
  
   
}
