package com.loose.coupling;


public class LooseCouplingApp {
    public static void main(String[] args) {

        UserDatabase mongoDatabase = new MangoDB();
        UserInformation userInformation1 = new UserInformation(mongoDatabase);
        userInformation1.getUserDatabase();

        UserDatabase postgresDatabase = new PostgreSQL();
        UserInformation userInformation2 = new UserInformation(postgresDatabase);
        userInformation2.getUserDatabase();
    }
}
