package com.tight.coupling;

public class UserInformation {
    UserDatabase userData = new UserDatabase();

    public String getUserInformation() {
        return userData.getDataFromDB();
    }

}
