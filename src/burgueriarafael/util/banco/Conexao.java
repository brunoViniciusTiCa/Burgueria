/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.util.banco;

import burgueriarafael.interfaces.ConexaoInterface;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author BrunoTiCaVini
 */
public class Conexao implements ConexaoInterface{

    private  String  URL_BD;
    private  String  USUARIO_BD;
    private  String  SENHA_BD;
    private static Conexao instancia;
    private Connection conexaoBd;
    
    
    
   
      public Conexao() {
        ResourceBundle rb = ResourceBundle.getBundle("BurgueriaRafa.util.banco.configBD");
        URL_BD = rb.getString("URL");
        SENHA_BD = rb.getString("SENHA");
        USUARIO_BD = rb.getString("usuario");
        
    }

    public static Conexao getInstance(){
        if(instancia == null){
           instancia = new Conexao();
        }
        return instancia;
    }

    @Override
    public Connection Conectar() throws SQLException {
          //zerando a variavel de conexao
        conexaoBd = null;
        //Estabelecendo a conexao como banco de dados
        conexaoBd = (Connection) DriverManager.getConnection(URL_BD, USUARIO_BD, SENHA_BD);
        
        return conexaoBd;
    }

    @Override
    public void Desconectar() throws SQLException {
        if(conexaoBd != null){
            conexaoBd.close();
        }
    }
    
    
    
}
