-- Catalogue

insert into CATALOGUE (id, name) values (1, 'LECLERCQ');

-- Stocks

insert into STOCK (id, name, quantity, catalogue_id) values (1, 'Pomme', 130, 1);
insert into STOCK (id, name, quantity, catalogue_id) values (2, 'Jambon', 200, 1);
insert into STOCK (id, name, quantity, catalogue_id) values (3, 'Paquet de riz', 100, 1);
insert into STOCK (id, name, quantity, catalogue_id) values (4, 'Mozarella', 0, 1);
insert into STOCK (id, name, quantity, catalogue_id) values (5, 'Téléphone', 90, 1);
insert into STOCK (id, name, quantity, catalogue_id) values (6, 'Machine à laver', 18, 1);
insert into STOCK (id, name, quantity, catalogue_id) values (7, 'EMPTY', 0, 1);

-- Clients

insert into CLIENT (id, firstname, lastname) values (1, 'Antoine', 'Mortelier');
insert into CLIENT (id, firstname, lastname) values (2, 'Alexandre', 'Janaszek');
insert into CLIENT (id, firstname, lastname) values (3, 'Cathy', 'Houdart');
insert into CLIENT (id, firstname, lastname) values (4, 'Logan', 'Chenavier');
insert into CLIENT (id, firstname, lastname) values (5, 'Pierre', 'Mullier');