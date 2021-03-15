package org.neotech.app.multimoduleapplication;

import static androidx.lifecycle.Lifecycle.State.CREATED;
import static androidx.lifecycle.Lifecycle.State.RESUMED;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neotech.app.LoginActivity;

@RunWith(AndroidJUnit4.class)
public class LoginActivityAndroidTest {

  private ActivityScenario<LoginActivity> scenario;

  @Before
  public void setup() {

    scenario = ActivityScenario.launch(LoginActivity.class);
  }

  @Test
  public void resumed_shouldShowTony() {

    scenario.moveToState(RESUMED);
    scenario.onActivity(activity -> Truth.assertThat((activity.textView().getText())).isEqualTo("tony"));
  }

  @Test
  public void paused_shouldClearName() {

    scenario.moveToState(CREATED);
    scenario.onActivity(activity -> Truth.assertThat((activity.textView().getText())).isEqualTo(""));
  }
}
