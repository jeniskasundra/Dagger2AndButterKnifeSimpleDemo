package com.tops.dagger2simpledemo.module;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

  /*  @Provides
    @Singleton
    Context provideContext() {
        return context;
    }*/

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences() {
        return context.getSharedPreferences("NAME_PREF", Context.MODE_PRIVATE);
    }

}
