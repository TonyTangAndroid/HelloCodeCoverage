package org.neotech.app.multimoduleapplication;

import org.junit.Test;
import org.neotech.app.AppJava;
import org.neotech.library.android.LibraryAndroidJava;
public class AppJavaUnitTest {

    @Test
    public void touchJavaCodeInApp() {
        AppJava.getInstance().touchedByJavaUnitTestInApp();
    }

    @Test
    public void touchJavaCodeInLibrary() {
        LibraryAndroidJava.getInstance().touchedByJavaUnitTestInApp();
    }

}
