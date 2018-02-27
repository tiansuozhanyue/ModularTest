package com.example.librarytwo;

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
@Route(path = "/two/activitytwo")
public class ActivityTwo extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoactivity);
        ((TextView) findViewById(R.id.msg)).setText(Utils.sub(11, 1) + "");
    }
}
