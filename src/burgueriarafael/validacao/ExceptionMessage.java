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
         
        public final static String ENDERECO_CLIENTE_TAMANHO = "Endereço invalido do cliente, tamanhão do endereço invalido.";
         
        public final static String NOME_CLIENTE_NULL = "Prencha atenciosamente esté campo,campo nulo.";
         
        public final static String NOME_CLIENTE_VAZIO = "Prencha atenciosamente esté campo,campo vazio.";
         
        public final static String SEXO_CLIENTE_NULL = "Campo nulo não pode existir!";
         
        public final static String SEXO_CLIENTE_VAZIO = "Campo vazio não pode cadastrar!";
         
        public final static String SEXO_CLIENTE_TAMANHO = "Tamanho invalido, verificar!";
         
        public final static String SEXO_CLIENTE_M_OU_F = "Só pode cadastrar F ou M";
                 
    }
    
    public interface ExceptionMessageFuncionario{
    
         public final static String ID_FUNCIONARIO_NULL_VAZIO = "Id nulo ou vazio, Verifique ao certo a numeração do Id";
         
         public final static String CPF_FUNCIONARIO_NULL = "Cpf nulo, verifique se foi inserido da maneira correta!";
         
         public final static String CPF_FUNCIONARIO_VAZIO = "Cpf Vazio, verifique se foi inserido da maneira correta!";
         
         public final static String CPF_FUNCIONARIO_TAMANHO = "Tamanhão do Cpf invalido, Tamanhão autorizado com 11 digitos!";
         
         public final static String TELEFONE_FUNCIONARIO_NULL = "Telefone nulo,verifique se foi inserido de maneira correta!";
         
         public final static String TELEFONE_FUNCIONARIO_VAZIO = "Telefone vazio,verifique se foi inserido de maneira correta!";
         
         public final static String TELEFONE_FUNCIONARIO_TAMANHAO = "Tamanhão do Telefone invalido, Tamanhão autorizado com 11 digitos!";
         
         public final static String ENDERECO_FUNCIONAR_NULL = "Endereço nulo, verifique se foi inserido de maneira correta!";
         
         public final static String ENDERCO_FUNCIOANARIO_VAZIO = "Endereço vazio,verifique se foi inserido de maneira correta! ";
         
         public final static String ENDERCO_FUNCIOANARIO_TAMANHO = "Tamanhão do Endereço invalido, Tamanhão autorizado com 40 digitos! ";
         
         public final static String NOME_FUNCIONARIO_NULL = "Nome nulo, verifique se foi inserido de mandeira correta.";
         
         public final static String NOME_FUNCIONARIO_VAZIO = "Nome vazio, verifique se foi inserido de mandeira correta.";
         
         public final static String NOME_FUNCIONARIO_TAMANHO = "Tamanhão do nome do funcionario invalido, Tamanhão autorizado com 40 digitos!";
         
         public final static String SEXO_FUNCIONARIO_NULL = "Sexo nulo, verifique se foi inserido de maneira correta.";
    
         public final static String SEXO_FUNCIONARIO_VAZIO= "Sexo vazio, verifique se foi inserido de maneira correta.";
         
         public final static String SEXO_FUNCIONARIO_TAMANHO  = "Tamanhão do nome do funcionario invalido, Tamanhão autorizado com 1 digitos!";
    
    }
    
    
    
    
    public interface ExceptionMessageNotaFiscal{
         
        public final static String VALOR_NF_MENOR_IGUAL_ZERO = "O valor total não pode ser Zero!"; 
        
        public final static String QUANTIDADE_NF_MENOR_IGUAL_ZERO = "O valor total não pode ser Zero!"; 
         
    }
    
    public interface ExceptionMessagePedido{
        
         public final static String STATUS_PEDIDO_VAZIO  = "Status vazio,verifique se foi inserido de maneira correta!";
         
         public final static String STATUS_PEDIDO_NULO  = "Status nulo,verifique se foi inserido de maneira correta!";
         
         public final static String STATUS_PEDIDO_SÓ  = "Só pode Salvar com ABERTO ou FECHADO!";
         
         public final static String QTD_PRODUTO_NUMERO = "Só podemos cadastrar números aqui!";
    
         
       
    
    }
    public interface ExceptionMessageProduto{
        
         public final static String NOME_PRODUTO_NULL = "Nome nulo,verifique se foi inserido de maneira correta!";
         
         public final static String NOME_PRODUTO_VAZIO = "Nome vazio,verifique se foi inserido de maneira correta!";
         
         public final static String DESCRICAO_PRODUTO_NULL = "Descrição nula,verifique se foi inserido de maneira correta!";
         
         public final static String DESCRICAO_PRODUTO_VAZIO = "Descrição vazia,verifique se foi inserido de maneira correta!";
         
         public final static String VALOR_PRODUTO_MENOR_ZERO = "Valor do produto menor que zero, não pode ser cadastrado!";
         
         public final static String QTD_PRODUTO_ACABANDO = "Produto não pode ser cadastrado com quantidade ZERO ou quantidade NEGATIVA!";
         
    }
}
