# TesteDevOperacional

Infelizmente tive um problema com meu notebook e só consegui fazer na parte da tarde! Fiz um readme
com todas as mudanças que eu realizei no projeto. Não me atentei para fazer os commits enquanto ia desenvolvendo.

1.(Classe Empresa)  Adicionei uma condição no construtor, caso algum
parametro for null, irá ocorrer ume excessão

2. (Classe Empresa) Adicionei validação de ID, se ele for negativo terá 
uma excessão e encerrará o programa.

3. (Classe Empresa) Adicionei validação para CNPJ, se a String passada
tiver menos ou mais de 14 caracteres, vai ocorrer
uma excessão!

4. (Classe Empresa) Adicionei validação de Taxa, se ele for negativo terá 
uma excessão e encerrará o programa.

5. (Classe Main) Correção na mensagem "Total Líquido  para empresa"
para "Total Líquido  para empresa R$"

6. (Classe Main) Correção na mensagem "Saldo Empresa: "
para "Saldo Empresa: R$"

7. Validação de Nome, se for passado uma string vazia
ira ocorrer uma excessão

8. (Classe Main) Validação de quantidade produtos disponiveis na 
hora de uma compra

9. (Classe Cliente)  Adicionei validação para CPF, se a String passada
tiver menos ou mais de 14 caracteres, vai ocorrer
uma excessão!

10. (Classe Usuário) Criação de um metodo privado para
verificar o tipo de usuário, e correção dos retornos nos
metodos isEmpresa, isUsuario e isAdmin.

11. (Classe Usuário) Validação do construtor, se username
ou senha forem null ou vazio, ocorre uma excessão.

12. Boas Praticas (Main e Classe Venda) Mudança no
nome da variavel "código" para "codigo", e metodos
"getCódigo" e "setCódigo" para "getCodigo" e "setCodigo"

13. (Classe Venda) Validação no metodo setCodigo para não ser possivel
passar um parametro nulo ou menor que zero.

14.  (Classe Venda) Validação no metodo setItens para não ser possivel
passar um parametro nulo ou vazio.

15. (Classe Venda) Validação no metodo setValor para não ser possivel
passar um parametro nulo ou menor que zero.

16. (Classe Venda) Validação no metodo setComissaoSistema para não ser possivel
passar um parametro nulo ou negativo. 

17. (Classe Produtos) Criação de uma classe para um excessão de estoque
insuficientes.

18. (Classe Produtos) Validação no metodo setPreco para não ser possivel
passar um parametro zero ou negativo. 

19. (Classe Produtos) Validação no metodo setQuantidade para não ser possivel
passar um parametro zero ou negativo. 

20. Main e Classe Vendas, metodo criarVendas foi para a
classe Vendas.









