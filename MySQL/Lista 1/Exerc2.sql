create database db_e_commerce
use db_e_commerce;

create table tb_produtos(
	id bigint auto_increment,
	mercadorias varchar(30),
	lote bigint,
	valor double,
	pedido bigint,
	venda double,

	primary key (id)

);
insert into tb_produtos(mercadorias, lote, valor, pedido, venda) values ("Chuteiras", 33414, 10543.44, 7412, 30452.43)
 
insert into tb_produtos(mercadorias, lote, valor, pedido, venda) values ("Caneleiras", 33341, 412.77, 9410, 5412.85)

insert into tb_produtos(mercadorias, lote, valor, pedido, venda) values (“Acessórios Futebol", 31254, 341.78, 10452, 3452.44 )


insert into tb_produtos(mercadorias, lote, valor, pedido, venda) values ("Camisa Times", 99654, 9745.21, 1145, 24698.30)

insert into tb_produtos(mercadorias, lote, valor, pedido, venda) values ("Agasalhos Times e Seleções", 45236, 12542.12, 854, 35452.47)

insert into tb_produtos(mercadorias, lote, valor, pedido, venda) values ("Tênis", 7456, 15987.55, 1452, 40452.14)

insert into tb_produtos(mercadorias, lote, valor, pedido, venda) values ("Boné", 452, 2514.44, 741, 6478.39)

insert into tb_produtos(mercadorias, lote, valor, pedido, venda) values ("Bolas", 214, 1800.44, 4174, 3411.85)

select * from tb_produtos where valor > 500

select * from tb_produtos where valor < 500

update tb_produtos set valor=245.65 where id=3

