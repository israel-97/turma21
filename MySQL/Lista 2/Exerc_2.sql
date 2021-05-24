create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
	id bigint auto_increment,
    cliente varchar(50),
    telefone bigint,
    endereco varchar (100),
    primary key (id)
);
insert into tb_categoria (cliente, telefone, endereco) values ("Beatriz Cavalcante", 911223344, "Rua Quinze de Abril, N 64, São Paulo");
insert into tb_categoria (cliente, telefone, endereco) values ("Flavio Augusto", 922334455, "Rua Augusta, N 2547, BL8 AP4, São Paulo");
insert into tb_categoria (cliente, telefone, endereco) values ("João Carlos", 933445566, "Rua Joaquim Ferreira, N 35, Cotia");
insert into tb_categoria (cliente, telefone, endereco) values ("Pedro Fernando", 944556677, "Rua Comendador Avelino, N 785, São Paulo");
insert into tb_categoria (cliente, telefone, endereco) values ("Julia Albuquerque", 955667788, "Rua Petrópolis, N 2021, Guarulhos");

select * from tb_categoria;

create table tb_pizza(
id bigint auto_increment,
	tipo varchar(255) not null,
    quantidade int,
	sabor varchar (255) not null,
    valor float not null,
    pedido int,
	categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_pizza (tipo, quantidade, sabor, valor, pedido, categoria_id) values ("Salgada", 1, "Calabresa", "28.99", 111, 1);
insert tb_pizza (tipo, quantidade, sabor, valor, pedido, categoria_id) values ("Salgada", 2, "Camarão aos Queijos", "116.41", 222, 2);	
insert tb_pizza (tipo, quantidade, sabor, valor, pedido, categoria_id) values ("Salgada", 2, "Pepperoni ", "99.14", 333, 3);
insert tb_pizza (tipo, quantidade, sabor, valor, pedido, categoria_id) values ("Salgada", 2, "Mussarela", "29.99", 444, 4);
insert tb_pizza (tipo, quantidade, sabor, valor, pedido, categoria_id) values ("Salgada", 1, "Portuguesa", "37.99", 555, 5);
insert tb_pizza (tipo, quantidade, sabor, valor, pedido, categoria_id) values ("Doce", 1, "Creme de Avelã com Chocolate", "62.99", 666, 2);
insert tb_pizza (tipo, quantidade, sabor, valor, pedido, categoria_id) values ("Doce", 1, "Romeu e Julieta", "53.77", 777, 1);
insert tb_pizza (tipo, quantidade, sabor, valor, pedido, categoria_id) values ("Doce", 1, "Morango com Chocolate", "50.99", 888, 5);

select * from tb_pizza;

select * from tb_pizza where valor > 45;

select * from tb_pizza where valor between 29 and 60;

select * from tb_pizza where sabor like "%C%";

select tipo, quantidade, sabor, valor, pedido, tb_categoria.cliente as descricao_da_classe ,tb_categoria.endereco as estado_da_classe
 from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id;
 
 select * from tb_pizza where tipo="Doce";