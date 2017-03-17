package com.semih.javaeight.functionalProgramming;

import java.util.function.Function;

class AwesomeClass {

  private static Integer compute(Function<Integer, Integer> function, Integer value) {
    return function.apply(value);
  }

  private static Integer invert(Integer value) {
    return -value;
  }

  static Integer invertTheNumber() {
    Integer toInvert = 5;
    //Function<Integer, Integer> invertFunction = AwesomeClass::invert;
    //return compute(invertFunction, toInvert);
    return compute(a -> -a, toInvert);
  }
}
