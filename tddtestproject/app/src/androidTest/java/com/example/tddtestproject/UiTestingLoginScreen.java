package com.example.tddtestproject;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static java.util.regex.Pattern.matches;


public class UiTestingLoginScreen {


    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void PhoneNumberEmpty() {
        onView(withId(R.id.login_phone_number_input)).perform(clearText());
        onView(withId(R.id.login_btn)).perform(click());
    }

    @Test
    public void passwordEmpty() {
        onView(withId(R.id.login_phone_number_input)).perform(typeText("0595129080"),
                closeSoftKeyboard());
        onView(withId(R.id.login_password_input)).perform(clearText());
        onView(withId(R.id.login_btn)).perform(click());
    }

    @Test
    public void passwordShort() {
        onView(withId(R.id.login_phone_number_input)).perform(typeText("0595129080"),
                closeSoftKeyboard());
        onView(withId(R.id.login_password_input)).perform(typeText("1234"),
                closeSoftKeyboard());
        onView(withId(R.id.login_btn)).perform(click());
    }

    @Test
    public void loginFailed() {
        onView(withId(R.id.login_phone_number_input)).perform(typeText("0595129080"),
                closeSoftKeyboard());
        onView(withId(R.id.login_password_input)).perform(typeText("123456"),
                closeSoftKeyboard());
        onView(withId(R.id.login_btn)).perform(click());

    }



}
