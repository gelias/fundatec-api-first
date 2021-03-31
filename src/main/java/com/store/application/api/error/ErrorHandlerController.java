package com.store.application.api.error;

import com.store.application.api.ApiResponse;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;

import static java.lang.String.format;
import static org.slf4j.LoggerFactory.getLogger;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestControllerAdvice
public class ErrorHandlerController {

    private Logger logger = getLogger(ErrorHandlerController.class);

    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ApiResponse handleUnexpectedException(Exception exception) {
        // TODO
        exception.printStackTrace();
        return new ApiErrorResponse(BAD_REQUEST,format("Ops ... some butterfly in stomach right now!. Details: %s",exception.getMessage()));
    }

}
