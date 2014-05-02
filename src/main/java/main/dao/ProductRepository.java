package main.dao;

import main.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author trkarlis (sezin.karli@eu.sony.com)
 * @since 4/7/14 1:56 PM
 *        User: Sezin Karli
 */
// Table 5.1. Supported keywords for query methods
// http://docs.spring.io/spring-data/data-mongodb/docs/current/reference/html/mongo.repositories.html
public interface ProductRepository extends MongoRepository<Product, String>{
    public List<Product> findBySku(String sku);
    public List<Product> findByAvailabilityNot(Integer availability);
}
