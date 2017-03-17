package com.semih.javaeight.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class OptionalExample {

  private final static Logger LOG = LoggerFactory.getLogger(OptionalExample.class);

  private static List<String> list = Arrays.asList("semih", "celik", null, "something", null);

  static List example() {
    LOG.info(LOG.getClass().toString());
    return funcStart((a) -> {
      LOG.info(LOG.getClass().toString());
      List<String> notNullList = new ArrayList<>();
      Optional<String> optional;
      for (String temp : a) {
        optional = Optional.ofNullable(temp);
        optional.ifPresent(notNullList::add);
      }
      return notNullList;
    }, list);
  }

  static List example2() {

    return funcStart((a) -> {
      List<String> notNullList = new ArrayList<>();
      Optional<String> optional;
      for (String temp : a) {
        optional = Optional.ofNullable(temp);
        notNullList.add(optional.map(value -> value).orElse("sem"));
      }
      return notNullList;
    }, list);
  }

  private static List<String> funcStart(Function<List<String>, List<String>> function, List<String> list) {
    LOG.info(LOG.getClass().toString());
    return function.apply(list);
  }
}
