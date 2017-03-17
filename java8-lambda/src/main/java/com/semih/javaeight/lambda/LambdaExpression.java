package com.semih.javaeight.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaExpression {

  private static final Logger LOG = LoggerFactory.getLogger(LambdaExpression.class);

  private String[] array = new String[] {"1344", "232", "2"};

  private String[] stringArray = new String[] {"sem", "cel", "iu", "bg", "1306120038"};

  void lambdaExp() {
    List<String> stringList = Arrays.asList(stringArray);
    stringList.sort(String::compareTo);
    Function<String, String> function = LambdaExpression::print;
    LOG.info(function.apply("s"));
  }

  private static String print(String s) {
    return s + " printed";
  }
}
