/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael;

import burgueriarafael.basica.Cliente;
import burgueriarafael.basica.Funcionario;
import burgueriarafael.basica.NotaFiscal;
import burgueriarafael.basica.Pedido;
import burgueriarafael.basica.Produto;
import burgueriarafael.repositorio.ClienteRepositorio;
import burgueriarafael.repositorio.FuncionarioRepositorio;
import burgueriarafael.repositorio.NotaFiscalRepositorio;
import burgueriarafael.repositorio.PedidoRepositorio;
import burgueriarafael.repositorio.ProdutoRepositorio;
import burgueriarafael.util.banco.Conexao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author BrunoTiCaVini
 */

public class BurgueriaTestes {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * 
     * 
     */
     
    public static void main(String[] args) throws SQLException, Exception{
        
         /* DateFormat formartarhora = new SimpleDateFormat("HH:mm:ss");
          DateFormat formartar = new SimpleDateFormat("dd/MM/yyyy");
          Date data = new Date();
          
          System.out.println(formartarhora.format(data));
          System.out.println(formartar.format(data));*/
         
         //testeBD();
        
         //     CLIENTE OK
         //inserirDadosCliente();
         //alterarCliente();
         //deletarCliente();
         //selecionarCliente();
         //selecionarClienteNome();
         //selecionarClienteCpf();
         
         
         //    FUNCIONARIO OK
         //inserirFuncionario();
         //alterarFuncionario();
         //deletarFuncionario();
         //selecionarFuncionario();
         //selecionarFuncionarioId();
         //selecionarFuncionarioNome();
         
         //      PRODUTO OK
         //inserirProduto();
         //alterarProduto();
         //deletarProduto();
         //selecionarProduto();
         //selecionarProdutoById();
         //selecionarByNome();
         

         // NOTA FISCAL OK
         //inserirNotaFiscal();
         //alterarNotaFiscal();
         //deletarNotafiscal();
         //selecionarNotaFiscal();
         //selecinarNotaFiscalById();
         //selecinarNotaFiscalByData();
         
     
         
         //  PEDIDO 
         //inserirPedido();
         //updatePedido();
         //deletePedido();
         //selecionarPedido();
    } 
 
