/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.validacao;

/**
 *
 * @author BrunoTiCaVini
 */
public interface ExceptionMessage {
    
    
    
    
    public interface ExceptionMessageCliente {
        
        public final static String CLIENTE_NAO_EXISTE = "Cliente não existe!"; 
        
        public final static String VALIDAR_ID_CLIENTA = "id já cadastrado!";
    
         public final static String CPF_CLIENTE_NULL  = "Cpf invalido do cliente, cpf nulo.";
         
         public final static String CPF_CLIENTE_VAZIO  = "Cpf invalido do cliente, cpf vazio.";
         
         public final static String CPF_CLIENTE_TAMANHO  = "Cpf invalido do cliente, tamanhão do cpf invalido.";
         
        
         public final static String TELEFONE_CLIENTE_NULL = "Verificar o telefone do cliente, algo está errado. Telefone nulo.";
         
         public final static String TELEFONE_CLIENTE_VAZIO = "Verificar o telefone do cliente, algo está errado. Telefone vazio.";
      
         public final static String TELEFONE_CLIENTE_TAMANHO = "Verificar o tamanho do telefone do cliente!";
         
         public final static String ENDERECO_CLIENTE_NULL = "Verificar o telefone do cliente, algo está errado. Endereço nulo.";
         
         public final static String ENDERECO_CLIENTE_VAZIO = "Verificar o telefone do cliente, algo está errado. Endereço vazio.";
         
      
         
         
         
         
         public final static String NOME_CLIENTE_NULL = "Prencha atenciosamente esté campo,campo nulo.";
         
         public final static String NOME_CLIENTE_VAZIO = "Prencha atenciosamente esté campo,campo vazio.";
         
         
         
         public final static String SEXO_CLIENTE_NULL = "Campo nulo não pode existir!";
         
         public final static String SEXO_CLIENTE_VAZIO = "Campo vazio não pode cadastrar!";
         
         public final static String SEXO_CLIENTE_TAMANHO = "Tamanho invalido, verificar!";
         
         public final static String SEXO_CLIENTE_M_OU_F = "Só pode cadastrar F ou M";
                 
                 
    }
    
    public interface ExceptionMessageFuncionario{
    
         public final static String  ID_FUNCIONARIO_NULL_VAZIO = "Id nulo ou vazio, Verifique ao certo a numeração do Id";
         
         public final static String CPF_NULL_OU_VAZIO = "Cpf nulo ou vazaio, verifique se foi inserido da maneira correta!";
         
         public final static String TELEFONE_NULL_OU_VAZIO = "Telefone nulo ou vazio,verifique se foi inserido de maneira correta!";
         
         public final static String ENDERECO_NULL_OU_VAZIO = "Endereço nulo ou vazio, verifique se foi inserido de maneira correta";
    
         public final static String NOME_NULL_OU_VAZIO = "Nome nulo ou vazio, verifique se foi inserido de mandeira correta.";
         
         public final static String SEXO_NULL_OU_VAZIO = "Sexo nulo ou vazio, verifique se foi inserido de maneira correta.";
    }
    public interface ExceptionMessageNotaFiscal{
         
         public final static String  IDNF_NULL_OU_VAZIO = "Id nulo ou vazio, Verifique ao certo a numeração do Id";
         
         public final static String DATANF_NULL_OU_VAZIO = "DataNF nulo ou vazaio, verifique se foi inserido da maneira correta!";
         
         public final static String HORANF_NULL_OU_VAZIO = "HoraNF nulo ou vazio,verifique se foi inserido de maneira correta!";
         
    }
    
    public interface ExceptionMessagePedido{
        
         public final static String IDPEDIDO_NULL_OU_VAZIO = "IdPedido nulo ou vazio,verifique se foi inserido de maneira correta!";
         
         public final static String VALOR_NULL_OU_VAZIO = "Valor Pedido nulo ou vazio, verifique se foi inserido de maneira correta.";
    
         public final static String NOMEPEDIDO_NULL_OU_VAZIO = "Nome nulo ou vazio, verifique se foi inserido de mandeira correta.";
         
         public final static String DESCRICAO_NULL_OU_VAZIO = "Descrição do pedido nulo ou vazio, verifique se foi inserido de maneira correta.";
    
    }
    public interface ExceptionMessageProduto{
        
         public final static String ID_PRODUTO_NULL_OU_VAZIO = "IdPedido nulo ou vazio,verifique se foi inserido de maneira correta!";
         
         public final static String DATA_PRODUTO_NULL_OU_VAZIO  = "Data do Produto nulo ou vazio, verifique se foi inserido de maneira correta.";
         
         public final static String DESCRICAO_PRODUTO_NULL_OU_VAZIO = "Descrição do Produto nulo ou vazio, verifique se foi inserido de maneira correta";
      
         public final static String ENDERECO_NULL_OU_VAZIO = "Status do Produto nulo ou vazio, verifique se foi inserido de maneira correta";
         
         public final static String NOME_NULL_INVALIDO_OU_VAZIO = "Hora do Produto nulo ou vazio, verifique se foi inserido de maneira correta";
    }
}
