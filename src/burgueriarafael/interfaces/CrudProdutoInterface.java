/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.interfaces;

import burgueriarafael.basica.Produto;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudProdutoInterface {
    
    public boolean Insert(Produto produto) throws Exception;
    
    public boolean Update(Produto produto) throws Exception;
    
    public boolean Delete(Produto produto) throws Exception;
    
    public List<Produto> select() throws Exception;
    
}
