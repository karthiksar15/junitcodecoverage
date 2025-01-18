package com.tdd.multicurrency.controller;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.assertj.MockMvcTester.MockMvcRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.tdd.multicurrency.controller.Item;
import com.tdd.multicurrency.service.ItemService;

@WebMvcTest
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockitoBean
    private ItemService itemService;

    @Test
    void testFetchItem() throws Exception {

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/item")
                .accept(MediaType.APPLICATION_JSON);
        mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("""
                        {
                            "id": 1,
                            "itemName": "Pen",
                            "price": 15.25
                        }
                        """));
    }

    @Test
    void testFetchItemFromService() throws Exception {

        when(itemService.fetchItem()).thenReturn(new Item(2, "pixel", 368.2, 20));
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/item")
                .accept(MediaType.APPLICATION_JSON);
        mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("""
                        {
                            "id": 2,
                            "itemName": "pixel",
                            "price": 368.2
                        }
                        """));
    }

    @Test
    void testFetchItemFromServiceDb() throws Exception {

        when(itemService.retrieveAllItems()).thenReturn(Arrays.asList(new Item(2, "IPhone1", 253698.0, 50)));
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/itemdb")
                .accept(MediaType.APPLICATION_JSON);
        mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("""
                        [{
                            "id": 2,
                            "name": IPhone1,
                            "price": 253698.0
                        }]
                        """));
    }
}
