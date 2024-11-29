package hu.tinder.music_shop_application.exception_handler;

import hu.tinder.music_shop_application.dto.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Gergely Jakab
 */
@RestControllerAdvice
public class GeneralExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    //TODO add more exception handlers for various exceptions
    @ExceptionHandler(exception = MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public hu.tinder.music_shop_application.dto.ErrorResponse handleBadRequest(MethodArgumentNotValidException e) {
        logger.error(e.getMessage(), e);

        ErrorResponse errorResponse = new ErrorResponse();
        //TODO meaningful error message
        errorResponse.setMessage(e.getMessage());

        return errorResponse;
    }
}
