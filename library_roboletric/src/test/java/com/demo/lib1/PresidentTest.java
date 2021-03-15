package com.demo.lib1;

import static org.junit.Assert.*;

import com.google.common.truth.Truth;
import org.junit.Test;

public class PresidentTest {

  @Test
  public void name() {
    Truth.assertThat(President.name()).isEqualTo("President");
  }
}
