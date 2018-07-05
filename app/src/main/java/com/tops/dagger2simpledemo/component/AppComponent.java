package com.tops.dagger2simpledemo.component;

import com.tops.dagger2simpledemo.MainActivity;
import com.tops.dagger2simpledemo.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity mainActivity);
}

