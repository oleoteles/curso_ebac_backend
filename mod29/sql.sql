select * from tb_cliente;

select * from tb_cliente where codigo = "01";

create table tb_produto (
	id bigint,
	nome varchar(50) not null,
	codigo varchar(50) not null,
	constraint pk_id_produto primary key(id)
);

create sequence sq_produto
start 1
increment 1
owned by tb_produto.id;

select * from tb_produto;