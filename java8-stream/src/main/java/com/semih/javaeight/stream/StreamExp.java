package com.semih.javaeight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamExp {

  private static final Logger LOG = LoggerFactory.getLogger(StreamExp.class);

  public void streamExample() {

    List<String> list =
        Arrays.asList("semih", "celik", "iu", "bilg muh", "semihhh", "cemih", "kemih", "lemih", "demih", "xemih", "emi",
                      "");
    List<String> filteredList = list.stream().filter(s -> s.contains("semih")).collect(Collectors.toList());
    List<String> filteredList2 =
        list.stream().filter(s -> s.contains("emi")).sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
    List<String> filteredList3 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
    boolean filteredList4 = list.stream().anyMatch(s -> s.contains("s"));
    LOG.info(filteredList.toString());
    LOG.info(filteredList2.toString());
    try {
      LOG.warn("1sn");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    LOG.info(filteredList3.toString());
    LOG.info(String.valueOf(filteredList4));
  }
}

