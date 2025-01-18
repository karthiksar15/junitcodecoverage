package com.tdd.multicurrency.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.tdd.multicurrency.controller.Item;
import com.tdd.multicurrency.entity.ItemEntity;
import com.tdd.multicurrency.repository.ItemRepository;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {

    @InjectMocks
    private ItemService itemService;

    @Mock
    private ItemRepository itemRepository;

    @Test
    void testFetchItem() {
    }

    @Test
    void testRetrieveAllItems() {
        when(itemRepository.findAll()).thenReturn(Arrays.asList(new ItemEntity(2, "pixel", 253698.0, 50, 12684900)));
        List<Item> items = itemService.retrieveAllItems();
        assertEquals(12684900, items.get(0).getValue());
    }
}
