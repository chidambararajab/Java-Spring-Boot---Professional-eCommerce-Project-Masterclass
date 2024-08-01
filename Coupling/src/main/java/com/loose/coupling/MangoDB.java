package com.loose.coupling;

public class MangoDB implements UserDatabase {
    @Override
    public String getData() {
        return "MongoDB";
    }
}
