package com.gzeinnumer.mvpdesignpattern.Model;

public interface IUser {
    //todo 3. deklarasi fungtion
    String getEmail();
    String getPassword();

    //temen nya ada di User.java
    //bagian 1
    //boolean isValidData();

    //bagian 2
    int isValidData();
}
