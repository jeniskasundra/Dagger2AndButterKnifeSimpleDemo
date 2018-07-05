package com.tops.dagger2simpledemo;

import android.app.Application;

import com.tops.dagger2simpledemo.component.AppComponent;
import com.tops.dagger2simpledemo.component.DaggerAppComponent;
import com.tops.dagger2simpledemo.module.AppModule;

public class MyApplication extends Application {
    private AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
