package com.semih.javaeight.lambda;

import org.junit.Assert;
import org.junit.Test;

public class LambdaExpressionTest {
  @Test
  public void testLambda(){
    Assert.assertEquals(2,2);
    LambdaExpression lambdaExpression = new LambdaExpression();
    lambdaExpression.lambdaExp();
  }

}
