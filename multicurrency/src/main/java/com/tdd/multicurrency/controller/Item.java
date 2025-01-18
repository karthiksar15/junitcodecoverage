package com.tdd.multicurrency.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class Item {

    private Integer id;

    private String name;

    private Double price;

    private Integer quantity;

    private Long value;

    public void setValue(Long value) {
        this.value = value;
    }

    public Item(Integer id, String itemName, Double price, Integer quantity) {
        this.id = id;
        this.name = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Item[%d%s%f%d]", this.id, this.name, this.price,
                this.quantity);
    }

}
