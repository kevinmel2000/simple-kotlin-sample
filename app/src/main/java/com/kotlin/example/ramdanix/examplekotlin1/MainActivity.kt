package com.kotlin.example.ramdanix.examplekotlin1

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var btnSayHi : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName) as EditText
        btnSayHi = findViewById(R.id.btnSayHi) as Button

        //use lambda expression
        btnSayHi.setOnClickListener{ showAlert(this) }
    }

    fun showAlert(context: Context){
        var getName = etName.text
        context.toast(getName)
    }

    //single expression function
    fun Context.toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
