create table Endereço(
 Nome_da_rua varchar(1) not NULL,
 CEP varchar(16) not NULL,
 Número_habitação numeric(6) NOT NULL,
  Tipo_habitação varchar(10)NOT NULL
  
    PRIMARY Key(Número_habitação)
     PRIMARY Key(CEP)
  );
  
  CREATE TABLE Aluno(
    Nome varchar(16) NOT NULL,
    CPF varchar(16) NOT NULL,
   	Data_nascimento varchar (11) NOT NULL,
    Curso_escolhido varchar (1) NOT NULL,
    Histórico_cursos varchar(16) NOT NULL
    
      PRIMARY Key(CPF)
    );
    
    CREATE TABLE Curso(
     Notas numeric (16) NOT NULL,
     ID_curso numeric(10) NOT NULL,
     Frequencia_alunos varchar (5) NOT NULL,
     Quant_alunos numeric (30) NOT NULL,
     Materiais varchar (50) NOT NULL
      
        PRIMARY Key(ID_curso)
    );
    
    CREATE TABLE Funcionários (
      Nome varchar(16) NOT NULL,
      Matricula varchar(16) NOT NULL,
      Ano_contratação numeric(16) NOT NULL,
      Turno varchar(16) NOT NULL,
      Carga_horaria numeric(16) NOT NULL,
      Função varchar(16) NOT NULL,
      Data_nascimento varchar(16) NOT NULL,
      
      PRIMARY Key(Matricula)
    );
    
    CREATE TABLE Escola(
 	  CNPJ varchar(16) NOT NULL,
      Mensalidade varchar(16) NOT NULL,
      Razão_social varchar(16) NOT NULL,
      
      PRIMARY Key(CNPJ)
     );
    

