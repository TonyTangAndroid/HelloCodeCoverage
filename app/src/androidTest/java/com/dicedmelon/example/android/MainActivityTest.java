package com.dicedmelon.example.android;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

  @Rule public ActivityScenarioRule<MainActivity> activityTestRule =
      new ActivityScenarioRule<>(MainActivity.class);

  @Test public void shouldShow42() {
    // then
    onView(withText("42")).check(matches(isDisplayed()));
  }
}
