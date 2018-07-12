package ch.emineo.demo;


import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitPlatform.class)
class AClassTest {
  AClass objUnderTest = new AClass();

  @Test
  void staticTest() throws Exception {
    assertEquals(5, objUnderTest.aMethod());
  }

  @TestFactory
  Collection<DynamicTest> dynamicTest() throws Exception {
    return Collections.singletonList(DynamicTest.dynamicTest("Test1", () ->  assertEquals(5, objUnderTest.aMethod())));
  }
}
