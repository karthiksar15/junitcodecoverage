package com.tdd.multicurrency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdd.multicurrency.service.ItemService;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/item")
    public Item fetchItemFromService() {
        return itemService.fetchItem();
    }

    @GetMapping("/item1")
    public Item fetchItem1() {
        return new Item(1, "Phone", 10.25, 15);
    }

    @GetMapping("/itemdb")
    public List<Item> fetchItemDb() {
        return itemService.retrieveAllItems();
    }

}
