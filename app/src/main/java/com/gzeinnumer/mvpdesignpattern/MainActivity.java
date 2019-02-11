package com.gzeinnumer.mvpdesignpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gzeinnumer.mvpdesignpattern.Presenter.ILoginPresenter;
import com.gzeinnumer.mvpdesignpattern.Presenter.LoginPresenter;
import com.gzeinnumer.mvpdesignpattern.View.ILoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import es.dmoral.toasty.Toasty;

//todo 13. implement
public class MainActivity extends AppCompatActivity implements ILoginView {

    //todo 2. deklarasi, pakai butterknife aja
    @BindView(R.id.edEmail)
    EditText edEmail;
    @BindView(R.id.edPassword)
    EditText edPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;

    //todo 11.
    ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //todo 12.
        loginPresenter = new LoginPresenter(this);
    }

    @OnClick(R.id.btnLogin)
    public void onViewClicked() {
        //todo 15.
        loginPresenter.onLogin(edEmail.getText().toString(), edPassword.getText().toString());
    }



//bagian 1
//    @Override
//    public void onLoginResult(String message) {
//        //todo 14.
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
//    }

//bagian2
    @Override
    public void onLoginSuccess(String message) {
        Toasty.success(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError(String message) {
        Toasty.error(this, message,Toast.LENGTH_SHORT).show();
    }

}
