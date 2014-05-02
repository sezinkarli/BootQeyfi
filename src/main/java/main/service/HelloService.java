package main.service;

import main.dao.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author trkarlis (sezin.karli@eu.sony.com)
 * @since 3/19/14 4:28 PM
 *        User: Sezin Karli
 */
@Component
public class HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloService.class);

    @Autowired
    ProductRepository repository;

    @Value("${firstProperty}")
    private String helloMessage;

    public String sayHello(){
        logger.info("hede");
        return helloMessage;
    }
}
