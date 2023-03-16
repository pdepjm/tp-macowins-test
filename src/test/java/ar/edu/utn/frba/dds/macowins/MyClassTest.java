package ar.edu.utn.frba.dds.macowins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyClassTest {
  @Test
  void fullName() {
    MyClass test = new MyClass("jose", "jose");
    Assertions.assertEquals("jose jose", test.fullName());
  }
}
