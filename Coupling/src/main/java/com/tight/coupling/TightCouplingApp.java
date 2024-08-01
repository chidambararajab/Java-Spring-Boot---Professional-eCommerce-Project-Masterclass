package com.tight.coupling;

public class TightCouplingApp {
    public static void main(String[] args) {

        UserInformation userInformation = new UserInformation();
        System.out.println(userInformation.getUserInformation());
    }
}