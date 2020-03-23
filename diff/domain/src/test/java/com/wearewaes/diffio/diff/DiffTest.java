package com.wearewaes.diffio.diff;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DiffTest {

  @Test
  void isEachDataOfDifferentLength_falseIfBothNull() {
    assertFalse(Diff.builder().build().isEachDataOfDifferentLength());
  }

  @Test
  void isEachDataOfDifferentLength_trueIfOnlyLeftDataNull() {
    assertTrue(Diff.builder().rightData("R").build().isEachDataOfDifferentLength());
  }

  @Test
  void isEachDataOfDifferentLength_trueIfOnlyRightDataNull() {
    assertTrue(Diff.builder().leftData("L").build().isEachDataOfDifferentLength());
  }

  @Test
  void isEachDataOfDifferentLength_trueIfBothNotNullAndDifferentLength() {
    assertTrue(Diff.builder().leftData("Left").rightData("R").build().isEachDataOfDifferentLength());
  }

  @Test
  void isEachDataOfDifferentLength_falseIfBothNotNullAndSameLength() {
    assertFalse(Diff.builder().leftData("L").rightData("R").build().isEachDataOfDifferentLength());
  }
}
