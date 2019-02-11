package com.gzeinnumer.mvpdesignpattern.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

//todo 4. buat class User dan implemen IUser
public class User implements IUser {
    private String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }



//bagian 1
//    @Override
//    public boolean isValidData() {
//        //todo 5.validasi
//        //1. check email is empty
//        //2. check password is empty
//        //3. check passlength > 6
//
//        //logika, ketika password yang dimasukan berbeda, maka login sukses
//        /*
//        return !TextUtils.isEmpty(getEmail()) &&
//                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
//                getPassword().length()>6;
//        */
//    }

//bagian 2
    @Override
    public int isValidData() {
        //todo 5.validasi
        //0. check email is empty
        //1. check password is empty
        //2. check passlength > 6

        if (TextUtils.isEmpty(getEmail()))
            return 0;
        else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches())
            return 1;
        else if (getPassword().length() <= 6)
            return 2;
        else
            return -1;
    }



}
