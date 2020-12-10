DELETE FROM Users;
INSERT INTO Users(ID, CREATIONTIME, UPDATETIME, VERSION, FIRSTNAME, LASTNAME, USERNAME, PASSWORD, EMAIL, METERPERCENT, POINTS) VALUES
  (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'Rui', 'Ferrão','ferraozinho','academia', 'mail@gmail.com', '0', '0'),
  (2, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 0, 'Sergio', 'Gouveia','serginho','academia', 'mail@gmail.com', '0', '0'),
  (3, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 0, 'Bruno', 'Ferreira','bruninho','academia', 'mail@gmail.com', '0', '0'),
  (4, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 0, 'No Accounts', 'No name','noaccounts','academia', 'mail@gmail.com', '0', '0');

DELETE FROM actions;
INSERT INTO account(ID, CREATIONTIME, UPDATETIME, VERSION, POINTS, NAME, DESCRIPTION, COMPLETED,USER_ID) VALUES
  (1, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 2, 10, "WALK THE DOG", "WALK THE DOG at least 3 times today", TRUE, 1),
  (2, TIMESTAMP '2017-10-10 10:23:02.194', TIMESTAMP '2017-10-10 10:23:19.801', 1, 5, "Feed the homeless", "go and feed the homeless", TRUE, 1),
  (3, TIMESTAMP '2017-10-10 14:30:37.769', TIMESTAMP '2017-10-10 14:30:43.042', 1, 10, "donate shoes", "donate things you dont wear anymore", TRUE, 2),
  (4, TIMESTAMP '2017-10-10 14:30:38.426', TIMESTAMP '2017-10-10 14:30:46.471', 1, 10, "save water", "brush your teeth with the water tap off", TRUE, 2),
  (5, TIMESTAMP '2017-10-10 14:30:37.769', TIMESTAMP '2017-10-10 14:30:43.042', 1, 5, "help the elderly", "help an old lady cross the street", TRUE, 3),
  (6, TIMESTAMP '2017-10-10 14:30:38.426', TIMESTAMP '2017-10-10 14:30:46.471', 1, 10, "pray", "pray for something good", TRUE, 3),
  (7, TIMESTAMP '2017-10-10 14:30:37.769', TIMESTAMP '2017-10-10 14:30:43.042', 1, 5, "say you love someone", "tell someone you care that you love them", TRUE, NULL );
