package org.neotech.library.android;

import static com.google.common.truth.Truth.*;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class PrefUtilTest {

  @Test
  public void touchGetInstanceToEnsureFullCoverage() {
    assertThat(new PreUtil().getName()).isNotNull();
  }
}
