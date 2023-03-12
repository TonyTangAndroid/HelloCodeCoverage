package org.neotech.app.multimoduleapplication;

import static com.google.common.truth.Truth.assertThat;

import com.demo.lib1.President;
import org.junit.Test;
import org.neotech.library.android.LibraryAndroidJava;

public class AppPresidentTest {

  @Test
  public void touchJavaCodeInApp() {
    assertThat(new President()).isNotNull();
  }

  @Test
  public void touchJavaCodeInLibrary() {
    LibraryAndroidJava.getInstance().touchedByJavaUnitTestInApp();
  }
}
