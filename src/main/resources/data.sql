-- Catalogue

insert into CATALOGUE (id, name) values (1, 'LECLERCQ');

-- Stocks

insert into STOCK (id, name, price, quantity, catalogue_id) values (1, 'Pomme', 1, 130, 1);
insert into STOCK (id, name, price, quantity, catalogue_id) values (2, 'Jambon', 4, 200, 1);
insert into STOCK (id, name, price, quantity, catalogue_id) values (3, 'Paquet de riz', 2, 100, 1);
insert into STOCK (id, name, price, quantity, catalogue_id) values (4, 'Mozarella', 2.5, 0, 1);
insert into STOCK (id, name, price, quantity, catalogue_id) values (5, 'Téléphone', 400, 90, 1);
insert into STOCK (id, name, price, quantity, catalogue_id) values (6, 'Machine à laver', 800, 18, 1);
insert into STOCK (id, name, price, quantity, catalogue_id) values (7, 'EMPTY', 500, 0, 1);

-- Articles

insert into ARTICLE (id, name, price) values (1, 'Pomme', 1);
insert into ARTICLE (id, name, price) values (2, 'Jambon', 4);
insert into ARTICLE (id, name, price) values (3, 'Paquet de riz', 2);
insert into ARTICLE (id, name, price) values (4, 'Mozarella', 2.5);
insert into ARTICLE (id, name, price) values (5, 'Téléphone', 400);
insert into ARTICLE (id, name, price) values (6, 'Machine à laver', 800);
insert into ARTICLE (id, name, price) values (7, 'Empty', 500);

-- Clients

insert into CLIENT (id, firstname, lastname, money) values (1, 'Antoine', 'Mortelier', 1000);
insert into CLIENT (id, firstname, lastname, money) values (2, 'Alexandre', 'Janaszek', 500);
insert into CLIENT (id, firstname, lastname, money) values (3, 'Cathy', 'Houdart', 300);
insert into CLIENT (id, firstname, lastname, money) values (4, 'Logan', 'Chenavier', 200);
insert into CLIENT (id, firstname, lastname, money) values (5, 'Pierre', 'Mullier', 100);