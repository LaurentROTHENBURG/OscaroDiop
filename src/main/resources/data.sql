

insert into part_group (id, name) VALUES
(nextval('part_group_id_seq'), 'Eclairage'),
(nextval('part_group_id_seq'), 'Motorisation'),
(nextval('part_group_id_seq'), 'Climatisation'),
(nextval('part_group_id_seq'), 'Echapement'),
(nextval('part_group_id_seq'), 'Train roulant'),
(nextval('part_group_id_seq'), 'Freinage'),
(nextval('part_group_id_seq'), 'Direction'),
(nextval('part_group_id_seq'), 'Carrosserie') ;

insert into part_type (id, name, part_group_id) VALUES
(nextval('part_type_id_seq'), 'feux Droit', 1),
(nextval('part_type_id_seq'), 'feux Gauche', 1),
(nextval('part_type_id_seq'), 'Support de Feux Gauche', 1),
(nextval('part_type_id_seq'), 'Support de Feux Droite', 1),
(nextval('part_type_id_seq'), 'Lumiere Droite', 1),
(nextval('part_type_id_seq'), 'Lumiere Gauche', 1),
(nextval('part_type_id_seq'), 'Alternateur', 2),
(nextval('part_type_id_seq'), 'Embrayage', 2),
(nextval('part_type_id_seq'), 'culasse ', 2),
(nextval('part_type_id_seq'), 'turbo', 2),
(nextval('part_type_id_seq'), 'Moteur', 2),
(nextval('part_type_id_seq'), 'injecteur', 2),
(nextval('part_type_id_seq'), 'démarreur', 2),
(nextval('part_type_id_seq'), 'filtre à air', 2),
(nextval('part_type_id_seq'), 'bougie', 2),
(nextval('part_type_id_seq'), 'pompe', 2),
(nextval('part_type_id_seq'), 'filtre à carburant', 2),
(nextval('part_type_id_seq'), 'kit de distribution', 2),
(nextval('part_type_id_seq'), 'Pot catalytique', 4),
(nextval('part_type_id_seq'), 'silencieux', 4),
(nextval('part_type_id_seq'), 'Pot catalytique', 4),
(nextval('part_type_id_seq'), 'Tambour', 6),
(nextval('part_type_id_seq'), 'disque', 6),
(nextval('part_type_id_seq'), 'plaquettes de frein', 6),
(nextval('part_type_id_seq'), 'mâchoire', 6),
(nextval('part_type_id_seq'), 'câble de frein', 6),
(nextval('part_type_id_seq'), 'cardans', 5),
(nextval('part_type_id_seq'), 'Rotules', 5),
(nextval('part_type_id_seq'), 'pneus ', 5),
(nextval('part_type_id_seq'), 'roulements', 5),
(nextval('part_type_id_seq'), 'bras', 5),
(nextval('part_type_id_seq'), 'fusee', 5),
(nextval('part_type_id_seq'), 'amortisseurs', 5),
(nextval('part_type_id_seq'), 'Compresseur', 3),
(nextval('part_type_id_seq'), 'filtre d''habitacle', 3),
(nextval('part_type_id_seq'), 'evap', 3),
(nextval('part_type_id_seq'), 'Chauffage/ventilation', 3),
(nextval('part_type_id_seq'), 'Radiateur', 3),
(nextval('part_type_id_seq'), 'condensateur', 3),
(nextval('part_type_id_seq'), 'pulseur d''air', 3),
(nextval('part_type_id_seq'), 'sonde', 3),
(nextval('part_type_id_seq'), 'thermostat', 3),
(nextval('part_type_id_seq'), 'Rotule de direction', 7),
(nextval('part_type_id_seq'), 'bras de suspension', 7),
(nextval('part_type_id_seq'), 'barre stabilisatrice', 7),
(nextval('part_type_id_seq'), 'tableau de bord', 7),
(nextval('part_type_id_seq'), 'radio', 7),
(nextval('part_type_id_seq'), 'Pare-choc avant', 8),
(nextval('part_type_id_seq'), 'pare-choc arrière', 8),
(nextval('part_type_id_seq'), 'rétroviseurs Droit', 8),
(nextval('part_type_id_seq'), 'rétroviseurs Gauche', 8),
(nextval('part_type_id_seq'), 'bas de caisse', 8),
(nextval('part_type_id_seq'), 'portières', 8),
(nextval('part_type_id_seq'), 'male arriere', 8),
(nextval('part_type_id_seq'), 'ailes', 8),
(nextval('part_type_id_seq'), 'capot', 8),
(nextval('part_type_id_seq'), 'hayon', 8) ;                                                 ;

