package com.demo.lib1;

import com.google.common.truth.Truth;
import org.junit.Test;

public class StudentProviderTest {

  @Test
  public void name() {

    Truth.assertThat(StudentProvider.name()).isEqualTo("Tony1");
  }
}
