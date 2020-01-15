package com.example.anrfc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ANRActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anr)
        while(true)
        {
            //Log.d("Tag","--------In infinite loop--------")
        }
    }
}
