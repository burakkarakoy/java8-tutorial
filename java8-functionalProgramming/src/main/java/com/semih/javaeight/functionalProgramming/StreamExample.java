package com.semih.javaeight.functionalProgramming;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamExample {

  private final static Logger LOG = LoggerFactory.getLogger(StreamExample.class);

  public void stream() {
    Predicate<String> predicate = (a) -> a.contains("lettuce");
    String stream = Stream.of("deneme", "bir", "ki", "uc").reduce("s", (s, q) -> s + q + "|");
    List<String> listStream = Stream.of("apple", "banana", null, "lettuce", "orange")
                                    .filter(Objects::nonNull)
                                    .filter(predicate.negate())
                                    .map(a -> "-" + a + "-")
                                    .sorted((s1, s2) -> s2.compareTo(s1))
                                    .collect(Collectors.toList());
    System.out.println(stream);
    System.out.println(listStream);
  }
}
