package org.neotech.library.android;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LibraryAndroidJavaUnitTest {

  @Test
  public void touchJavaCodeInLibrary() {
    LibraryAndroidJava.getInstance().touchedByJavaUnitTestInAndroidLibrary();
  }

  @Test
  public void touchGetInstanceToEnsureFullCoverage() {
    assertNotNull(LibraryAndroidJava.getInstance());
  }
}
