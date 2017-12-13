create table cliente (
    id integer not null,
    name varchar(50) not null,
    email varchar(100) unique not null,
    constraint pk_cliente primary key (id)
);

create sequence seq_cliente;