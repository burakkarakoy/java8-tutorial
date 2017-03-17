package com.semih.javaeight.newinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AbstractTutorial extends AbstractAdder {
  private static final Logger LOG = LoggerFactory.getLogger(NewInterfaceTutorial.class);

  void abstractCalculate() {
    sum = adder(2, 3);
    LOG.info(String.valueOf(sum));
    print();
  }

  @Override
  double adder(double firstNumber, double secondNumber) {
    return firstNumber + secondNumber;
  }
}
