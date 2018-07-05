package com.tops.dagger2simpledemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.edtName)
    EditText edtName;
    @BindView(R.id.btnSaveName)
    Button btnSaveName;
    @BindView(R.id.tvName)
    TextView tvName;
   /* @Inject
    Context context;*/
    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication) getApplication()).getAppComponent().inject(this);
        ButterKnife.bind(this);
        tvName.setText(sharedPreferences.getString("NAME",""));
        btnSaveName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences.edit().putString("NAME",edtName.getText().toString()).apply();
                tvName.setText(sharedPreferences.getString("NAME",""));
            }
        });

    }
}
