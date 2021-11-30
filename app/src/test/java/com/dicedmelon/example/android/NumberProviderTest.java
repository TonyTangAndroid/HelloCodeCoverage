package com.dicedmelon.example.android;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public class NumberProviderTest {

  @Test
  public void shouldProvideProperNumber() {
    // given
    NumberProvider numberProvider = new NumberProvider();

    // when
    int number = numberProvider.provideNumber();

    // then
    assertThat(number).isEqualTo(42);
  }
}
