# TesteDevOperacional
Este projeto é referente ao teste para a vaga do Processo seletivo - Java Spring Boot Developer.

## Descrição do Projeto
O projeto consiste em um sistema de vendas que realiza a venda de produtos para empresas e clientes. A aplicação possui classes que representam os usuários, empresas, clientes, produtos e vendas.

## Mudanças Realizadas
Abaixo estão listadas todas as mudanças realizadas no projeto:

### Classe Empresa
- Adicionada validação no construtor para não deixar passar nenhum parâmetro nulo, caso seja nulo ocorrerá uma exceção;
- Adicionada validação de ID no **método setId**, se ele for negativo terá uma exceção e encerrará o programa;
- Adicionada validação para CNPJ no **método setCNPJ**, se a string passada tiver menos ou mais de 14 caracteres, ocorrerá uma exceção;
- Adicionada validação de Taxa no **método setTaxa**, se ele for negativo terá uma exceção e encerrará o programa.
### Classe Main
- Corrigida a mensagem **"Total Líquido para empresa"** para **"Total Líquido para empresa R$"**;
- Corrigida a mensagem **"Saldo Empresa: "** para **"Saldo Empresa: R$"**;
- Adicionada validação de quantidade de produtos em estoque na hora de uma compra no switch (case 1).
### Classe Cliente
- Adicionada validação para CPF no **método setCPF**, se a string passada tiver menos ou mais de 11 caracteres, ocorrerá uma exceção.
### Classe Usuário
- Criado um método privado **getUserType**, para verificar o tipo de usuário;
- Corrigidos os retornos nos métodos **isEmpresa, isUsuario e isAdmin**;
- Adicionada validação no construtor, se username ou senha forem null ou vazio, ocorrerá uma exceção.
### Classe Venda
- Adicionada validação no **método setCodigo** para não ser possível passar um parâmetro nulo ou menor que zero;
- Adicionada validação no **método setItens** para não ser possível passar um parâmetro nulo ou vazio;
- Adicionada validação no **método setValor** para não ser possível passar um parâmetro nulo ou menor que zero;
- Adicionada validação no **método setComissaoSistema** para não ser possível passar um parâmetro nulo ou negativo.
### Classe Produtos
- Criada uma **classe EstoqueInsuficienteException** para uma exceção de estoque insuficientes;
- Adicionada validação no **método setPreco** para não ser possível passar um parâmetro zero ou negativo;
- Adicionada validação no **método setQuantidade** para não ser possível passar um parâmetro zero ou negativo.
### Boas Práticas
- Alterado o nome da variável **"código" para "codigo" e dos métodos "getCódigo" e "setCódigo" para "getCodigo" e "setCodigo" na classe Main e na classe Venda;
- O **método criarVendas** foi para a **classe Vendas**.
### Conclusão
Essas são as mudanças realizadas no projeto. Espero que as alterações possam contribuir para melhorar a qualidade do sistema e facilitar a manutenção no futuro.
