package com.demo.lib1;

import static org.junit.Assert.*;

import com.google.common.truth.Truth;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("Ignore")
public class PresidentTest {

  @Test
  public void name() {
    Truth.assertThat(President.name()).isEqualTo("President");
  }
}