    /*public static void inserirDadosCliente() throws SQLException, Exception{
        Connection con = null;
        Conexao conexao;
        conexao = Conexao.getInstance();
        
        ClienteRepositorio clirep = new ClienteRepositorio();
        Cliente cliente = new Cliente();
        
        cliente.setCpfCliente("074.254.974-76");
        cliente.setTelefoneCliente("95565126");
        cliente.setEnderecoCliente("varzea");
        cliente.setNomeCliente("Bruno Vinicius");
        cliente.setSexoCliente("M");
        
        try {
           clirep.insert(cliente); 
           System.out.println("Inseriu Cliente");
        }
        catch (Exception ex){
          System.out.println("Não inseriu");
        }
    }
    
    public static void alterarCliente() throws SQLException,Exception {
        Connection con = null;
        Conexao conexao;
        conexao = Conexao.getInstance();
        
        ClienteRepositorio cliRep = new ClienteRepositorio();
        Cliente cliente = new Cliente();
        
        
        cliente.setIdCliente(1);
        cliente.setEnderecoCliente("Rua Poloni");
        cliente.setTelefoneCliente("00000000");
        
         try {
           cliRep.update(cliente); 
           System.out.println("Alterou Cliente");
        }
        catch (Exception ex){
          System.out.println("Não alterou o Cliente");
        }
        
    
    }
    
    public static void deletarCliente() throws SQLException,Exception{
    
        Connection con = null;
        Conexao conexao;
        conexao = Conexao.getInstance();
        
        ClienteRepositorio cliRep = new ClienteRepositorio();
        Cliente cliente = new Cliente();
        
        cliente.setIdCliente(1);
       
         
        try {
         cliRep.delete(cliente);
         System.out.println("Cliente Deletado com sucesso!");
        }
        catch (Exception ex){
         System.out.println("Não Deletou o Cliente!");
        }
                
    }
    
    public static void selecionarCliente() throws SQLException, Exception{
            Connection con = null;
            Conexao conexao;
            conexao = Conexao.getInstance();
            
            ClienteRepositorio cliRep = new ClienteRepositorio();
            Cliente cliente = new Cliente();
            
            cliente.setIdCliente(1);
            
            try {
                cliRep.select();
                System.out.println("Cliente Selecionado");
            }
            catch(Exception ex){
                System.out.println("Cliente não Selecionado");
            }
            
    }
    
    public static void selecionarClienteNome() throws SQLException, Exception{
            Connection con = null;
            Conexao conexao;
            conexao = Conexao.getInstance();
            
            ClienteRepositorio cliRep = new ClienteRepositorio();
            Cliente cliente = new Cliente();
            
            cliente.setNomeCliente("Jonh");
            
            try{
             cliRep.selectByNomeCliente(cliente);
             System.out.println("Cliente selecionado pelo nome!");
            }
            catch(Exception ex){
             System.out.println("Cliente não selecionado pelo nome!");
            }
    
    }
    
    public static void selecionarClienteCpf() throws SQLException, Exception{
            Connection con = null;
            Conexao conexao;
            conexao = Conexao.getInstance();
            
            ClienteRepositorio cliRep = new ClienteRepositorio();
            Cliente cliente = new Cliente();
            
            cliente.setCpfCliente("008.892.558-75");
            
            try{
             cliRep.selectByCpfCliente(cliente);
             System.out.println("Cliente selecionado pelo CPF!");
            }
            catch(Exception ex){
             System.out.println("Cliente não selecionado pelo CPF!");
            }
    }
    
    public static void inserirFuncionario() throws SQLException, Exception{
         Connection con = null;
         Conexao conexao;
         conexao = Conexao.getInstance();
        
        FuncionarioRepositorio funRep = new FuncionarioRepositorio();
        Funcionario funcionario = new Funcionario();
        
        
       funcionario.setCpfFuncionario("058.987.122-77");
       funcionario.setTelefoneFuncionario("3334-7899");
       funcionario.setEnderecoFuncionario("Pracinha da Saberé");
       funcionario.setNomeFuncionario("Thayna Cardoso");
       funcionario.setSexoFuncionario("F");
       
       
       try {
           funRep.insert(funcionario);
           System.out.println("Funcionario Inserido com Sucesso!");
       
       }
       catch (Exception ex){
       System.out.println("Funcionario não Inserido !");
       }
       
    }
    
    public static void alterarFuncionario() throws Exception, Exception{
        Connection con = null;
        Conexao conexao;
        conexao = Conexao.getInstance();
        
        FuncionarioRepositorio funRep = new FuncionarioRepositorio();
        Funcionario funcionario = new Funcionario();
        
        funcionario.setIdFuncionario(1);
        funcionario.setTelefoneFuncionario("897466598");
        funcionario.setEnderecoFuncionario("Rua Bola 09");
        
        try{
         funRep.update(funcionario);
         System.out.println("Funcionario Alterado!");
        }
        
        catch(Exception ex){
         System.out.println("Funcionario não Alterado!");
        }
    }
    
    public static void deletarFuncionario() throws SQLException, Exception{
     
        Connection con = null;
        Conexao conexao;
        conexao = Conexao.getInstance();
        
        FuncionarioRepositorio funRep = new FuncionarioRepositorio();
        Funcionario funcionario = new Funcionario();
        
        funcionario.setIdFuncionario(1);
        
        try{
          funRep.delete(funcionario);
          System.out.println("Deletou Funcionario!");
        }
        catch(Exception ex){
         System.out.println("Não Deletou Funcionario!");
        }
        
    }
    
    public static void selecionarFuncionario() throws SQLException, Exception{
        Connection con = null;
        Conexao conexao;
        conexao = Conexao.getInstance();
        
        FuncionarioRepositorio funRep = new FuncionarioRepositorio();
        Funcionario funcionario = new Funcionario();
        
        funcionario.setIdFuncionario(1);
        
        
        try{
          funRep.select();
          System.out.println("Funcionario selecionado!");
        }
        catch(Exception ex) {
            System.out.println("Funcionario não Selecionado!");
        }
    }
    
    public static void selecionarFuncionarioId() throws SQLException, Exception {
        Connection con = null;
        Conexao conexao;
        conexao = Conexao.getInstance();
        
        FuncionarioRepositorio funRep = new FuncionarioRepositorio();
        Funcionario funcionario = new Funcionario();
        
        funcionario.setIdFuncionario(1);
        
        try{
          funRep.selectByIdFuncionario(funcionario);
          System.out.println("Funcionario selecionado por Id");
        }
        catch(Exception ex){
            System.out.println("Funcionario não selecionado por Id");
        }
    }
    
    public static void selecionarFuncionarioNome() throws SQLException, Exception{
            Connection con = null;
            Conexao conexao;
            conexao = Conexao.getInstance();
        
        FuncionarioRepositorio funRep = new FuncionarioRepositorio();
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNomeFuncionario("Thayna Cardoso");
        
        try{
          funRep.selectByIdFuncionario(funcionario);
          System.out.println("Funcionario selecionado por Nome");
        }
        catch(Exception ex){
            System.out.println("Funcionario não selecionado por Nome");
        }
    
    
    }
    
    public static void inserirProduto() throws SQLException, Exception{
              Connection con = null;
              Conexao conexao;
              conexao = Conexao.getInstance();
              
              ProdutoRepositorio prorep = new ProdutoRepositorio();
              Produto produto = new Produto();
      
              produto.setValorProduto(105.25);
              produto.setNomeProduto("Carne de Hamburguer");
              produto.setDescricaoProduto("Excelente qualidade!");
              
              
              try {
                 prorep.insert(produto);
                 System.out.println("Produto inserido!");
              }
              catch(Exception ex){
              System.out.println("Não inseriu produto!");
              
              }
    }
    
    public static void alterarProduto() throws SQLException, Exception{
           Connection con = null;
           Conexao conexao;
           conexao = Conexao.getInstance();
           
           ProdutoRepositorio proRep = new ProdutoRepositorio();
           Produto produto = new Produto();
           
           produto.setIdProduto(1);
           produto.setValorProduto(58.98);
           produto.setNomeProduto("Bacon");
           produto.setDescricaoProduto("Gorduroso!");
           
           try{
           proRep.update(produto);
           System.out.println("Produto Alterado");
           }
           catch(Exception ex){
           System.out.println("Produto não Alterado");
           }
    }
    
    public static void deletarProduto() throws SQLException, Exception{
           Connection con = null;
           Conexao conexao;
           conexao = Conexao.getInstance();
           
           ProdutoRepositorio proRep = new ProdutoRepositorio();
           Produto produto = new Produto();
           
           produto.setIdProduto(1);
           
           try {
            proRep.delete(produto);
            System.out.println("Produto Deletado com Sucesso");
           }
           catch(Exception ex){
           System.out.println("Não deletou produto!");
           }
           
    }
    
    public static void selecionarProduto() throws SQLException, Exception{
    
             Connection con = null;
             Conexao conexao;
             conexao = Conexao.getInstance();
             
             ProdutoRepositorio proRep = new ProdutoRepositorio();
             Produto produto = new Produto();
             
             produto.setIdProduto(1);
             
             try{
                 proRep.select();
                 System.out.println("Produto Selecionado com sucesso!");
             
             }
             catch(Exception ex){
             System.out.println("Produto não Selecionado!");
             }
             
    }
    
    public static void selecionarProdutoById() throws SQLException, Exception{
    
             Connection con = null;
             Conexao conexao;
             conexao = Conexao.getInstance();
             
             ProdutoRepositorio proRep = new ProdutoRepositorio();
             Produto produto = new Produto();
             
             produto.setIdProduto(1);
             
             try{
                 proRep.selectByIdProduto(produto);
                 System.out.println("Produto Selecionado por Id!");
             
             }
             catch(Exception ex){
             System.out.println("Produto não Selecionado por Id!");
             }
    }
    
    public static void selecionarByNome() throws SQLException, Exception{
         Connection con = null;
         Conexao conexao;
         conexao = Conexao.getInstance();
         
         ProdutoRepositorio proRep = new ProdutoRepositorio();
         Produto produto = new Produto();
         
         produto.setNomeProduto("Carne de Hamburguer");
         
         try{
          proRep.selectByNomeProduto(produto);
          System.out.println("Produto selecionar pelo nome!");
         }
         catch(Exception ex){
             System.out.println("Produto não foi selecionado pelo nome!");
         }
    }
    
 
    
    
    public static void inserirNotaFiscal() throws SQLException, Exception{
    
           Connection con = null;
           Conexao conexao;
           conexao = Conexao.getInstance();
           
           NotaFiscalRepositorio notaRep = new NotaFiscalRepositorio();
           NotaFiscal notafiscal = new NotaFiscal();
        
          
          notafiscal.getProduto().setValorProduto(9.00);
          notafiscal.setNomeProduto("Pizza");
          notafiscal.setValorTotal(50.89);
          notafiscal.setQuantidadeProduto(3);
          notafiscal.getCliente().setIdCliente(1);
          notafiscal.getProduto().setIdProduto(1);
          notafiscal.getPedido().setIdPedido(1);
          notafiscal.getFuncionario().setIdFuncionario(1);
          
          try {
              notaRep.insert(notafiscal);
              System.out.println("Inseriu NotaFiscal");
          
          }
          catch(Exception ex) {
            System.out.println("Não inseriu NotaFiscal");
          }
          
    }
    
    public static void alterarNotaFiscal () throws SQLException, Exception{
    
           Connection con = null;
           Conexao conexao;
           conexao = Conexao.getInstance();
           
           NotaFiscalRepositorio notaRep = new NotaFiscalRepositorio();
           NotaFiscal notafiscal = new NotaFiscal();
    
           notafiscal.setIdNf(3);
           notafiscal.setNomeProduto("Coca-Cola");
           notafiscal.setQuantidadeProduto(10);
           
           try {
              notaRep.update(notafiscal);
              System.out.println("Alterou NotaFiscal");
          
            }
          catch(Exception ex) {
            System.out.println("Não alterou NotaFiscal");
            }
    }
    
    public static void deletarNotafiscal() throws SQLException, Exception{
    
           Connection con = null;
           Conexao conexao;
           conexao = Conexao.getInstance();
           
           NotaFiscalRepositorio notaRep = new NotaFiscalRepositorio();
           NotaFiscal notafiscal = new NotaFiscal();
           
           notafiscal.setIdNf(1);
           
           try{
             notaRep.delete(notafiscal);
             System.out.println("Nota Fiscal Deletada com sucesso ");
           }
           catch(Exception ex) {
            System.out.println("Não foi deletada!");
           }
    }
    
    public static void selecionarNotaFiscal() throws SQLException, Exception{
    
             Connection con = null;
             Conexao conexao;
             conexao = Conexao.getInstance();
             
             NotaFiscalRepositorio nfRep = new NotaFiscalRepositorio();
             NotaFiscal nf = new NotaFiscal();
             
             nf.setIdNf(2);
             
             try{
                nfRep.select();
                System.out.println("Nota Fiscal Selecionada!");
             }
             catch(Exception ex) {
              System.out.println("Nota Fiscal não Selecionada!");
             }
    }
    
    public static void selecinarNotaFiscalById () throws SQLException, Exception{
    
             Connection con = null;
             Conexao conexao;
             conexao = Conexao.getInstance();
             
             NotaFiscalRepositorio nfRep = new NotaFiscalRepositorio();
             NotaFiscal nf = new NotaFiscal();
             
             nf.setIdNf(2);
             
             try{
                nfRep.selectById(nf);
                System.out.println("Nota Fiscal Selecionada pelo ID!");
             }
             catch(Exception ex) {
              System.out.println("Nota Fiscal não Selecionada pelo ID!");
             }                                
    
    
    }
    
    public static void selecinarNotaFiscalByData() throws SQLException, Exception{
    
             Connection con = null;
             Conexao conexao;
             conexao = Conexao.getInstance();
             
             NotaFiscalRepositorio nfRep = new NotaFiscalRepositorio();
             NotaFiscal nf = new NotaFiscal();
             
             nf.getHoraData();
             
             try{
                nfRep.selectByData(nf);
                System.out.println("Nota Fiscal Selecionada pela Data!");
             }
             catch(Exception ex) {
              System.out.println("Nota Fiscal não Selecionada pela Data!");
             }  
     
    }
     
    
    public static void inserirPedido() throws SQLException, Exception {
             
             Connection con = null;
             Conexao conexao;
             conexao = Conexao.getInstance();
             
             PedidoRepositorio pedRep = new PedidoRepositorio();
             Pedido pedido = new Pedido();
             
             pedido.setItemsPedido("Hamburguer");
             pedido.setStatusDoPedido("ABERTO");
             pedido.setValorProduto(17.50);
             
             try{
               pedRep.insert(pedido);
                 System.out.println("Pedido Cadastrado!");
                }
             catch(Exception ex){
                 System.out.println("Pedido Não Cadastrado!");
               }
    }
    
    public static void updatePedido() throws SQLException, Exception{
    
             Connection con = null;
             Conexao conexao;
             conexao = Conexao.getInstance();
             
             PedidoRepositorio pedRep = new PedidoRepositorio();
             Pedido pedido = new Pedido();
             
             pedido.setItemsPedido("Hamburguer, Batata Frita");
             pedido.setStatusDoPedido("FECHADO");
             pedido.setValorProduto(22.50);
             
             try{
               pedRep.insert(pedido);
                 System.out.println("Pedido Alterado!");
                }
             catch(Exception ex){
                 System.out.println("Pedido Não Alterado!");
               }
    }
    
    public static void deletePedido() throws SQLException, Exception{
           Connection con = null;
           Conexao conexao;
           conexao = Conexao.getInstance();
           
           PedidoRepositorio pedRep = new PedidoRepositorio();
           Pedido pedido = new Pedido();
           
           pedido.setIdPedido(3);
           
           try{
               pedRep.delete(pedido);
               System.out.println("Pedido Deletado!");
           }
           catch(Exception ex){
           System.out.println("Pedido não Deletado!");
           }
    }
    
    public static void selecionarPedido() throws SQLException, Exception {
               Connection con = null;
               Conexao conexao;
               conexao = Conexao.getInstance();
    
               PedidoRepositorio pedRep = new PedidoRepositorio();
               Pedido pedido = new Pedido();
               
               pedido.setIdPedido(2);
               
               try{
                   pedRep.select();
                   System.out.println("Pedido Selecionado!");
               }
               catch(Exception ex){
                System.out.println("Pedido não Selecionado!");
               }
    } 
    
 
    public static void testeBD(){
        Connection con = null;
        Conexao conexao;
        conexao = Conexao.getInstance();
        
        try{
        con = conexao.Conectar();
            System.out.println("Conectou");
            
        conexao.Desconectar();
            System.out.println("desconectou");
        
        }
        catch(Exception ex) {
            System.out.println("Falhou");
       
        }
        
    }*/
}


   
    
    

