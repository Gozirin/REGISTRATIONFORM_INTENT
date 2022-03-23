package com.example.week5taskprecious

object validator {

    fun isLetter(string: String): Boolean {
        return string.matches("^[a-zA-Z]*\$".toRegex()) || string.matches("^(.*\\s+.*)+\$".toRegex())
    }

    fun isPhone(string: String): Boolean {
        return string.matches("(?:(?:(?:\\+?234(?:\\h1)?|01)\\h*)?(?:\\(\\d{3}\\)|\\d{3})|\\d{4})(?:\\W*\\d{3})?\\W*\\d{4}(?!\\d)".toRegex())
    }
}