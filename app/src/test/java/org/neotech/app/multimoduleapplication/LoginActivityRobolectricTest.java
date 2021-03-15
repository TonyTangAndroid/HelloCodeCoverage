package org.neotech.app.multimoduleapplication;

import static androidx.lifecycle.Lifecycle.State.CREATED;
import static androidx.lifecycle.Lifecycle.State.RESUMED;
import static com.google.common.truth.Truth.assertThat;

import androidx.test.core.app.ActivityScenario;
import com.google.common.truth.Truth;
import org.neotech.app.LoginActivity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class LoginActivityRobolectricTest {

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
