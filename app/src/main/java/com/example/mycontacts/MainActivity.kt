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
            "$firstName $surname your address is $address it is $isMale that you are male " +
                    "you were born on $dayOfBirth $monthOfBirth $yearOfBirth"
        )
        val age = 21
        val yearsTill100 =100 - age
        val ageInMonths =21 * 12
        val ageInDays = 21 * 365
        val remainder = 21 % 5

        Log.d("RESULT", "Years until 100: $yearsTill100")
        Log.d("RESULT", "Age in months: $ageInMonths")
        Log.d("RESULT", "Age in days: $ageInDays")
        Log.d("RESULT", "Remainder when divided by 5: $remainder")

                    setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}