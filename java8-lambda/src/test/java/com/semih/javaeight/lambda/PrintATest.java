package com.semih.javaeight.lambda;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintATest {
private final static Logger LOG = LoggerFactory.getLogger(PrintATest.class);
  @Test
  public void testPrinterMthd() {
    Printer printerA = () -> LOG.info("printedA");
    Printer printerB = () -> LOG.info("printedB");
    printerB = () -> LOG.info("printedB again");
    printerA.print();
    printerB.print();
  }

  @Test
  public void testX() {
    Sampler<Integer> sampler = () -> 3;
    int x = sampler.from();
    LOG.info(String.valueOf(x));
  }
}
