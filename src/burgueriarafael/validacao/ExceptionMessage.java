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
    
         public final static String QUANTIDADE_CARACTERES_PERMITIDOS = "A quantidade de caracteres permitidas para esse campo é :";

         public final static String ID_IGUAL_ZER0 = "não pode ser igual a zero.";
    
    
    public interface ExceptionMessageCliente {
    
         public final static String NUMERO_ID_NULL_OU_INVALIDO = "Este id não é existente ou diferentes de números";
         
         public final static String CPF_CLIENTE_NULL_OU_INVALIDO  = "Cpf invalido do cliente, invalido ou já cadastrado.";
         
         public final static String TELEFONE_CLINETE_NULL_OU_INVALIDO = "Verificar o telefone do cliente, algo está errado. Invalido, nulo ou já cadastrado.  ";
      
         public final static String ENDERECO_NULL_OU_INVALIDO = "Por favor verificar o campo se está vazio, nulo, invalido ou já foi cadastrado.";
         
         public final static String NOME_NULL_INVALIDO_OU_CADASTRADO = "Prencha atenciosamente esté campo, verifique-se se já está cadastrado, nulo ou invalido.";
         
         public final static String SEXO_NULL_OU_INVALIDO = "Você esqueceu de cadastrar seu género.";
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
