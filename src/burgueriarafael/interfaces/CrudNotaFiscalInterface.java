/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.interfaces;

import burgueriarafael.basica.NotaFiscal;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudNotaFiscalInterface {
 
    public boolean Insert(NotaFiscal notafiscal) throws SQLException, Exception;
    
    public boolean Update(NotaFiscal notafiscal) throws SQLException, Exception;
    
    public boolean Delete(NotaFiscal notafiscal) throws SQLException, Exception;
    
    public List<NotaFiscal> select() throws SQLException, Exception;
}
