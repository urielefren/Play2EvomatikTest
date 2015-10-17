# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table persona (
  rfc                       varchar(255) not null,
  nombre                    varchar(255),
  edad                      integer,
  constraint pk_persona primary key (rfc))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table persona;

SET FOREIGN_KEY_CHECKS=1;

