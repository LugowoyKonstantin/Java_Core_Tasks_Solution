package com.lugowoy.tasks.core.determineDigitInNumberAndTheirSum;

/** Created by Konstantin Lugowoy on 06.10.2017. */

@FunctionalInterface
public interface Determinator<T> {

    void determine(T t);

}