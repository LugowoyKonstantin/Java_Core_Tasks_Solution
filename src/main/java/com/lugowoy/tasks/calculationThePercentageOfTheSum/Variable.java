package com.lugowoy.tasks.calculationThePercentageOfTheSum;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 30-Jan-17. */

public class Variable {

    private BigDecimal sum;
    private BigDecimal percent;
    private BigDecimal partOfSum;

    public Variable(BigDecimal sum) {
        this.sum = sum;
    }

    public Variable(BigDecimal sum, BigDecimal partOfSum) {
        this.sum = sum;
        this.partOfSum = partOfSum;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public BigDecimal getPartOfSum() {
        return partOfSum;
    }

    public void setPartOfSum(BigDecimal partOfSum) {
        this.partOfSum = partOfSum;
    }

}