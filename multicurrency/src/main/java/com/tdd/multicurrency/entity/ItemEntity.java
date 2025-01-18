package com.tdd.multicurrency.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item")
public class ItemEntity {
    @Id
    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;
    @JsonIgnore
    @Transient
    private Integer value;
}
