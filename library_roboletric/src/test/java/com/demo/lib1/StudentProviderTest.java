package com.demo.lib1;

import com.google.common.truth.Truth;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("Ignore")
public class StudentProviderTest {

  @Test
  public void name() {

    Truth.assertThat(StudentProvider.name()).isEqualTo("Tony1");
  }
}
