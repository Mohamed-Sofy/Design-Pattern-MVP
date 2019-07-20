package com.example.designpatternmvp0.Model;

public class MainContract {


    public interface IView{

        void onDataRecieve(String data);

    }
    public interface IModel{

        String ReturnData();
    }

    public interface IPresenter{

        void getData();
    }
}
