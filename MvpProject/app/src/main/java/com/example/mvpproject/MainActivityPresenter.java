package com.example.mvpproject;

public class MainActivityPresenter implements MainActivityContract.Presenter{

    MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void doLogin(String email, String password) {
        if (email.equals("suthan")&&password.equals("retrofit")){
            view.onSuccess("Successful");
        }else {
            view.onError("wrong email or password");
        }

    }
}
