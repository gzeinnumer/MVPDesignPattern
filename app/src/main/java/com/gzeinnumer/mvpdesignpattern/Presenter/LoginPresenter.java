package com.gzeinnumer.mvpdesignpattern.Presenter;

import com.gzeinnumer.mvpdesignpattern.Model.User;
import com.gzeinnumer.mvpdesignpattern.View.ILoginView;

//todo 8. buat class untuk dihubungkan ke interface
public class LoginPresenter implements ILoginPresenter {

    //todo 9. hubungkan lenga login view
    ILoginView loginView;
    //konstructor
    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }


    @Override
    public void onLogin(String email, String password) {
        User user = new User(email, password);
//bagian 1
//        boolean isLoginSuccess = user.isValidData();
//
//        if(isLoginSuccess)
//            loginView.onLoginResult("Login Sukses!!");
//        else
//            loginView.onLoginResult("Login Gagal");

//bagian 2
        int loginCode = user.isValidData();
        if (loginCode == 0)
            loginView.onLoginError("Masukan Email");
        else if(loginCode == 1)
            loginView.onLoginError("masukan email yang benar");
        else if(loginCode == 2)
            loginView.onLoginError("Harus lebih dari 6 huruf");
        else
            loginView.onLoginSuccess("Suksess!!");
    }
}
