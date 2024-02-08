package com.example.daggeruse;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    public void inject(MainActivity activity);
}
