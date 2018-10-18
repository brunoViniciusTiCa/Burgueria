/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.negocio;

import burgueriarafael.basica.NotaFiscal;
import burgueriarafael.interfaces.CrudNotaFiscalInterface;
import burgueriarafael.repositorio.NotaFiscalRepositorio;
import burgueriarafael.validacao.ExceptionMessage.ExceptionMessageNotaFiscal;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class NotaFiscalNegocio implements CrudNotaFiscalInterface{

    private final NotaFiscalRepositorio notafiscalrepositorio; 
    
    public NotaFiscalNegocio(){
    notafiscalrepositorio = new NotaFiscalRepositorio();
    }
    
    
    @Override
    public boolean insert(NotaFiscal notafiscal) throws SQLException, Exception {
        return notafiscalrepositorio.insert(notafiscal);
    }

    @Override
    public boolean update(NotaFiscal notafiscal) throws SQLException, Exception {
      return notafiscalrepositorio.update(notafiscal);
    }

    @Override
    public boolean delete(NotaFiscal notafiscal) throws SQLException, Exception {
      return notafiscalrepositorio.delete(notafiscal);
    }

    @Override
    public List<NotaFiscal> select() throws SQLException, Exception {
        return notafiscalrepositorio.select();
               
    }

    @Override
    public List<NotaFiscal> selectByData(NotaFiscal notafiscal) throws SQLException, Exception {
      return notafiscalrepositorio.selectByData(notafiscal);
    }

    @Override
    public List<NotaFiscal> selectValortotal(NotaFiscal notafiscal) throws SQLException, Exception {
        validarValorTotal(notafiscal);
        return notafiscalrepositorio.selectValortotal(notafiscal);
    }

    @Override
    public List<NotaFiscal> selectNomeCliente(NotaFiscal notafiscal) throws SQLException, Exception {
      return notafiscalrepositorio.selectNomeCliente(notafiscal);
    }

    @Override
    public List<NotaFiscal> selectNomeFuncionario(NotaFiscal notafiscal) throws SQLException, Exception {
       return notafiscalrepositorio.selectNomeFuncionario(notafiscal); 
    }
    
    public boolean validarValorTotal(NotaFiscal notafiscal) throws Exception{
    
        if(notafiscal.getValorTotal() <= 0){
        throw new Exception("Valor zero" + ExceptionMessageNotaFiscal.VALOR_NF_MENOR_IGUAL_ZERO);
        }
        return true;
    }
    
    public boolean quantidadeProduto(NotaFiscal notafiscal) throws Exception{
        
        if(notafiscal.getQuantidadeProduto() <= 0){
        throw new Exception("Quantidade produto" + ExceptionMessageNotaFiscal.QUANTIDADE_NF_MENOR_IGUAL_ZERO);
        }
        return true;   
    }
}
