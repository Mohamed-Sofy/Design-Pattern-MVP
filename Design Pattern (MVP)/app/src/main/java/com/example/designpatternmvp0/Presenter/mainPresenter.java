package com.example.designpatternmvp0.Presenter;

import com.example.designpatternmvp0.Model.MainContract;
import com.example.designpatternmvp0.Model.mainModel;


public class mainPresenter implements MainContract.IPresenter {

    MainContract.IModel Imodel;
    MainContract.IView view;
    public mainPresenter(MainContract.IView mView){
        Imodel = new mainModel();
        view = mView;
    }

    @Override
    public void getData() {
      String data = Imodel.ReturnData();
      view.onDataRecieve(data);
    }
}
