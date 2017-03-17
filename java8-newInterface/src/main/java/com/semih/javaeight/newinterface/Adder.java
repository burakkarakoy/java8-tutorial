package com.semih.javaeight.newinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Adder {

  static final Logger LOG = LoggerFactory.getLogger(Adder.class);

  double add(double firstNumber, double secondNumber);

  default void print() {
    LOG.info("interface ##");
  }
}
