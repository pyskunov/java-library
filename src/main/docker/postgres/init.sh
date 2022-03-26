#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    CREATE USER library_user;
    CREATE DATABASE IF NOT EXISTS library;
    GRANT ALL PRIVILEGES ON DATABASE library TO library_user;
EOSQL