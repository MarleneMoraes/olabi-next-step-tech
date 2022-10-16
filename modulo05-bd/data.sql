-- clausula de consulta
-- Anatomia:
-- SELECT * FROM nome_da_tabela WHERE condicao

-- SELECT
SELECT * FROM alunos WHERE time_do_coracao = "Gremio";

-- condicoes com operacoes logicos
SELECT * FROM colaboradores WHERE salario >= 5000.00;

SELECT * FROM colaboradores WHERE salario >= 5000.00 AND salario < 9000.00;

-- DELETE
SELECT * FROM libertadores WHERE time = "Galo da Massa";


-- ALL, ANY, BETWEEN, EXISTS, IN
-- > < >= <= = <>
-- LIKE, NOT, OR 


---------------------------------------------------------------------------
-- criando uma tabela
CREATE TABLE IF NOT EXISTS `aluno` (
    `matricula` int(6) NOT NULL AUTO_INCREMENT,
    `nome` varchar(200) NOT NULL,
    PRIMARY KEY (`matricula`)
) DEFAULT CHARSET=utf8;


-- inserindo dados em uma tabela
INSERT INTO `aluno` (`matricula`, `nome`) VALUES
    ('1', 'Ana Corina'),
    ('2', 'Danilo Gonçalves'),
    ('3', 'Diego Simões'),
    ('4', 'Larissa Botelho'),
    ('5', 'Marlene Moraes');