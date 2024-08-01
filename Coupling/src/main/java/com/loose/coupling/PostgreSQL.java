package com.loose.coupling;

public class PostgreSQL implements UserDatabase {
    @Override
    public String getData() {
        return "PostgreSQL";
    }
}
