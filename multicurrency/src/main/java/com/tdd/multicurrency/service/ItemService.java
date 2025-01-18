package com.tdd.multicurrency.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tdd.multicurrency.controller.Item;
import com.tdd.multicurrency.entity.ItemEntity;
import com.tdd.multicurrency.repository.ItemRepository;

@Service
public class ItemService {

    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private ItemRepository itemRepository;

    public Item fetchItem() {
        return new Item(2, "Pixel", 368.20, 20);
    }

    public List<Item> retrieveAllItems() {
        List<ItemEntity> itemsEntity = itemRepository.findAll();
        List<Item> items = itemsEntity.stream()
                .map(entity -> objectMapper.convertValue(entity, Item.class))
                .toList();
        items.forEach(item -> item.setValue(Math.round(item.getQuantity() * item.getPrice())));
        return items;
    }

}
