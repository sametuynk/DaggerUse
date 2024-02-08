package com.example.daggeruse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Kargo kargo;
    private Internet internet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        kargo=new Kargo();
        kargo.gonder();

        internet=new Internet();
        internet.basvuruYap();
    }
}