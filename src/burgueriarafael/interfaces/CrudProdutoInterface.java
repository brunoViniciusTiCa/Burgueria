/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.interfaces;

import burgueriarafael.basica.Produto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudProdutoInterface {
    
    public boolean insert(Produto produto) throws SQLException, Exception;
    
    public boolean update(Produto produto) throws SQLException, Exception;
    
    public boolean delete(Produto produto) throws SQLException, Exception;
    
    public List<Produto> select() throws SQLException, Exception;
    
}
