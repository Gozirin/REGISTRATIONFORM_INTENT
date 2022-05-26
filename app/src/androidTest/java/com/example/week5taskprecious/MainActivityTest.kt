package com.example.week5taskprecious


import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest{

    private lateinit var scenario: ActivityScenario<MainActivity>


    @Before
    fun setup(){
        scenario = launchActivity()
        scenario.moveToState(Lifecycle.State.RESUMED)
    }

    @Test
    fun test_submit(){
        onView(withId(R.id.button2)).perform(click())
        val name = "Precious Anyaso"
        val email = "chigozp2@gmail.com"
        val phone = "07031818757"
        onView(withId(R.id.editTextTextPersonName3)).perform(ViewActions.typeText(name))
        Espresso.closeSoftKeyboard()
        onView(withId(R.id.editTextTextEmailAddress5)).perform(ViewActions.typeText(email))
        Espresso.closeSoftKeyboard()
        onView(withId(R.id.editTextPhone4)).perform(ViewActions.typeText(phone))
        Espresso.closeSoftKeyboard()
        onView(withId(R.id.button2)).perform(click())
        onView(withText(name)).check(matches(isDisplayed()))
        onView(withText(email)).check(matches(isDisplayed()))
        onView(withText(phone)).check(matches(isDisplayed()))
    }

}

