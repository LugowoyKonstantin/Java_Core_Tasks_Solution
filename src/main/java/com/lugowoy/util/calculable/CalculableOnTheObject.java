package com.lugowoy.util.calculable;

/**
 * Created by Konstantin Lugowoy on 03-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 03.02.2017
 * <p>
 * Functional interface declares a contract for calculations using data that encapsulates the object.
 */
@FunctionalInterface
public interface CalculableOnTheObject<T> {

    /**
     * The method(function) of performing calculations on data that encapsulates the object passed to argument.
     *
     * @param t The object that encapsulates data to calculate.
     * @return The object that encapsulates the result of the calculation.
     * @since 03.02.2017
     */
    T calculate(T t);
}