package com.lugowoy.tasks.convertUAHToOthersCurrencies;

import com.lugowoy.helper.other.DeepCloning;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**Created by Konstantin Lugowoy on 15-Dec-16.*/

public class Account implements Serializable, Cloneable {

    private BigDecimal UAH;
    private BigDecimal USD;
    private BigDecimal EUR;
    private BigDecimal RUB;

    public Account() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(getUAH(), account.getUAH()) &&
                Objects.equals(getUSD(), account.getUSD()) &&
                Objects.equals(getEUR(), account.getEUR()) &&
                Objects.equals(getRUB(), account.getRUB());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUAH(), getUSD(), getEUR(), getRUB());
    }

    @Override
    public String toString() {
        return "Account" +
                "UAH=" + UAH +
                ", USD=" + USD +
                ", EUR=" + EUR +
                ", RUB=" + RUB +
                ']';
    }

    @Override
    public Account clone() {
        Account account = new Account();
        try {
            account = (Account) super.clone();
            account.setUAH(DeepCloning.CLONER.deepClone(this.getUAH()));
            account.setUSD(DeepCloning.CLONER.deepClone(this.getUSD()));
            account.setEUR(DeepCloning.CLONER.deepClone(this.getEUR()));
            account.setRUB(DeepCloning.CLONER.deepClone(this.getRUB()));
        } catch (CloneNotSupportedException ex) {
            new InternalError(ex.getMessage()).printStackTrace();
        }
        return account;
    }

    public BigDecimal getUAH() {
        return UAH;
    }

    public void setUAH(BigDecimal UAH) {
        this.UAH = UAH;
    }

    public BigDecimal getUSD() {
        return USD;
    }

    public void setUSD(BigDecimal USD) {
        this.USD = USD;
    }

    public BigDecimal getEUR() {
        return EUR;
    }

    public void setEUR(BigDecimal EUR) {
        this.EUR = EUR;
    }

    public BigDecimal getRUB() {
        return RUB;
    }

    public void setRUB(BigDecimal RUB) {
        this.RUB = RUB;
    }

}