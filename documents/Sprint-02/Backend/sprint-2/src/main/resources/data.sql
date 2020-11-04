insert into cliente
(id,nome,email,telefone,cpf,rg,senha,cep,cidade,estado,logradouro) values
(null,'Matheus','matheus@simplify.com','11963758133','76438728734','998777662','senhaForte','1000000','São Paulo','SP','Av Paulista'),
(null,'Jairo','jairo@simplify.com','11962258109','78338721093','945547452','senha','2093894','São Paulo','SP','Av São Miguel'),
(null,'Pedro Henrique','p.henrique@simplify.com','11987638100','83438720083','998828600','piada','3902093','São Paulo','SP','Radial Leste'),
(null,'Leonardo','leonardo@simplify.com','11987987635','76983727438','998023875','packer','0949304','São Paulo','SP','Av Europa'),
(null,'Carina','carina@simplify.com','11999736273','76438728734','998930123','safra','8498539','São Paulo','SP','Av Brasil'),
(null,'Eduarda','eduarda@simplify.com','11983923489','76438098345','909235847','parmera','3234854','São Paulo','SP','Av Imperador');

insert into solicitacao
(id, Descricao, Presencial, cliente_id) values
(null,'Certidão de Nascimento ', 'false' ,1),
(null,'Compra de imóveis', 'true',2),
(null,'Certidão de Nascimento ', 'false',3),
(null,'Certidão de Casamento ', 'false',4),
(null,'Certidão de Nascimento ', 'false',5),
(null,'Compra de imóveis', 'true',6),
(null,'Certidão de Casamento ', 'false',1);

insert into agendamento
(id,nome, endereco, data, solicitacao_id) values
(null,'Cartório Vila Matilde ','Waldemar 2020', '2020-10-31' ,2),
(null,'Cartório do Bem ','Av Paulista 3000', '2020-10-30',6);

insert into pagamento
(id, Descricao, solicitacao_id) values
(null,'Boleto ',1),
(null,'Boleto ',2),
(null,'Boleto ',3),
(null,'Boleto ',4),
(null,'Boleto ',5),
(null,'Cartão de crédito',6),
(null,'Cartão de crédito',7);