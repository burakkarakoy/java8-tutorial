package com.semih.javaeight.lambda;

@FunctionalInterface
public interface Converter<F, T> {

  T convert(F conv);
}
