create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
	id bigint auto_increment,
    nome varchar(100),
    email varchar(100),
    telefone bigint,
    primary key (id)
);
insert into tb_categoria (nome, email, telefone) values ("Jairo Pessoa", "jairo@gmail.com", 911223344);
insert into tb_categoria (nome, email, telefone) values ("Flavia Fagundez", "flavia@gmail.com", 922334455);
insert into tb_categoria (nome, email, telefone) values ("Gabriela Bezerra", "gabi@gmail.com", 933445566);
insert into tb_categoria (nome, email, telefone) values ("João Barros", "joao@gmail.com", 944556677);
insert into tb_categoria (nome, email, telefone) values ("Jose Pereira", "jose@gmail.com", 955667788);

select * from tb_categoria;

create table tb_produtos(
id bigint auto_increment,
	departamento varchar(255) not null,
    nomeProduto varchar (255) not null,
    quantidade int,
    valor float not null,
    pedido int,
	categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_produtos (departamento, nomeProduto, quantidade, valor, pedido, categoria_id) values ("Banheiros", "Chuveiro", 1, 78.89, 5236, 1);
insert into tb_produtos (departamento, nomeProduto, quantidade, valor, pedido, categoria_id) values ("Materiais Hidráulicos", "Sifão para Pia", 1, 22.15, 5236, 1);
insert into tb_produtos (departamento, nomeProduto, quantidade, valor, pedido, categoria_id) values ("Ferramentas", "Alicate", 2, 61.33, 4125, 2);
insert into tb_produtos (departamento, nomeProduto, quantidade, valor, pedido, categoria_id) values ("Ferragens", "Lixeira de Calçada", 1, 339.90, 8742, 3);
insert into tb_produtos (departamento, nomeProduto, quantidade, valor, pedido, categoria_id) values ("Materia de Construção", "1m de Areia", 1, 100.65, 7852, 4);
insert into tb_produtos (departamento, nomeProduto, quantidade, valor, pedido, categoria_id) values ("Materia de Construção", "Cimento", 5, 125.02, 7852, 4);
insert into tb_produtos (departamento, nomeProduto, quantidade, valor, pedido, categoria_id) values ("Ferragens", "Janela", 2, 1250.79, 4125, 2);
insert into tb_produtos (departamento, nomeProduto, quantidade, valor, pedido, categoria_id) values ("Iluminação", "Lâmpada", 1, 14.99, 1254, 5);

select * from tb_produtos;

select * from tb_produtos where valor > 50;

select * from tb_produtos where valor between 3 and 60;

select * from tb_produtos where nomeProduto like "%C%";

select departamento, nomeProduto, quantidade, valor, pedido, tb_categoria.nome as descricao_da_classe ,tb_categoria.email as estado_da_classe
 from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;

select * from tb_produtos where departamento="Materiais Hidráulicos";

