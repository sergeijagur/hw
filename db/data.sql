INSERT INTO public."user" (id, first_name, larst_name, username, password)
VALUES (DEFAULT, 'Sergei', 'Jagur', 'sergeijagur', 'Password123');

INSERT INTO public.race (id, name, place, date)
VALUES (DEFAULT, 'Sydney Derby', 'Sydney', '2021-04-23');

INSERT INTO public.race (id, name, place, date)
VALUES (DEFAULT, 'Tallinn Open', 'Tallinn', '2021-07-16');

INSERT INTO public.horse (id, race_id, name, color)
VALUES (DEFAULT, 1, 'Shadowfax', 'black');

INSERT INTO public.horse (id, race_id, name, color)
VALUES (DEFAULT, 1, 'Flicka', 'brown');

INSERT INTO public.horse (id, race_id, name, color)
VALUES (DEFAULT, 1, 'Spirit', 'yellow');

INSERT INTO public.horse (id, race_id, name, color)
VALUES (DEFAULT, 1, 'Angus', 'green');

INSERT INTO public.horse (id, race_id, name, color)
VALUES (DEFAULT, 1, 'Rocket', 'blue');

INSERT INTO public.horse (id, race_id, name, color)
VALUES (DEFAULT, 1, 'Maximus', 'red');

INSERT INTO public.horse (id, race_id, name, color)
VALUES (DEFAULT, 2, 'Dover', 'white');

INSERT INTO public.horse (id, race_id, name, color)
VALUES (DEFAULT, 2, 'Flame', 'orange');

INSERT INTO public.horse (id, race_id, name, color)
VALUES (DEFAULT, 2, 'Roheryn', 'purple');

