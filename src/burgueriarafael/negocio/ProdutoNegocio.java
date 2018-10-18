/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.negocio;

import burgueriarafael.basica.Produto;
import burgueriarafael.interfaces.CrudProdutoInterface;
import burgueriarafael.repositorio.ProdutoRepositorio;
import burgueriarafael.validacao.ExceptionMessage.ExceptionMessageProduto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class ProdutoNegocio implements CrudProdutoInterface{
    
    private final  ProdutoRepositorio produtorepositorio;
    
    public ProdutoNegocio() {
    produtorepositorio = new ProdutoRepositorio();
    }

    @Override
    public boolean insert(Produto produto) throws SQLException, Exception {
       return produtorepositorio.insert(produto);   
    }

    @Override
    public boolean update(Produto produto) throws SQLException, Exception {
        return produtorepositorio.update(produto);
    }

    @Override
    public boolean delete(Produto produto) throws SQLException, Exception {
        return produtorepositorio.delete(produto);
    }

    @Override
    public List<Produto> select() throws SQLException, Exception {
        return produtorepositorio.select();
    }

    @Override
    public List<Produto> selectByNomeProduto(Produto produto) throws SQLException, Exception {
        nomeProduto(produto);
        return produtorepositorio.selectByNomeProduto(produto);
    }
    
    public boolean nomeProduto(Produto produto) throws Exception{
      
       if(produto.getNomeProduto() == null){
       throw new Exception("Nome nulo" + ExceptionMessageProduto.NOME_PRODUTO_NULL);
       }
       if(produto.getNomeProduto().isEmpty()){
       throw new Exception("Nome vazio" + ExceptionMessageProduto.NOME_PRODUTO_VAZIO);
       }
       return true;
   }
   
   public boolean valorProduto(Produto produto) throws Exception{
    if(produto.getValorProduto() <= 0){
    throw new Exception("Valor menor que zero" + ExceptionMessageProduto.VALOR_PRODUTO_MENOR_ZERO);
    }
   return true;
   }
 
   public boolean descricaoProduto(Produto produto) throws Exception{
   
       if(produto.getDescricaoProduto() == null){
       throw new Exception("Descrição Nula" + ExceptionMessageProduto.DESCRICAO_PRODUTO_NULL);
       }
       if(produto.getDescricaoProduto().isEmpty()){
       throw new Exception("Descrição Vazia" + ExceptionMessageProduto.DESCRICAO_PRODUTO_VAZIO);
       }
       
     return true;
   }
}
