create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
	id bigint auto_increment,
    cliente varchar(50),
    telefone bigint,
    endereco varchar (100),
    primary key (id)
);

insert into tb_categoria (cliente, telefone, endereco) values ("Fernanda Costa", 911223344, "Rua Hugo Faria, N° 152, São Paulo");
insert into tb_categoria (cliente, telefone, endereco) values ("Claudia Cintra", 922334455, "Rua Cladio Estadio, N° 87, São Paulo");
insert into tb_categoria (cliente, telefone, endereco) values ("Felipe Silva", 933445566, "Avenida Bruno Guimarães, N° 6587, BL D AP 7, Suzano");
insert into tb_categoria (cliente, telefone, endereco) values ("Miguel Dantas", 944556677, "Rua Rio de Janeiro, N° 64, Itaquaquecetuba");
insert into tb_categoria (cliente, telefone, endereco) values ("Agata Pereira", 955667788, "Rua Da Esperança, N° 987, Mogi das Cruzes");

select * from tb_categoria;

create table tb_produtos(
id bigint auto_increment,
	tipo varchar(255) not null,
    quantidade int,
	nome varchar (255) not null,
    valor float not null,
    pedido int,
	categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produtos (tipo, quantidade, nome, valor, pedido, categoria_id) values ("Cosméticos", 2, "Shampoo", "47.33", 965, 1);
insert tb_produtos (tipo, quantidade, nome, valor, pedido, categoria_id) values ("Remédios", 1, "Dipirona", "3.99", 965, 1);	
insert tb_produtos (tipo, quantidade, nome, valor, pedido, categoria_id) values ("Suplementos", 2, "Hipercalórico", "115.39", 145, 2);
insert tb_produtos (tipo, quantidade, nome, valor, pedido, categoria_id) values ("Utensílios", 1, "Umidificado de Ar", "99.99", 478 , 3);
insert tb_produtos (tipo, quantidade, nome, valor, pedido, categoria_id) values ("Manipulados", 1, "Cloroquina 250mg / Prednisona 2mg", "88.45", 663, 4);
insert tb_produtos (tipo, quantidade, nome, valor, pedido, categoria_id) values ("Pomadas", 1, "Hipoglós", "19.77", 258, 5);
insert tb_produtos (tipo, quantidade, nome, valor, pedido, categoria_id) values ("Remédios", 2, "Busonid-120", "56.99", 663, 4);
insert tb_produtos (tipo, quantidade, nome, valor, pedido, categoria_id) values ("Cosméticos", 1, "Protetor Solar", "24.99", 258, 5);

select * from tb_produtos;

select * from tb_produtos where valor > 50;

select * from tb_produtos where valor between 3 and 60;

select * from tb_produtos where nome like "%B%";

select tipo, quantidade, nome, valor, pedido, tb_categoria.cliente as descricao_da_classe ,tb_categoria.endereco as estado_da_classe
 from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;

select * from tb_produtos where tipo="Cosméticos";

