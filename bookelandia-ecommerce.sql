#Cria DB
create database test;

#Apaga BD
drop database bookelandia;

#Criando BD
create database bookelandia;

#Usando o BD bookelandi
use bookelandia;

#Mostrando tds db na base
show databases;

#Mostrar tds tables do banco em uso
show tables;

create table `clientes`(
	cpf varchar(11),
    senha varchar(20) not null,
	nome varchar(50) not null,
    email varchar(50) not null,
    telefone varchar(15),
    endereco varchar(100),
    dataDeCadastro date,
    primary key(`cpf`)
);

show tables;

#descreve todos os campos e seus tipos
describe clientes;

#table categoria de produtos

# Cria a tabela de categorias de produtos
create table `categoria_produtos` (
	codigo int,
    nome varchar(20) not null,
    descricao varchar(20),
    primary key (`codigo`)
);

# Cria a tabela de produtos
create table `produtos` (
	codigoDoProduto int,
    codigoDaCategoria int,
	nome varchar(20),
    descricao text,
    preco decimal(10, 2),
    primary key (`codigoDoProduto`),
    foreign key (`codigoDaCategoria`) references `categoria_produtos`(codigo)
);

drop table `categoria_produtos`;
drop table `produtos_do_pedido`;
drop table `avaliacoes_produtos`;
drop table `produtos`;
describe produtos;

#altera a table de produtos
alter table `produtos` add primary key(codigoDoProduto);

alter table `produtos`
add constraint fk_produtos_categoria_produtos
foreign key (`codigoDaCategoria`)
references categoria_produtos(`codigo`);

alter table `produtos` add primary key(codigoDoProduto);

insert into `clientes` (cpf,senha,nome,email,telefone,endereco,dataDeCadastro) values
('12312312343', 'abc@123','Cris Oliveira','Cris.oliveira@bookelandia.com','123123123', 'Rua Carvalho', now()),
('12312312987', 'def@456','Maria Oliveira','Maria.oliveira@bookelandia.com','123123123', 'Rua São João', now()),
('12312312658', 'ghi@789','Ana Santos','ana.santos@bookelandia.com','123123123', 'Rua Sergipe', now()),
('12312312321', 'jkl@101','Paula Santos','paula.santos@bookelandia.com','123123123', 'Rua São Paulo', now()),
('12312312333', 'mno@112','Bruno Santos Oliveira','bruno.oliver@bookelandia.com','123123123', 'Rua Amazonas', now());

select cpf,nome,telefone,endereco,dataDeCadastro from `clientes`;

#exibe nome, email e telefone dos clientes
select nome, email, telefone FROM `clientes`;

# cria TABELA LOGIN
#id
#email (pk)
#senha
#nivelDeAcesso
#status
create table `logins` (
	email varchar(50),
    senha varchar(20) not null,
    nivelDeAcesso varchar(11) check (nivelDeAcesso in ('admin', 'cliente', 'funcionario')),
    `status` boolean,
    primary key (`email`)
);

# cria TABELA PEDIDOS
#numeroDoPedido
#codigoClientes
#formaPAgamento (boleto, pix, cartão de crédito)
#status
#data
#cupom (não é obrigatório)
#valorTotal
create table `pedidos` (
	numeroDoPedido int,
    codigoDoCliente varchar(11),
    formaPagamento varchar(15) check (formaPagamento in ('boleto', 'pix', 'cartao')),
    statusDoPedido varchar(10) check (statusDoPedido in ('analise', 'aprovado', 'finalizado')),
    dataDoPedido date,
    cupom varchar(10),
    valorTotal decimal (10,2),
    primary key (`numeroDoPedido`),
    foreign key (`codigoDoCliente`) references clientes(`cpf`)
);

# cria TABELA PRODUTOS DO PEDIDO
#numeroDoPedido (pk, fk)
#CodigoProduto (pk, fk)
#quantidade
create table `produtos_do_pedido` (
	numeroDoPedido int,
    codigoDoProduto int,
    quantidade int,
    primary key (`numeroDoPedido`, `codigoDoProduto`),
    foreign key (`numeroDoPedido`) references pedidos(`numeroDoPedido`),
    foreign key (`codigoDoProduto`) references produtos(`codigoDoProduto`)
);

# cria TABELA FUNCIONARIOS
#matricula
#nome
#dataDeAdmissão
#cargo
#salario
create table `funcionarios` (
	matricula int not null,
    nome varchar(50) not null,
    dataDeAdmissao date not null,
    cargo varchar(25) not null,
    salario decimal(10,2) not null,
    primary key (`matricula`)
);

