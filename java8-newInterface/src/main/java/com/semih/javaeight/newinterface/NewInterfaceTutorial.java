package com.semih.javaeight.newinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewInterfaceTutorial implements Adder {

  private static final Logger LOG = LoggerFactory.getLogger(NewInterfaceTutorial.class);

  public void calculate() {
    double sum = add(4, 5);
    LOG.info(String.valueOf(sum));
    print();
  }

  @Override
  public double add(double firstNumber, double secondNumber) {
    return firstNumber + secondNumber;
  }
}

