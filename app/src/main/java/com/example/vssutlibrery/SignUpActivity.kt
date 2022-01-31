 package com.example.vssutlibrery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

 class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

     fun Login(view: View) {
         val intent = Intent(this ,MainPage::class.java)
         startActivity(intent)
     }
 }