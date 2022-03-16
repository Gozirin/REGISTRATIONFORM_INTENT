package com.example.week5taskprecious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var btnSendData: Button
    private lateinit var editName: EditText
    private lateinit var editPhone: EditText
    private lateinit var editEmail: EditText
    private lateinit var editGender: Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendData = findViewById(R.id.button2)
        editName = findViewById(R.id.editTextTextPersonName)
        editPhone = findViewById(R.id.editTextTextPersonName2)
        editEmail = findViewById(R.id.editTextTextPersonName4)
        editGender = findViewById(R.id.Gender)

    }

    override fun onResume() {
        super.onResume()


        btnSendData.setOnClickListener {

            val intent = Intent(this, SecondActivity2::class.java).apply{
                this.putExtra("Name",editName.text.toString())
                this.putExtra("Phone",editPhone.text.toString())
                this.putExtra("Email", editEmail.text.toString())
                this.putExtra("Gender", editGender.toString())
            }

            startActivity(intent) // launch activity
        }

    }

}







