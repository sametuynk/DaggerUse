package com.example.daggeruse;

import android.util.Log;

import javax.inject.Inject;

public class Internet {
    private Adres adres;
    @Inject
    public Internet(Adres adres) {
        this.adres = adres;
    }

    public void basvuruYap(){
        Log.e("Sonuç","İnternet başvurusu "+adres.getAdresBilgisi()+" adresi için yapıldı");
    }

}
