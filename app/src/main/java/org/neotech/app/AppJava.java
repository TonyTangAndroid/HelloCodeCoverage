package org.neotech.app;

public final class AppJava {

  private static AppJava INSTANCE;

  public static synchronized AppJava getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new AppJava();
    }
    return INSTANCE;
  }

  private AppJava() {}

  public String touchedByJavaInstrumentedTestInApp() {
    return "touchedByJavaInstrumentedTestInApp";
  }

  public String anotherTouchedByJavaInstrumentedTestInApp() {
    return "anotherTouchedByJavaInstrumentedTestInApp";
  }

  public String touchedByJavaUnitTestInApp() {
    return "touchedByJavaUnitTestInApp";
  }
}
