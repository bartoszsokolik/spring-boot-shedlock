CREATE DATABASE test;

\c test

CREATE SCHEMA test_schema;
CREATE USER test_user PASSWORD 'test';
GRANT ALL PRIVILEGES ON SCHEMA test_schema TO test_user;

\c postgres

CREATE DATABASE production;

\c production

CREATE SCHEMA production_schema;
CREATE USER production_user PASSWORD 'production';
GRANT ALL PRIVILEGES ON SCHEMA production_schema TO production_user;