package com.example.todosample.login;

import com.example.todosample.base.BasePresenterImpl;
import com.example.todosample.logic.Repository;
import com.example.todosample.logic.RepositoryImpl;
import com.example.todosample.model.User;

public class LoginPresenter
        extends BasePresenterImpl<LoginContract.View>
        implements LoginContract.Presenter{

    LoginContract.View view;

    Repository repository = new RepositoryImpl();

    @Override
    public void loginProc(User user) {
        repository.loginProc(user);
    }

    @Override
    public void loginDone() {

    }
}
