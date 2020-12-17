-- Catalogue

insert into CATALOGUE (id, name) values (1, 'LECLERCQ');

-- Stocks of Article

insert into STOCK (id, quantity, catalogue_id) values (1, 130, 1);
insert into ARTICLE (id, name, price, stock_id) values (1, 'Pomme', 1, 1);

insert into STOCK (id, quantity, catalogue_id) values (2, 200, 1);
insert into ARTICLE (id, name, price, stock_id) values (2, 'Jambon', 4, 2);

insert into STOCK (id, quantity, catalogue_id) values (3, 100, 1);
insert into ARTICLE (id, name, price, stock_id) values (3, 'Paquet de riz', 2, 3);

insert into STOCK (id, quantity, catalogue_id) values (4, 0, 1);
insert into ARTICLE (id, name, price, stock_id) values (4, 'Mozarella', 3, 4);

insert into STOCK (id, quantity, catalogue_id) values (5, 90, 1);
insert into ARTICLE (id, name, price, stock_id) values (5, 'Téléphone', 400, 5);

insert into STOCK (id, quantity, catalogue_id) values (6, 18, 1);
insert into ARTICLE (id, name, price, stock_id) values (6, 'Machine à laver', 800, 6);

insert into STOCK (id, quantity, catalogue_id) values (7, 0, 1);
insert into ARTICLE (id, name, price, stock_id) values (7, 'Empty', 500, 7);

-- Clients

insert into CLIENT (id, firstname, lastname, money) values (1, 'Antoine', 'Mortelier', 1000);
insert into CLIENT (id, firstname, lastname, money) values (2, 'Alexandre', 'Janaszek', 500);
insert into CLIENT (id, firstname, lastname, money) values (3, 'Cathy', 'Houdart', 300);
insert into CLIENT (id, firstname, lastname, money) values (4, 'Logan', 'Chenavier', 200);
insert into CLIENT (id, firstname, lastname, money) values (5, 'Pierre', 'Mullier', 100);
