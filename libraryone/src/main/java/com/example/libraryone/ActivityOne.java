package com.example.libraryone;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.librarybase.Utils;

/**
 * Created by "HeroCat" on 2018/2/27.
 */

@Route(path = "/one/one")
public class ActivityOne extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oneactivity);
        ((TextView) findViewById(R.id.msg)).setText(Utils.add(10, 11)+"");
    }
}
