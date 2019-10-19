package com.example.todosample.login.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.todosample.R;
import com.example.todosample.base.BaseActivity;
import com.example.todosample.login.LoginContract;
import com.example.todosample.login.LoginPresenter;
import com.example.todosample.model.User;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity
        extends BaseActivity<LoginContract.View, LoginContract.Presenter>
        implements LoginContract.View{

    @BindView(R.id.btnLogin)
    Button btnLogin;

    @BindView(R.id.txtId)
    EditText txtId;

    @BindView(R.id.txtPw)
    EditText txtPw;

    LoginContract.Presenter presenter;

    @Override
    protected LoginContract.Presenter setPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        ButterKnife.bind(this);

        presenter = new LoginPresenter();
        presenter.setView(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO new user

                User user = new User();
                user.setId(txtId.getText().toString());
                user.setPwd(txtPw.getText().toString());
//                item.setDone(true);
                // TODO login user
                mPresenter.loginProc(user);
            }
        });
    }

    @Override
    public void loginDone() {
        Toast.makeText(this, " Ok! Done ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        presenter.removeView();
        super.onDestroy();
    }
}
