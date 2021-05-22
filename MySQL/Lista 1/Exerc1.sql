create database db_rh
use db_rh;

create table tb_funcionaries(
	id bigint auto_increment,
	nome varchar(30),
	cpf bigint,
	salario double,
	registro bigint,
	telefon double,

	primary key (id)

);



insert into tb_funcionaries(nome, cpf, salario, registro, telefone) values ("Israel Dantas", 22211133387, 3000.00, "3377", 955441177) 

insert into tb_funcionaries(nome, cpf, salario, registro, telefone) values ("Julio Marques", 11155599746, 5364.74, "3363", 954889963) 

insert into tb_funcionaries(nome, cpf, salario, registro, telefone) values ("Felipe Silva", 99977788823, 1544.65, "3389", 966334478) 

insert into tb_funcionaries(nome, cpf, salario, registro, telefone) values ("Natanael Oliveira", 00033478544, 1100.00, "3392", 925874123) 

insert into tb_funcionaries(nome, cpf, salario, registro, telefone) values ("Rony Rústico", 20030041266, , "3363", 954889963) 

select * from tb_funcionaries where salario > 2000

select * from tb_funcionaries where salario < 2000

update tb_funcionaries set registro=3322 where id=5