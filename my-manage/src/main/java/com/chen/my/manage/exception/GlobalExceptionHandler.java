package com.chen.my.manage.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class GlobalExceptionHandler
{
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class.getName());

    @ExceptionHandler(value = { Throwable.class })
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public BusinessErrorRes handleCommonException(Throwable e, HttpServletResponse response, HttpServletRequest request)
            throws IOException
    {
        logger.error("error", e.getCause(), e);
        return BusinessErrorRes.create(BusinessExceptionCode.SYSTEM_ERROR, BusinessExceptionCode.getMessage(BusinessExceptionCode.SYSTEM_ERROR));
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseStatus(value = HttpStatus.CONFLICT)
    @ResponseBody
    public BusinessErrorRes handleBusinessException(BusinessException e, HttpServletResponse response )
            throws IOException {
        logger.error(e.getMessage(), e);
        return BusinessErrorRes.create(e.getCode(), e.getMessage());
    }
 
}