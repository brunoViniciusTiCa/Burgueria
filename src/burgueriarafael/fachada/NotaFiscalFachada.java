/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.fachada;

import burgueriarafael.basica.NotaFiscal;
import burgueriarafael.negocio.NotaFiscalNegocio;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class NotaFiscalFachada {
    
    NotaFiscalNegocio notafiscalnegocio = null;
    
    public boolean salvarNotaFiscal(NotaFiscal notafiscal) throws Exception{
    
        notafiscalnegocio = new NotaFiscalNegocio();
        notafiscalnegocio.insert(notafiscal);
        
        return true;
    }
    
    public boolean alterarNotaFiscal(NotaFiscal notafiscal) throws Exception{
        
        notafiscalnegocio = new NotaFiscalNegocio();
        notafiscalnegocio.update(notafiscal);
        
        return true;
    }
    
     public boolean deletaNotaFiscal(NotaFiscal notafiscal) throws Exception{
        
        notafiscalnegocio = new NotaFiscalNegocio();
        notafiscalnegocio.delete(notafiscal);
        
        return true;
    }
     
    public List<NotaFiscal> selecionar(NotaFiscal notafiscal) throws Exception{
        notafiscalnegocio = new NotaFiscalNegocio();
        return notafiscalnegocio.select();
             
    }
    
     public boolean selectByData(NotaFiscal notafiscal) throws Exception{
        
        notafiscalnegocio = new NotaFiscalNegocio();
        notafiscalnegocio.selectByData(notafiscal);
        
        return true;
    }
     
     public boolean selectValortotal(NotaFiscal notafiscal) throws Exception{
        
        notafiscalnegocio = new NotaFiscalNegocio();
        notafiscalnegocio.selectValortotal(notafiscal);
        
        return true;
    }
     
     public boolean selectNomeCliente(NotaFiscal notafiscal) throws Exception{
        
        notafiscalnegocio = new NotaFiscalNegocio();
        notafiscalnegocio.selectNomeCliente(notafiscal);
        
        return true;
    }
     
      public boolean selectNomeFuncionario(NotaFiscal notafiscal) throws Exception{
        
        notafiscalnegocio = new NotaFiscalNegocio();
        notafiscalnegocio.selectNomeFuncionario(notafiscal);
        
        return true;
    } 
}
