package com.example.week5taskprecious

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.view.View.inflate
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.appcompat.widget.DecorContentParent
import androidx.core.graphics.drawable.DrawableCompat.inflate
import kotlinx.android.synthetic.main.activity_main.*

AdapterView.OnItemSelectedListener
class MainActivity : AppCompatActivity() {


    private lateinit var btnSendData: Button
    private lateinit var editName: EditText
    private lateinit var editPhone: EditText
    private lateinit var editEmail: EditText
    private lateinit var editGender: Spinner
    private var spinner: Spinner? = null
    private lateinit var genderType:String

//    private var arrayAdapter: ArrayAdapter<String>? = null
//    private var items = arrayListOf("Male Gender", "Female Gender")
    //private var gender = findViewById<TextView>(R.id.secondActivity_gender_tv)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendData = findViewById(R.id.button2)
        editName = findViewById(R.id.editTextTextPersonName3)
        editPhone = findViewById(R.id.editTextPhone4)
        editEmail = findViewById(R.id.editTextTextEmailAddress5)
        spinner = findViewById(R.id.spinner2)


//    }


//    override fun onResume() {
//        super.onResume()


        btnSendData.setOnClickListener {

            val name = editTextTextPersonName3.text.toString()
            val phone = editTextPhone4.text.toString()
            val email = editTextTextEmailAddress5.text.toString()
            var result: Boolean = false

            fun isLetter(string: String): Boolean {
                return string.matches("^[a-zA-Z]*\$".toRegex()) || string.matches("^(.*\\s+.*)+\$".toRegex())
            }

            fun isPhone(string: String): Boolean {
                return string.matches("(?:(?:(?:\\+?234(?:\\h1)?|01)\\h*)?(?:\\(\\d{3}\\)|\\d{3})|\\d{4})(?:\\W*\\d{3})?\\W*\\d{4}(?!\\d)".toRegex())
            }

            fun validateName(): Boolean {
                if (isLetter(name) && name.trim().isNotBlank()) {
                    editTextTextPersonName3.hint = "Valid Name"
                    result = true
                } else {
                    editTextTextPersonName3.error = "Enter a valid name"
                    result = false
                }
                return result
            }

            fun validatePhone(): Boolean {
                if (isPhone(phone)) {
                    editTextPhone4.hint = "Valid Phone number"
                    result = true
                } else {
                    editTextPhone4.error = "Enter a Valid phone"
                    result = false
                }
                return result
            }

            fun validateEmail(): Boolean {

                if (email.contains("@") && email.contains(".com")) {
                    editTextTextEmailAddress5.hint = "valid email"
                    result = true
                } else {

                    editTextTextEmailAddress5.error = "Enter a valid mail"
                    result = false
                }


                return result

            }

            genderType = spinner?.selectedItem.toString()

            if (validateName() && validateEmail() && validatePhone()) {
                val intent = Intent(this, SecondActivity2::class.java).apply {
                    this.putExtra("Name", editName.text.toString())
                    this.putExtra("Phone", editPhone.text.toString())
                    this.putExtra("Email", editEmail.text.toString())
                    this.putExtra("Gender", genderType)
                }

                startActivity(intent) // launch activity
            }



        }
    }
}


























