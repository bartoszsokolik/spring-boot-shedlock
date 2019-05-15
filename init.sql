CREATE DATABASE test;

\c test

CREATE SCHEMA test_schema;
CREATE USER test_user PASSWORD 'test';
GRANT ALL PRIVILEGES ON SCHEMA test_schema TO test_user;