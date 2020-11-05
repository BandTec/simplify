
insert into usuario(id,nome,sobrenome,dataNascimento,CPF,email,senha,endereco,num,complemento,cep) values
(null,'Carina','Di Domenico','10/10/2001','000111','carina@simplify.com','gatinhos','Av Paulista',300,'Sem complemento','1025600'),
(null,'Matheus','Candido','10/10/2001','000222','matheus@simplify.com','moçaBonita','Av Paulista',300,'Sem complemento','1025600'),
(null,'Eduarda','Alves','10/10/2001','000111','eduarda@simplify.com','PalmeirasMundial','Av Paulista',300,'Sem complemento','1025600'),
(null,'Leonardo','Packer','10/10/2001','000111','leonardo@simplify.com','odeioDigi','Av Paulista',300,'Sem complemento','1025600'),
(null,'Pedro','Henrique','10/10/2001','000111','pedro@simplify.com','piadas','Av Paulista',300,'Sem complemento','1025600'),
(null,'Jairo','Quintino','10/10/2001','000111','jairo@simplify.com','corinthians','Av Paulista',300,'Sem complemento','1025600'),

insert into servico
(id_presencial, Presencial,descricao, cliente_id) values
(null,'Certidão de Nascimento ', 'false' ,1),
(null,'false','Compra de imóveis', 2),
(null,'false','Certidão de Nascimento '3),
(null,'false','Certidão de Casamento ',4),
(null,'false','Certidão de Nascimento ',5),
(null,'false','Compra de imóveis',6),
(null,'false','Certidão de Casamento',1);

insert into agendamento
(id_agendamento,nomeCartorio, endereco, data, hora) values
(null,'Cartório Vila Matilde ','Waldemar 2020', '2020-10-31' ,'20:20'),
(null,'Cartório do Bem ','Av Paulista 3000', '2020-10-30','15:30');