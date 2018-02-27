package com.example.administrator.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.alibaba.android.arouter.launcher.ARouter
import com.example.administrator.jartest.test

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.btn00).setOnClickListener {
            Toast.makeText(this, test.getInfo(), Toast.LENGTH_LONG).show()
        }

        findViewById<TextView>(R.id.btn01).setOnClickListener {
            ARouter.getInstance().build("/one/one").navigation()
        }

        findViewById<TextView>(R.id.btn02).setOnClickListener {
            ARouter.getInstance().build("/two/activitytwo").navigation()
        }

    }
}
