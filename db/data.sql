INSERT INTO public."user" (id, first_name, last_name, username, password)
VALUES (DEFAULT, 'Sergei', 'Jagur', 'sergeijagur', 'Password123');

INSERT INTO public.race (id, user_id, name, place, date)
VALUES (DEFAULT, 1, 'Sydney Derby', 'Sydney', '2021-04-23');

INSERT INTO public.race (id, user_id, name, place, date)
VALUES (DEFAULT, 1, 'Tallinn Open', 'Tallinn', '2021-07-16');

INSERT INTO public.horse (id, user_id, name, color)
VALUES (DEFAULT, 1, 'Shadowfax', 'black');

INSERT INTO public.horse (id, user_id, name, color)
VALUES (DEFAULT, 1, 'Flicka', 'brown');

INSERT INTO public.horse (id, user_id, name, color)
VALUES (DEFAULT, 1, 'Spirit', 'yellow');

INSERT INTO public.horse (id, user_id, name, color)
VALUES (DEFAULT, 1, 'Angus', 'green');

INSERT INTO public.horse (id, user_id, name, color)
VALUES (DEFAULT, 1, 'Rocket', 'blue');

INSERT INTO public.horse (id, user_id, name, color)
VALUES (DEFAULT, 1, 'Maximus', 'red');

INSERT INTO public.horse (id, user_id, name, color)
VALUES (DEFAULT, 1, 'Dover', 'white');

INSERT INTO public.horse (id, user_id, name, color)
VALUES (DEFAULT, 1, 'Flame', 'orange');

INSERT INTO public.horse (id, user_id, name, color)
VALUES (DEFAULT, 1, 'Roheryn', 'purple');

