package com.gzeinnumer.mvpdesignpattern.View;

//todo 7. buat interface view
public interface ILoginView {
    //bagian 1
    //void onLoginResult(String message);

    //bagian 2
    void onLoginSuccess(String message);
    void onLoginError(String message);
}
