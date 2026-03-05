package com.example.mycontacts

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstName ="Kyle"
        val surname = "Adams"
        val address ="5 Rosemary Road,Table View"
        val  isMale = true
        val dayOfBirth =11
        val monthOfBirth =10
        val yearOfBirth =2005

        Log.d(
            "Hello",
            "$firstName $surname your address is $address it is $isMale that you are male, " +
                    "you were born on $dayOfBirth $monthOfBirth $yearOfBirth"
        )
        var

                    setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}