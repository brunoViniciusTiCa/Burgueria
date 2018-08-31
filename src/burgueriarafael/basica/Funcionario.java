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
public class Funcionario {
    
      /* 
         CREATE TABLE Funcionario (idFuncionario INTEGER PRIMARY KEY,
                                   cpfFuncionario VARCHAR(15) NOT NULL,
                                   telefoneFuncionario VARCHAR(20) NOT NULL,
                                   enderecoFuncionario VARCHAR(40) NOT NULL,
                                   nomeFuncionario VARCHAR(40) NOT NULL,
                                   sexoFuncionario CHAR(1) DEFAULT('M'));
     */
    
   private int    idFuncionario;
   private String cpfFuncionario;
   private String telefoneFuncionario;
   private String enderecoFuncionario;
   private String nomeFuncionario;
   private String sexoFuncionario;

    /**
     * @return the idFuncionario
     */
    public int getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * @return the cpfFuncionario
     */
    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    /**
     * @param cpfFuncionario the cpfFuncionario to set
     */
    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    /**
     * @return the telefoneFuncionario
     */
    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    /**
     * @param telefoneFuncionario the telefoneFuncionario to set
     */
    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    /**
     * @return the enderecoFuncionario
     */
    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    /**
     * @param enderecoFuncionario the enderecoFuncionario to set
     */
    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    /**
     * @return the nomeFuncionario
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * @param nomeFuncionario the nomeFuncionario to set
     */
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    /**
     * @return the sexoFuncionario
     */
    public String getSexoFuncionario() {
        return sexoFuncionario;
    }

    /**
     * @param sexoFuncionario the sexoFuncionario to set
     */
    public void setSexoFuncionario(String sexoFuncionario) {
        this.sexoFuncionario = sexoFuncionario;
    }
}
