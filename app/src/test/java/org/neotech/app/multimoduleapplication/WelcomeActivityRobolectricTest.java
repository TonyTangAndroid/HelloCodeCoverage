package org.neotech.app.multimoduleapplication;

import static org.junit.Assert.assertEquals;

import android.content.Intent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neotech.app.LoginActivity;
import org.neotech.app.R;
import org.neotech.app.WelcomeActivity;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Shadows;

@RunWith(RobolectricTestRunner.class)
public class WelcomeActivityRobolectricTest {

  @Test
  public void clickingLogin_shouldStartLoginActivity() {
    WelcomeActivity activity = Robolectric.buildActivity(WelcomeActivity.class).setup().get();
    activity.findViewById(R.id.login).performClick();

    Intent expectedIntent = new Intent(activity, LoginActivity.class);
    Intent actual = Shadows.shadowOf(activity).getNextStartedActivity();
    assertEquals(expectedIntent.getComponent(), actual.getComponent());
  }
}
