package com.semih.javaeight.newinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractAdder {

  private static final Logger LOG = LoggerFactory.getLogger(AbstractAdder.class);

  abstract double adder(double firstNumber, double secondNumber);

  double sum;

  public void print() {
    LOG.info("abstract ##");
  }
}
