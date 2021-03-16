package com.store.application.api.error;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.rmi.UnexpectedException;

import static org.mockito.MockitoAnnotations.initMocks;

public class ErrorHandlerControllerTest {

    @InjectMocks
    private ErrorHandlerController errorHandlerController;

    @Before
    public void setup(){
        initMocks(this);
    }

    @Test
    public void shouldCatchAllUnexpectedException(){
        UnexpectedException unexpectedException = new UnexpectedException("Ops ...");
        ApiErrorResponse apiResponse = (ApiErrorResponse) errorHandlerController.handleUnexpectedException(unexpectedException);
        Assert.assertEquals(400,apiResponse.getStatus());
    }

}