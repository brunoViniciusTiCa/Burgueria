/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.fachada;

import burgueriarafael.basica.Produto;
import burgueriarafael.negocio.ProdutoNegocio;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class ProdutoFachada {
    
    ProdutoNegocio produtonegocio = null;
    
    public boolean salvarProduto(Produto produto) throws Exception{
    
        produtonegocio = new ProdutoNegocio();
        produtonegocio.insert(produto);
        
        return true;
    }
    
    public boolean alterarProduto(Produto produto) throws Exception{
    
        produtonegocio = new ProdutoNegocio();
        produtonegocio.update(produto);
        return true;
    }
    
    public boolean deletarProduto(Produto produto) throws Exception{
      
       produtonegocio = new ProdutoNegocio();
       produtonegocio.delete(produto);
       return true;
    }
    
    public List<Produto> consultarProduto() throws Exception{
      
        produtonegocio = new ProdutoNegocio();
        return produtonegocio.select();
    }
    
    public List<Produto> selectByNomeProduto(Produto produto) throws Exception{
    
       produtonegocio = new ProdutoNegocio();
       return produtonegocio.selectByNomeProduto(produto);
    }
    
}
