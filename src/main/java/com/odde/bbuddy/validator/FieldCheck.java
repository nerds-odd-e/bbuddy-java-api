package com.odde.bbuddy.validator;

@FunctionalInterface
public interface FieldCheck<T> {

    boolean isValueUnique(T t);
}
