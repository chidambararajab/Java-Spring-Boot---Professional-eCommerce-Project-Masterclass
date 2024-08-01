package com.loose.coupling;

public class UserInformation {
    private UserDatabase userDatabase;

    public UserInformation(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public void getUserDatabase() {
        System.out.println(userDatabase.getData());
    }
}
