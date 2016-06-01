package com.example.ojursch.espressotest.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.ojursch.espressotest.MainActivity;
import com.example.ojursch.espressotest.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ojursch on 6/1/2016.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityClass {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    /*@Test
    public void testText(){
        String expectedText = "Hello, World!";
        onView(withId(R.id.textView)).check(matches(withText(expectedText)));

    }*/

   /* @Test
    public void sayHello(){
        onView(withId(R.id.editText)).perform(typeText("agneev"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        String expectedText = "agneev";
        onView(withId(R.id.textView)).check(matches(withText(expectedText)));
    }*/

    @Test
    public void exercise1(){
        onView(withId(R.id.editText)).perform(typeText("CSE 110"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        String exp = "011 ESC";
        onView(withId(R.id.textView)).check(matches(withText(exp)));
    }

}
