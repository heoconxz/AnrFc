package com.example.anrfc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ANR(view: View)
    {
        val intent = Intent(this, ANRActivity::class.java).apply{}
        //Switching to main thread
        startActivity(intent)
    }
    fun FC(view: View)
    {
        //FC this app
        throw IllegalStateException("This is an intentional exception");
    }
}
