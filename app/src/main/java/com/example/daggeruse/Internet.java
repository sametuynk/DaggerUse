package com.example.daggeruse;

import android.util.Log;

public class Internet {
    Adres adres=new Adres("kozan/Adana");

    public void basvuruYap(){
        Log.e("Sonuç","İnternet başvurusu "+adres.getAdresBilgisi()+" adresi için yapıldı");
    }

}
