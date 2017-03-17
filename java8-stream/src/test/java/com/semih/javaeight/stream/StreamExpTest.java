package com.semih.javaeight.stream;

import java.util.Random;
import org.junit.Test;

public class StreamExpTest {

  @Test
  public void testStream(){
    StreamExp streamExp = new StreamExp();
    streamExp.streamExample();
  }
  @Test
  public void forEachExample(){
    Random rand = new Random();
    rand.ints().limit(10).forEach(System.out::println);
  }

}
