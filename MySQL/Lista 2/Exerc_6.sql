create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
	id bigint auto_increment,
    nomeAluno varchar(100),
    email varchar(100),
    telefone bigint,
    primary key (id)
);
insert tb_categoria (nomeAluno, email, telefone) values ("Aline Costa","aline@gmail.com", 999887766);
insert tb_categoria (nomeAluno, email, telefone) values ("Antonio Silveira","antonio@gmail.com", 988776655);
insert tb_categoria (nomeAluno, email, telefone) values ("Sophia Vitória","sophia@gmail.com", 977665544);
insert tb_categoria (nomeAluno, email, telefone) values ("Jonatas Queiroz","jonatas@gmail.com", 966554433);
insert tb_categoria (nomeAluno, email, telefone) values ("Monique Nonato","monique@gmail.com", 911223344);

select * from tb_categoria;

create table tb_curso(
id bigint auto_increment,
	departamento varchar(255) not null,
    nomeCurso varchar (255) not null,
    cargaHoraria varchar(50),
    valor float not null,
    certificacao boolean,
	categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);
insert tb_curso (departamento, nomeCurso, cargaHoraria, valor, certificacao, categoria_id) values ("Desenvolvimento Linguagens","Java","100 Horas", 149.15, true, 1);
insert tb_curso (departamento, nomeCurso, cargaHoraria, valor, certificacao, categoria_id) values ("TI e Software","Hardware","124 Horas", 189.99, true, 2);
insert tb_curso (departamento, nomeCurso, cargaHoraria, valor, certificacao, categoria_id) values ("Músicas Instrumentos","Piano","80 Horas", 49.99, true, 3);
insert tb_curso (departamento, nomeCurso, cargaHoraria, valor, certificacao, categoria_id) values ("Idiomas","Inglês","300 horas", 1100.99, true, 4);
insert tb_curso (departamento, nomeCurso, cargaHoraria, valor, certificacao, categoria_id) values ("Marketing","Publicidade","180 horas", 249.99, true, 5);
insert tb_curso (departamento, nomeCurso, cargaHoraria, valor, certificacao, categoria_id) values ("Negócios","Administração","148 horas", 199.99, true, 1);
insert tb_curso (departamento, nomeCurso, cargaHoraria, valor, certificacao, categoria_id) values ("Fotografia e Vídeo","Fotografia","70 Horas", 49.99, true, 2);
insert tb_curso (departamento, nomeCurso, cargaHoraria, valor, certificacao, categoria_id) values ("Negócios","Cominicações","90 horas", 129.55, true, 3);

select * from tb_curso;

select * from tb_curso where valor > 50;

select * from tb_curso where valor between 3 and 60;

select * from tb_curso where nomeCurso like "%J%";

select departamento, nomeCurso, cargaHoraria, valor, certificacao, tb_categoria.nomeAluno as descricao_da_classe ,tb_categoria.email as estado_da_classe
 from tb_curso inner join tb_categoria on  tb_categoria.id = tb_curso.categoria_id;

select * from tb_curso where departamento="Desenvolvimento Linguagens";











