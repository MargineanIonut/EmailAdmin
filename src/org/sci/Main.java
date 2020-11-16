package org.sci;

public class Main {

    public static void main(String[] args) {

        Email email1 = new Email("Ionut","Marginean");
        Email randomEmail = new Email("Garda","Sebastian");

        email1.setAlternateMail("ionut.marginean01@gmail.com");
        email1.changePass("marginean21344");
        email1.showGeneralInfo();
    }
}
