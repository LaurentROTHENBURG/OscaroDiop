

insert into part_group (id, name) VALUES
(nextval('part_group_id_seq'), 'Eclairage'),
(nextval('part_group_id_seq'), 'Motorisation');

insert into part_type (id, name, part_group_id) VALUES
(nextval('part_type_id_seq'), 'Alternateur', 1),
(nextval('part_type_id_seq'), 'bougie', 2);

insert into brand (id, add_date, disable,name ) VALUES (nextval('brand_id_seq'), now(), false,'Acura'),
                                                  (nextval('brand_id_seq'),now(), false,'Seat');
insert into model (id, add_date, disable,name,year,brand_id) VALUES (nextval('model_id_seq'), now(), false,'Legend',1987,1),
    (nextval('model_id_seq'), now(), false,'Legend',2000,1),
                                                                    (nextval('model_id_seq'), now(), false,'Leon',2010,2),
                                                                    (nextval('model_id_seq'), now(), false,'Leon',2015,2);
insert into part (id, add_date,description, minimum_price,public_price,reference,serial_number,stock,model_id,part_type_id) values
                                                     (nextval('part_id_seq'),now(),'feux Avant',50000,55000,'je ne sais pas','477T866ES',5,1,1),
                                                     (nextval('part_id_seq'),now(),'alternateurpartie',70000,75000,'je ne sais pas','478T866ES',3,2,2);




