package com.example.daggeruse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Kargo kargo;
    @Inject
    Internet internet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerAppComponent.builder().build().inject(this);

        //kargo=new Kargo();
        kargo.gonder();

        //internet=new Internet();
        internet.basvuruYap();
    }
}