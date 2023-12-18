package com.mubarak.createowenandroiddependency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mubarak.mubaraklibrary.ext.isEmailValid

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (isEmailValid("mubarak@gmail.com")) {
            Toast.makeText(this, "Valid Email", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "Not Valid Email", Toast.LENGTH_LONG).show()
        }
    }
}