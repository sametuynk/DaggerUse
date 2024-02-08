package com.example.daggeruse;

import android.util.Log;

public class Kargo {
    Adres adres=new Adres("kozan/Adana");

    public void gonder(){
        Log.e("Sonuç","Kargo "+adres.getAdresBilgisi()+" Adresine gönderildi");
    }


}
