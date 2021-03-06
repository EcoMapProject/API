-- USERS AND THEIR ROLES TABLES

create table users
    (id serial not null,
    username varchar(50) not null unique,
    password varchar(50) not null,
    email varchar(50),
    phone varchar(50),
    enabled boolean default true,
    primary key (id));;

create table user_roles(
    username varchar(50) not null,
    role varchar(50) not null,
    constraint fk_user_roles foreign key(username) references users(username),
    primary key (username));

create unique index user_role_id on user_roles (username, role);

-- BINS TABLE

create table bins
    (id serial not null,
    name varchar(50) not null,
    address varchar(50),
    description varchar(500),
    latitude varchar(50) not null,
    longitude varchar(50) not null,
    primary key (id));;