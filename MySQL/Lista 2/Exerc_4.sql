create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
	id bigint auto_increment,
    descricao varchar(50),
    ativo boolean,
    registro int,
    primary key (id)
);

insert into tb_categoria (descricao, ativo, registro) values ("Frutas", true, 301);
insert into tb_categoria (descricao, ativo, registro) values ("Legumes", true, 408);
insert into tb_categoria (descricao, ativo, registro) values ("Verduras", true, 154);
insert into tb_categoria (descricao, ativo, registro) values ("Temperos", true, 74);
insert into tb_categoria (descricao, ativo, registro) values ("Bebidas", true, 741);

select * from tb_categoria;

create table tb_produto(
id bigint auto_increment,
	nome varchar(255) not null,
    quantidade int,
	valor float not null,
    cartao boolean,
    nVenda bigint,
	categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produto (nome, quantidade, valor, cartao, nVenda, categoria_id) values ("Laranja", 12, 6.99, true, 11,1);
insert tb_produto (nome, quantidade, valor, cartao, nVenda, categoria_id) values ("Cenoura", 6, 4.99, false, 44, 2);	
insert tb_produto (nome, quantidade, valor, cartao, nVenda, categoria_id) values ("Alface", 1, 1.99, false, 77, 3);
insert tb_produto (nome, quantidade, valor, cartao, nVenda, categoria_id) values ("Tempero Baiano", 1, 2.99, false, 63, 4);
insert tb_produto (nome, quantidade, valor, cartao, nVenda, categoria_id) values ("Mel", 4, 78.99, true, 102, 5);
insert tb_produto (nome, quantidade, valor, cartao, nVenda, categoria_id) values ("Manga", 25, 35.53, true, 32, 3);
insert tb_produto (nome, quantidade, valor, cartao, nVenda, categoria_id) values ("Tomate", 12, 13.25, false, 46, 2);
insert tb_produto (nome, quantidade, valor, cartao, nVenda, categoria_id) values ("Cominho", 3, 5.99, false, 65, 1);

select * from tb_produto;

select * from tb_produto where valor > 50;

select * from tb_produto where valor between 3 and 60;

select * from tb_produto where nome like "%C%";

select nome, quantidade, valor, cartao, nVenda, tb_categoria.descricao as descricao_da_classe ,tb_categoria.ativo as estado_da_classe
 from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto where nome="Cenoura";

