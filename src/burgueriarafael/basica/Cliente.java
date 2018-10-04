
package burgueriarafael.basica;

/**
 *
 * @author BrunoTiCaVini
 */
public class Cliente {
    
    /*
    Table Cliente (idCliente INTEGER PRIMARY KEY,
                   cpfCliente VARCHAR(15) NOT NULL,
                   telefoneCliente VARCHAR(20) NOT NULL,
                   enderecoCliente VARCHAR(40) NOT NULL,
                   nomeCliente VARCHAR(40),
                   sexoClient CHAR(1) DEFAULT('M'));
    */
    
    private int idCliente;
    private String cpfCliente;
    private String telefoneCliente;
    private String enderecoCliente;
    private String nomeCliente;
    private String sexoCliente;

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the cpfCliente
     */
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     * @param cpfCliente the cpfCliente to set
     */
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    /**
     * @return the telefoneCliente
     */
    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    /**
     * @param telefoneCliente the telefoneCliente to set
     */
    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    /**
     * @return the enderecoCliente
     */
    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    /**
     * @param enderecoCliente the enderecoCliente to set
     */
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the sexoClient
     */
    public String getSexoCliente() {
        return sexoCliente;
    }

    /**
     * @param sexoCliente the sexoClient to set
     */
    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    
}
