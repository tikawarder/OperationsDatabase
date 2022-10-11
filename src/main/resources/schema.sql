create table store (
id bigint not null primary key,
fromlevel bigint,
tolevel bigint,
loadPeople bigint,
unloadPeople bigint,
state varchar(8)
);