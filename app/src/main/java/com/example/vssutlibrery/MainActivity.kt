package com.example.vssutlibrery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun signup(view: View) {
        val intent = Intent(this ,SignUpActivity::class.java)
        startActivity(intent)

    }

    fun login(view: View) {
       // val name = username.editableText.toString()

        val intent = Intent(this ,MainPage::class.java)
        startActivity(intent)
    }
}