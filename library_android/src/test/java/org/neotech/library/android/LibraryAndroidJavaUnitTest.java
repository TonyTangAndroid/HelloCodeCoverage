package org.neotech.library.android;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
@org.junit.Ignore("ignored")
public class LibraryAndroidJavaUnitTest {

    @Test
    public void touchJavaCodeInLibrary() {
        LibraryAndroidJava.getInstance().touchedByJavaUnitTestInAndroidLibrary();
    }

    @Test
    public void touchKotlinCodeInLibrary() {
        LibraryAndroidKotlin.touchedByJavaUnitTestInAndroidLibrary();
    }

    @Test
    public void touchGetInstanceToEnsureFullCoverage() {
        assertNotNull(LibraryAndroidJava.getInstance());
    }
}