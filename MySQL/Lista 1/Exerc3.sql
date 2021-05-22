create database db_escola;

use db_escola;

create table tb_alunes(
id bigint auto_increment,
Nome varchar (30),
RA bigint,
Turma int,
sala int,
notaFinal int,

primary key(id)
);

insert into tb_alunes(Nome, RA, Turma, sala, notaFinal) values ("Luiz Adrino", 7418, 33, 9, 10);

insert into tb_alunes(Nome, RA, Turma, sala, notaFinal) values ("Rony Rústico", 4521, 33, 9, 9);

insert into tb_alunes(Nome, RA, Turma, sala, notaFinal) values ("Patrick de Paula", 4533, 31, 8, 6);

insert into tb_alunes(Nome, RA, Turma, sala, notaFinal) values ("Felipe Melo", 4514, 31, 8, 5);

insert into tb_alunes(Nome, RA, Turma, sala, notaFinal) values ("Gustavo Gomez", 4509, 30, 7, 9);

insert into tb_alunes(Nome, RA, Turma, sala, notaFinal) values ("Luan Cardoso", 4503, 30, 7, 4);

insert into tb_alunes(Nome, RA, Turma, sala, notaFinal) values ("Weverton Garcia", 4501, 29, 6, 10);

insert into tb_alunes(Nome, RA, Turma, sala, notaFinal) values ("Raphael Veiga", 4498, 27, 6, 7);

select * from tb_alunes where notaFinal > 7;

select * from tb_alunes where notaFinal < 7;

update tb_alunes set RA=4425 where id=4
