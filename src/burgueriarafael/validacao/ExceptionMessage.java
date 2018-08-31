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
    
        //public final static String ;
    
    }
    public interface ExceptionMessageNotaFiscal{
    
    }
    
    public interface ExceptionMessagePedido{
    
    }
    public interface ExceptionMessageProduto{
    
    }
   
    
    
}
