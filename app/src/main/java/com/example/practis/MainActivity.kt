package com.example.practis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var user: EditText
    lateinit var location: EditText
    lateinit var mobile: EditText
    lateinit var toa: Button
    lateinit var updateview: Button
    lateinit var newpag: Button
    lateinit var textv: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        user = findViewById(R.id.Text1)
        location = findViewById(R.id.Text2)
        mobile = findViewById(R.id.Text3)
        toa = findViewById(R.id.bn)
        updateview = findViewById(R.id.bl)
        newpag = findViewById(R.id.bm)
        textv = findViewById(R.id.textView)

      // var UI =user.text.toString()
     // var loc = location.text.toString()
      //  var mob = mobile.text.toString()


        newpag.setOnClickListener {
         Toast.makeText(this, "this is toast message", Toast.LENGTH_SHORT).show()

          Toast.makeText(this, "${user.text.toString()} ${location.text.toString()}${mobile.text.toString()}", Toast.LENGTH_SHORT).show()
               }


        toa.setOnClickListener {
            val input = Intent(this, MainActivity2::class.java)
            startActivity(input)
        }
        updateview.setOnClickListener {

       // Toast.makeText(this, "${user.text.toString()} ${location.text.toString()}${mobile.text.toString()}", Toast.LENGTH_SHORT).show()

            textv.text= "${user.text} ${location.text} ${mobile.text}"


             }



            //showToast(UI)
            //showToast(lac)
            //showToast(mob)


/*
     fun showToast(ui: String) {
    var ui = Intent(this, MainActivity2::class.java).toString()
    */

    }}




