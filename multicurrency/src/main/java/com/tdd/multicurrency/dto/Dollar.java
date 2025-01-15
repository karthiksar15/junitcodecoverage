package com.tdd.multicurrency.dto;

public class Dollar {
    public Double amount;

    public Dollar(Double amount) {
        this.amount = amount;
    }

    public Double times(Double multiplier) {
        this.amount = amount * multiplier;
        return amount;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dollar other = (Dollar) obj;
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else if (!amount.equals(other.amount))
            return false;
        return true;
    }

}
