package com.example.designpatternmvp0.Model;

public class mainModel implements MainContract.IModel {
    @Override
    public String ReturnData() {
        return "Succes";
    }
}
