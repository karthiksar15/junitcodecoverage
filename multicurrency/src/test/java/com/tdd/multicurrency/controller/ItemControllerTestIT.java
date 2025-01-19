package com.tdd.multicurrency.controller;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.tdd.multicurrency.service.ItemService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ItemControllerTestIT {

        @Autowired
        private TestRestTemplate testRestTemplate;

        @Test
        public void contextLoads() throws Exception {
                String response = this.testRestTemplate.getForObject("/itemdb", String.class);
                JSONAssert.assertEquals("[{id:1},{id:2},{id:3}]", response, false);
        }

}
