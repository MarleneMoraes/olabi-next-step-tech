# Banco de Dados

Colecao organizada e disposta para acesso as informações quando necessário em um projeto

IMPORTANTE ❗ 
Preferencialmente, o Banco de Dados deve ser agnóstico (independente) da aplicação desenvolvida para atender mais de uma aplicação

### Características 
- Grande performance: suas rotinas são escaladas para um servidor (onde acontecem menos processos paralelamente).
- Dados em nuvem: armazenamento de banco de dados na nuvem. Ex: AWS, Firebase.

### Tipos de Banco de Dados:

- Relacionais: dados relacionam-se entre si (uns dependem dos outros) - normalmente informacoes estaticas
  - Chave Primária (Primary Key: PK): chave de identificacao para cada instancia da tabela 
  
- Não-relacionais: banco que nao utiliza tabelas com linhas e colunas, mas sim esquema de chave (key) e valor (value), semelhante ao JSON. Utilizada em busca, aprendizado da maquina (Machine Learning).

### Linguagem de manipulacao de banco de dados: SQL (Structure Query Language)

- Tipos de Query:
  - Data Manipulation Language (DML): manipulação dos dados dentro de uma tabela
    -  insert (inserir)
    -  update (atualizar) 
    -  delete (deletar)
  - Data Query Language (DQL): buscas nas tabelas
    - select (selecionar)
  - Data Definition Language (DDL): definição da estrutura do banco de dados
    - create (criar)
    - drop (excluir)
    - alter (alterar)
  
  <small>Voltados à segurança de dados</small>
  - Data Control Language (DCL): comandos para controle de acesso ao banco de dados
    - grant (conceder acesso)
    - revoke (bloqueio de acesso)
  - Data Transaction Language (DTL ou TCL): responsável pelo controle de transação de dados
    - begin (início de uma transação)
    - commit (autorizar transação)
    - rollback (desfazer a última transação)