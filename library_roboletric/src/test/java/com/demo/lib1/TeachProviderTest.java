package com.demo.lib1;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public class TeachProviderTest {

  @Test
  public void name() {
    assertThat(1 + 1).isNotEqualTo(3);
    assertThat(TeachProvider.name()).isEqualTo("Tony Teacher");
  }
}
