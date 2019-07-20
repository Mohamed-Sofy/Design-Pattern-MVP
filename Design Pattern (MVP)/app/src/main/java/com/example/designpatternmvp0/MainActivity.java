package com.example.designpatternmvp0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.designpatternmvp0.Model.MainContract;
import com.example.designpatternmvp0.Presenter.mainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.IView {

    private mainPresenter presenter ;
    TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new mainPresenter(this);
        showText = findViewById(R.id.textView);
    }

    public void getData_btn(View view) {
        presenter.getData();
    }

    @Override
    public void onDataRecieve(String data) {
        showText.setText(data);
    }
}
