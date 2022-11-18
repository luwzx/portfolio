2 B - DESENVOLVIMENTO DE SISTEMAS
ÀREA TÉCNICA
Chave Estrangeira e Manipulação de dadosDetalhes da atividade
Chave Estrangeira e Manipulação de dados
ANA PAULA ROSA NEGRI
•
10 de nov. Editado às 10 de nov.
100 pontos
Data de entrega: Ontem 07:25
Desenvolva o diagrama entidade relacionamento e seu respectivo código SQL contendo chave primária, chave estrangeira e pelo menos 3 itens em cada tabela para um sistema de concessionária, creche ou restaurante. Mínimo 4 entidades
Comentários da turma
Seus trabalhos
Devolvido

PostgreSQL (1).sql
SQL

Banco de Dados Concessionária
Planilhas Google

Captura de tela 2022-11-10 092822.png
Imagem
1 comentário particular

Luiza Silva10 de nov.
Feito com Isabela

CREATE TABLE Carro(
modelo VARCHAR (15) NOT NULL,
placa VARCHAR (10) NOT NULL,
ano NUMERIC (10) NOT NULL,
valor VARCHAR (20) NOT NULL,
cor VARCHAR (15) NOT NULL,
fabricante VARCHAR (15) NOT NULL,

PRIMARY KEy (placa)
)

CREATE TABLE Funcionário(
nome VARCHAR (30) NOT NULL,
CPF VARCHAR (20) NOT NULL,
cargaHorária VARCHAR (10) NOT NULL,

PRIMARY KEY (CPF)
)

CREATE TABLE Estoque(
localização VARCHAR (10) NOT NULL,
placaCarro VARCHAR (20) NOT NULL,
quantidade VARCHAR (10) NOT NULL,

FOREIGN KEY (placaCarro)
REFERENCES carro (placa)
)

CREATE TABLE Endereço(
endereçoLoja VARCHAR (10) NOT NULL,
CEP VARCHAR (10) NOT NULL,
número NUMERIC (10) NOT NULL,
  
PRIMARY KEY (CEP)
)



INSERT INTO Carro ( modelo, placa, ano, valor, cor, fabricante)
VAlues ('Celta', 'ABC15V45', 2022, '30.500,00', 'Branco', 'Chevrolet Celta')

INSERT INTO Funcionário ( nome, CPF, cargaHorária)
VAlues ('Luiza Iahn', '124.115.854-50', '6h por dia'),
('Isabela Iahn', '165.856.854-50', '6h por dia')

INSERT INTO Estoque ( localização, placaCarro, quantidade)
VAlues ('Est B', 'ABC15V45', '1')

INSERT INTO Endereço ( endereçoLoja, CEP, número)
VAlues ('Ervino Bu', '88131-040', '756')



SELECT * From Carro;
SELECT * From Funcionário;
SELECT * From Estoque;
SELECT * From Endereço;
PostgreSQL (1).sql
Exibindo PostgreSQL (1).sql…
