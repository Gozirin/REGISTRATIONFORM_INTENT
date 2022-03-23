package com.example.week5taskprecious

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second2.*
import org.w3c.dom.Text
import java.util.jar.Attributes

class SecondActivity2 : AppCompatActivity() {


    private lateinit var textName : TextView
    private lateinit var textPhone : TextView
    private  lateinit var textEmail : TextView
    private lateinit var textGender : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
    }

    override fun onResume() {
        super.onResume()

        textName = findViewById(R.id.textView2)
        textPhone = findViewById(R.id.textView3)
        textEmail = findViewById(R.id.textView5)
        textGender = findViewById(R.id.textView6)

        val Name = intent.getStringExtra( "Name")
        val Phone = intent.getStringExtra( "Phone")
        val Email = intent.getStringExtra( "Email")
        val Gender = intent.getStringExtra( "Gender")



        textName.text = Name
        textPhone.text = Phone
        textEmail.text = Email
        textGender.text = Gender

    }
}