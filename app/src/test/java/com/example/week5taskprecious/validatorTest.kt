package com.example.week5taskprecious


import com.example.week5taskprecious.validator.isLetter
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import javax.xml.validation.Validator
import org.junit.Assert.assertThat as assertThat1

@RunWith(JUnit4::class)
class validatorTest{

    @Test
    fun whenNameIsValid(){
        val name = "precious"
        val result = isLetter(name)
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun whenNameIsInvalid(){

        val name = "12345678"
        val result = isLetter(name)
        assertThat(result).isEqualTo(false)

    }

    @Test
    fun whenPhoneIsValid(){

        val phone = "07031818757"

        val result = isLetter(phone)
        assertThat(result).isEqualTo(false)

    }

    @Test
    fun whenPhoneIsInvalid(){

        val phone = "........"

        val result = isLetter(phone)
        assertThat(result).isEqualTo(false)

    }

    @Test
    fun whenEmailIsValid(){

        val email = "chigozp2@gmail.com"

        val result = isLetter(email)
        assertThat(result).isEqualTo(true)

    }

    @Test
    fun whenEmailIsInvalid(){
        val email = "drm864#$%<."
        val result = isLetter(email)
        assertThat(result).isEqualTo(false)

    }






















//    @Test
//    fun whenInputIsInValid(){
//
//        val name = ""
//        val phone = ""
//        val email = ""
//        val result = Validator.(name,phone ,email)
//        assertThat(result).isEqualTo(true)
//    }





}