# cria TABELA CHAMADOS
#ticket (pk)
#status
#codigoDoFuncionario (fk)
#codigoDoCliente (fk)
#codigoDoPedido (não obrigatório) (fk)
#descrição
create table `chamados` (
	ticket int not null,
    statusDoChamado varchar(20) check (statusDoChamado in ('aberto','pendente','finalizado')),
    codigoDoCliente varchar(11) not null,
    codigoDoPedido int null,
    descricao text,
    primary key(ticket),
    foreign key(codigoDoCliente) references `clientes`(cpf),
    foreign key(codigoDoPedido) references pedidos(numeroDoPedido)
);

ALTER TABLE chamados ADD codigoDoFuncionario int;
alter table chamados
add constraint fk_funcionario_chamados
foreign key(`codigoDoFuncionario`)
references funcionarios(matricula);

# cria TABELA AVALIAÇÃO DE PRODUTOS
#codigoDoProduto (pk)(fk)
#codigoDoCliente
#nota
#descrição (não obrigatório)
create table `avaliacoes_produtos` (
	codigoDoProduto int, 
    codigoDoCliente varchar(11), 
    nota int check (nota >=1 and nota <=5),
    descricao text,
    primary key (`codigoDoProduto`, `codigoDoCliente`),
    foreign key (codigoDoProduto) references produtos(codigoDoProduto),
    foreign key (codigoDoCliente) references clientes(cpf)
);


# Insere dados na tabela de produtos
insert into `categoria_produtos` (codigo,nome,descricao) values (155,'tecnologia','livros de ti');
insert into `categoria_produtos` (codigo,nome,descricao) values (157,'ficcao','livros de ficcao'), (158,'fantasia','livros de fantasia');
select*from `categoria_produtos`;


insert into `produtos`(codigoDoProduto,codigoDaCategoria,nome,descricao,preco)
values
(1,'155','algoritmos','um livro de algoritmo ai',40.99),
(2,'158','harry potter', 'best seller lider em vendas mundial',60.99),
(3,'157','jogos vorazes','conta a historia de Katniss Everdeen',70.99);


select * from `produtos`;

# Insere dados na tabela de pedidos
insert into `pedidos` 
(numeroDoPedido,codigoDoCliente,formaPagamento,statusDoPedido,dataDoPedido,cupom,valorTotal)
values('123456789','12312312321','pix','finalizado',STR_TO_DATE('20-may-2022', '%d-%M-%Y'),null,300);

#insere dados na tabela de produtos do pedido
insert into `produtos_do_pedido` (numeroDoPedido,codigoDoProduto,quantidade)
value ('123456789',3,1);

# Insere dados na tabela de funcionários
insert into `funcionarios`(matricula,nome,dataDeAdmissao,cargo,salario)
values
(238659,'boruto Uzumaki',STR_TO_DATE('24-may-2020', '%d-%M-%Y'),'admin',15000.00),
(788639,'sarada Uchiha',STR_TO_DATE('24-may-2020', '%d-%M-%Y'),'funcionario',2000.00),
(968649,'kazuto Haruno',STR_TO_DATE('24-may-2020', '%d-%M-%Y'),'funcionario',1500.00),
(468339,'Hitake Kakashi',STR_TO_DATE('24-may-2020', '%d-%M-%Y'),'funcionario',2300.00),
(114679,'Eren Ackerman',STR_TO_DATE('24-may-2020', '%d-%M-%Y'),'admin',12000.00),
(794529,'Michael jordan',STR_TO_DATE('05-october-2020', '%d-%M-%Y'),'funcionario',1200.00),
(458679,'Naruto Uzumaki',STR_TO_DATE('24-may-2020', '%d-%M-%Y'),'programador',8000.00),
(228679,'Sasuke Uchiha',STR_TO_DATE('24-may-2020', '%d-%M-%Y'),'designer',7000.00),
(238679,'Sakura Haruno',STR_TO_DATE('24-may-2020', '%d-%M-%Y'),'analista',10000.00),
(998679,'Hatake Kakashi',STR_TO_DATE('24-may-2020', '%d-%M-%Y'),'dev ops',4000.00),
(328679,'Levi Ackerman',STR_TO_DATE('24-may-2020', '%d-%M-%Y'),'programador',5000.00),
(098629,'Michael jackson',STR_TO_DATE('05-october-2020', '%d-%M-%Y'),'programador',4500.00);

select * from `funcionarios`;
# Insere dados na tabela de chamados
insert into chamados
(ticket,statusDoChamado,codigoDoCliente,codigoDoPedido,descricao,codigoDoFuncionario)
values(12348,'aberto','12312312321','123456789',null,318679);


# Insere dados na tabela de avaliações de produtos
insert into `avaliacoes_produtos`(codigoDoProduto,codigoDoCliente,nota,descricao)
value(4,'12312312321',2,null);


select numeroDoPedido, formaPagamento, valorTotal
from pedidos
where formaPagamento in ('pix');

select * from funcionarios;

select * 
  from funcionarios
 where salario > (select salario 
					from funcionarios 
				   where nome = 'Sakura');