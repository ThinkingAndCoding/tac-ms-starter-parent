package org.tac.ms.tacmscommonstartbase.exception;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by zhangdong on 2017/5/18.
 */
@ControllerAdvice
public class ControllerEnhance {
    private final Logger logger = Logger.getLogger(getClass());
    // 定义全局异常处理，value属性可以过滤拦截条件，此处拦截所有的Exception
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ExceptionResponse exception(Exception exception, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(500, exception.getMessage());
        logger.error(exception.getMessage(),exception);
        return exceptionResponse;
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public ExceptionResponse businessexception(BusinessException businessException, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(900000, businessException.getMessage());
        logger.info(businessException.getMessage(),businessException);
        return exceptionResponse;
    }

    @ExceptionHandler(value = ParamException.class)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public ExceptionResponse paramexception(ParamException paramException, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(900001, paramException.getMessage());
        logger.info(paramException.getMessage(),paramException);
        return exceptionResponse;
    }
}
