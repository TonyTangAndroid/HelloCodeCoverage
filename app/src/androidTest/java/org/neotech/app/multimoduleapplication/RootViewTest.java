package org.neotech.app.multimoduleapplication;

import static com.google.common.truth.Truth.assertThat;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import com.demo.ribs.root.RootView;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class RootViewTest {

  @Test
  public void resumed_shouldShowTony() {
    assertThat(new RootView(ApplicationProvider.getApplicationContext())).isNotNull();
  }
}
