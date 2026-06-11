-- V1__create_users_and_books.sql

CREATE TABLE users (
                       id          UUID            NOT NULL DEFAULT gen_random_uuid(),
                       name        VARCHAR(255)    NOT NULL,
                       login       VARCHAR(255)    NOT NULL,
                       password    VARCHAR(255)    NOT NULL,
                       created_at  TIMESTAMPTZ,
                       active      BOOLEAN         DEFAULT TRUE,

                       CONSTRAINT pk_users PRIMARY KEY (id)
);

CREATE TABLE books (
                       id          UUID            NOT NULL DEFAULT gen_random_uuid(),
                       user_id     UUID,
                       title       VARCHAR(255),
                       author      VARCHAR(255),
                       genre       VARCHAR(255),
                       rate        DOUBLE PRECISION,
                       notes       TEXT,
                       status      VARCHAR(50),
                       created_at  TIMESTAMPTZ,
                       updated_at  TIMESTAMPTZ,
                       active      BOOLEAN         DEFAULT TRUE,

                       CONSTRAINT pk_books        PRIMARY KEY (id),
                       CONSTRAINT fk_books_users  FOREIGN KEY (user_id) REFERENCES users (id)
);