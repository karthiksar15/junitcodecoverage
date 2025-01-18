package com.tdd.multicurrency.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tdd.multicurrency.service.SomeDataService;

@ExtendWith(MockitoExtension.class)
public class BusinessImplTest {

    @Mock
    private SomeDataService someDataServiceMock;
    @InjectMocks
    private BusinessImpl businessImpl = new BusinessImpl(someDataServiceMock);

    @Test
    void testCalculateSum() {
        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });
        int actualResult = businessImpl.calculateSumUsingSomeDataService();
        assertEquals(6, actualResult);
    }
}

// @Test
// void testCalculateEmpty() {
// int actualResult = businessImpl.calculateSum(new int[] {});
// assertEquals(0, actualResult);
// }
// }