insert into brand (id, add_date, disable,name ) VALUES (nextval('brand_id_seq'), now(), false,'Acura'),
                                                       (nextval('brand_id_seq'),now(), false,'Seat'),
                                                       (nextval('brand_id_seq'),now(), false,'Alfa Romeo'),
                                                       (nextval('brand_id_seq'),now(), false,'Audi'),
                                                       (nextval('brand_id_seq'),now(), false,'BMW'),
                                                       (nextval('brand_id_seq'),now(), false,'Chevrolet'),
                                                       (nextval('brand_id_seq'),now(), false,'Tesla'),
                                                       (nextval('brand_id_seq'),now(), false,'Citroen'),
                                                       (nextval('brand_id_seq'),now(), false,'Daewoo'),
                                                       (nextval('brand_id_seq'),now(), false,'Dodge'),
                                                       (nextval('brand_id_seq'),now(), false,'Ferrari'),
                                                       (nextval('brand_id_seq'),now(), false,'Fiat'),
                                                       (nextval('brand_id_seq'),now(), false,'Ford'),
                                                       (nextval('brand_id_seq'),now(), false,'Peugeot'),
                                                       (nextval('brand_id_seq'),now(), false,'Renault'),
                                                       (nextval('brand_id_seq'),now(), false,'Volkswagen'),
                                                       (nextval('brand_id_seq'),now(), false,'Toyota'),
                                                       (nextval('brand_id_seq'),now(), false,'Nissan'),
                                                       (nextval('brand_id_seq'),now(), false,'Suzuki');

insert into model (id, add_date, disable,name,year,brand_id) VALUES (nextval('model_id_seq'), now(), false,'Legend',1987,1),
                                                                    (nextval('model_id_seq'), now(), false,'Legend',2000,1),
                                                                    (nextval('model_id_seq'), now(), false,'X5',2006,5),
                                                                    (nextval('model_id_seq'), now(), false,'X3',2007,5),
                                                                    (nextval('model_id_seq'), now(), false,'Fiesta',2011,13),
                                                                    (nextval('model_id_seq'), now(), false,'ESCAPE',2013,13),
                                                                    (nextval('model_id_seq'), now(), false,'Focus',2012,13),
                                                                    (nextval('model_id_seq'), now(), false,'Torino',2010,13),
                                                                    (nextval('model_id_seq'), now(), false,'SENTRA',2010,18),
                                                                    (nextval('model_id_seq'), now(), false,'MURANO',2011,18),
                                                                    (nextval('model_id_seq'), now(), false,'Forenza',2007,19),
                                                                    (nextval('model_id_seq'), now(), false,'ROGUE',2010,18),
                                                                    (nextval('model_id_seq'), now(), false,'Leon',2010,2),
                                                                    (nextval('model_id_seq'), now(), false,'Leon',2015,2);
<<<<<<< HEAD
insert into part (id, add_date,description, minimum_price,public_price,reference,serial_number,stock,model_id,part_type_id,disable) values
                                                     (nextval('part_id_seq'),now(),'feux Avant',50000,55000,'je ne sais pas','377T866ES',5,1,1,false),
                                                     (nextval('part_id_seq'),now(),'alternateurpartie',70000,75000,'je ne sais pas','278T866ES',3,2,2,false),
                                                     (nextval('part_id_seq'),now(),'MOTEUR + TRANSMISSION',800000,1000000,'','478T867ES',2,10,11,false),
                                                     (nextval('part_id_seq'),now(),'PORTE AVANT FOCUS 2012',60000,80000,'','677T867ES',8,7,52,false),
                                                     (nextval('part_id_seq'),now(),'BRAS FORD FOCUS',60000,85000,'','477T867ESLa',1,7,30,false)  ,
                                                     (nextval('part_id_seq'),now(),'COMPRESSEUR',80000,90000,'','',1,12,33,false) ;
=======
insert into part (id, add_date,description, minimum_price,public_price,reference,serial_number,stock,model_id,part_type_id) values
(nextval('part_id_seq'),now(),'feux Avant',50000,55000,'je ne sais pas','377T866ES',5,1,1),
(nextval('part_id_seq'),now(),'alternateurpartie',70000,75000,'je ne sais pas','278T866ES',3,2,2),
(nextval('part_id_seq'),now(),'MOTEUR + TRANSMISSION',800000,1000000,'','478T867ES',2,10,11),
(nextval('part_id_seq'),now(),'PORTE AVANT FOCUS 2012',60000,80000,'','677T867ES',8,7,52),
(nextval('part_id_seq'),now(),'BRAS FORD FOCUS',60000,85000,'','477T867ESLa',1,7,30)  ,
(nextval('part_id_seq'),now(),'COMPRESSEUR',80000,90000,'','',1,12,33) ;
>>>>>>> thio


INSERT INTO customer (id,first_name,last_name,mail,password,phone_number,user_name) values
(nextval('customer_id_seq'),'Sophie','Sarr','sophie@gmail.com','',0654238574,''),
(nextval('customer_id_seq'),'Pape','Diouf','papa@gmail.com','',0696538574,''),
(nextval('customer_id_seq'),'Jean','Dupond','jean@gmail.com','',0796538574,'');


INSERT INTO ORDERS (id,order_date, customer_id) values
(nextval('order_id_seq'),now(),1),
(nextval('order_id_seq'),now(),2),
(nextval('order_id_seq'),now(),3);

INSERT INTO order_line (id,order_price, quantity,order_id,part_id) values
(nextval('orderline_id_seq'),50000,1,1,1),
(nextval('orderline_id_seq'),60000,1,2,6),
(nextval('orderline_id_seq'),80000,1,3,5);






