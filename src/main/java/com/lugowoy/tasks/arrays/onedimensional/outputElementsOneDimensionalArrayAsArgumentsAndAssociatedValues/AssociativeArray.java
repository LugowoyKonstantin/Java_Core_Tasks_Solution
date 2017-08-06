package com.lugowoy.tasks.arrays.onedimensional.outputElementsOneDimensionalArrayAsArgumentsAndAssociatedValues;

/** Created by Konstantin Lugowoy on 23-Feb-17. */

public class AssociativeArray <T extends Object, V extends Object> {

    private T[] argumentArray;
    private V[] valueArray;

    private Object[] associativeArray;

    public AssociativeArray() {
        System.out.println("Empty associative array.");
    }

    public AssociativeArray(Object[] associativeArray) {
        this.associativeArray = associativeArray;
    }

    public Object[] getAssociativeArray() {
        return associativeArray;
    }

}
