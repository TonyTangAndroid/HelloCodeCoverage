package com.demo.lib1;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public class TeachProviderTest {

  @Test
  public void name() {
    assertThat(TeachProvider.name()).isEqualTo("Tony Teacher");
  }
}
