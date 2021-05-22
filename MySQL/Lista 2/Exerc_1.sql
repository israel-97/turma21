create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
	id bigint auto_increment,
	tipoPersonagem varchar(50),
	registro int,
	origem varchar(50),
    primary key (id)
);
insert into tb_classe (tipoPersonagem, registro, origem) values ("Futurista", 142, "Terra");
insert into tb_classe (tipoPersonagem, registro, origem) values ("Fictício Atual", 145, "Asgard");
insert into tb_classe (tipoPersonagem, registro, origem) values ("Antigo", 741, "Reino da Floresta");
insert into tb_classe (tipoPersonagem, registro, origem) values ("Fictício Antigo", 523, "Terra");
insert into tb_classe (tipoPersonagem, registro, origem) values ("Atual", 369, "Namekusei");

select * from tb_classe;

create table tb_personagem(
	id bigint auto_increment,
	nomePersonagem varchar(50) not null,
	arma varchar (50),
    forcaAtaque int,
	forcaDefesa int,
    classes varchar(50),
	classe_id bigint,
primary key (id),
foreign key (classe_id) references tb_classe (id)
);


insert tb_personagem (nomePersonagem, arma, forcaAtaque, forcaDefesa, classes, classe_id) values ("Hulk", "Força", 3000 , 3000, "herói", 4);
insert tb_personagem (nomePersonagem, arma, forcaAtaque, forcaDefesa, classes, classe_id) values ("Legolas", "Arqueiro", 1800, 2000, "herói", 3);
insert tb_personagem (nomePersonagem, arma, forcaAtaque, forcaDefesa, classes, classe_id) values ("Thor","Martelo", 2500, 2400, "herói", 2);
insert tb_personagem (nomePersonagem, arma, forcaAtaque, forcaDefesa, classes, classe_id) values ("Flash","Velocidade", 1300, 1200, "herói", 4);
insert tb_personagem (nomePersonagem, arma, forcaAtaque, forcaDefesa, classes, classe_id) values ("Hunter","Arma de Fogo", 1400, 1900, "herói", 1);
insert tb_personagem (nomePersonagem, arma, forcaAtaque, forcaDefesa, classes, classe_id) values ("Capitão América", "Escudo", 2500, 2500, "herói", 2);
insert tb_personagem (nomePersonagem, arma, forcaAtaque, forcaDefesa, classes, classe_id) values ("Vigarista","Arqueiro", 1700, 1600, "Vilão",1);
insert tb_personagem (nomePersonagem, arma, forcaAtaque, forcaDefesa, classes, classe_id) values ("Piccolo","Artes Marciais", 8000, 7000, "Vilão", 5);

select * from tb_personagem;

select * from tb_personagem where forcaAtaque > 2000;

select * from tb_personagem where forcaDefesa between 1000 and 2000;

select * from tb_personagem where nomePersonagem like "%f%";

select nomePersonagem, origem, forcaAtaque, forcaDefesa, classes, tb_classe.tipoPersonagem as descricao_da_lasse ,tb_classe.origem as estado_da_classe
 from tb_personagem inner join tb_classe on  tb_classe.id = tb_personagem.classe_id;

select * from tb_personagem where arma="Arqueiro";

