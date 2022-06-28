use testdb;

CREATE TABLE 'role' (
  'id' bigint(20) NOT NULL,
  'name' varchar(255) DEFAULT NULL,
  PRIMARY KEY ('id')
);

CREATE TABLE 'users_roles' (
  'user_id' bigint(20) NOT NULL,
  'role_id' bigint(20) NOT NULL,
  KEY ('role_id'),
  KEY ('user_id'),
  CONSTRAINT FOREIGN KEY ('user_id') REFERENCES 'user' ('id'),
  CONSTRAINT FOREIGN KEY ('role_id') REFERENCES 'role' ('id')
);

CREATE TABLE 'user' (
  'id' bigint(20) NOT NULL,
  'email' varchar(255) DEFAULT NULL,
  'first_name' varchar(255) DEFAULT NULL,
  'last_name' varchar(255) DEFAULT NULL,
  'password' varchar(255) DEFAULT NULL,
  PRIMARY KEY ('id'),
  UNIQUE KEY ('email')
);

