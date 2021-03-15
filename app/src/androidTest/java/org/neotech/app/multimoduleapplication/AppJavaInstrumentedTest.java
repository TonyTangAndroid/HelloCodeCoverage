package org.neotech.app.multimoduleapplication;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neotech.app.AppJava;
import org.neotech.library.android.LibraryAndroidJava;

@RunWith(AndroidJUnit4.class)
public class AppJavaInstrumentedTest {

  @Test
  public void touchJavaCodeInApp() {
    AppJava.getInstance().touchedByJavaInstrumentedTestInApp();
  }

  @Test
  public void anotherTouchedByJavaInstrumentedTestInApp() {
    AppJava.getInstance().anotherTouchedByJavaInstrumentedTestInApp();
  }

  @Test
  public void touchJavaCodeInLibrary() {
    LibraryAndroidJava.getInstance().touchedByJavaInstrumentedTestInApp();
  }
}
