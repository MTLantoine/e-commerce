-- Catalogue

insert into CATALOGUE (id, name) values (1, 'LECLERCQ');

-- Stocks of Article

insert into ARTICLE (id, name, price) values (1, 'Pomme', 1);
insert into STOCK (id, quantity, catalogue_id, article_id) values (1, 130, 1, 1);

insert into ARTICLE (id, name, price) values (2, 'Jambon', 4);
insert into STOCK (id, quantity, catalogue_id, article_id) values (2, 200, 1, 2);

insert into ARTICLE (id, name, price) values (3, 'Paquet de riz', 3);
insert into STOCK (id, quantity, catalogue_id, article_id) values (3, 100, 1, 3);

insert into ARTICLE (id, name, price) values (4, 'Mozarella', 3);
insert into STOCK (id, quantity, catalogue_id, article_id) values (4, 0, 1, 4);

insert into ARTICLE (id, name, price) values (5, 'Téléphone', 400);
insert into STOCK (id, quantity, catalogue_id, article_id) values (5, 90, 1, 5);

insert into ARTICLE (id, name, price) values (6, 'Machine à laver', 800);
insert into STOCK (id, quantity, catalogue_id, article_id) values (6, 18, 1, 6);

insert into ARTICLE (id, name, price) values (7, 'Empty', 500);
insert into STOCK (id, quantity, catalogue_id, article_id) values (7, 0, 1, 7);

-- Reductions

insert into REDUCTION (id, percent, number_of_use) values (1, 80, 2);
insert into REDUCTION (id, percent, number_of_use) values (2, 50, 2);
insert into REDUCTION (id, percent, number_of_use) values (3, 20, 2);
insert into REDUCTION (id, percent, number_of_use) values (4, 10, 2);
insert into REDUCTION (id, percent, number_of_use) values (5, 0, 2);

-- Clients

insert into CLIENT (id, firstname, lastname, money, reduction_id) values (1, 'Antoine', 'Mortelier', 1000, 1);
insert into CLIENT (id, firstname, lastname, money, reduction_id) values (2, 'Alexandre', 'Janaszek', 500, 2);
insert into CLIENT (id, firstname, lastname, money, reduction_id) values (3, 'Cathy', 'Houdart', 300, 3);
insert into CLIENT (id, firstname, lastname, money, reduction_id) values (4, 'Logan', 'Chenavier', 200, 4);
insert into CLIENT (id, firstname, lastname, money, reduction_id) values (5, 'Pierre', 'Mullier', 100, 5);