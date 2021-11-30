package org.neotech.app;

public final class LibraryAndroidJava {

  private static LibraryAndroidJava INSTANCE;

  public static synchronized LibraryAndroidJava getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new LibraryAndroidJava();
    }
    return INSTANCE;
  }

  private LibraryAndroidJava() {}

  public String touchedByJavaInstrumentedTestInAndroidLibrary() {
    return "touchedByJavaInstrumentedTestInAndroidLibrary";
  }

  public String touchedByJavaUnitTestInAndroidLibrary() {
    return "touchedByJavaUnitTestInAndroidLibrary";
  }

  public String touchedByJavaInstrumentedTestInApp() {
    return "touchedByJavaInstrumentedTestInApp";
  }

  public String touchedByJavaUnitTestInApp() {
    return "touchedByJavaUnitTestInApp";
  }
}
