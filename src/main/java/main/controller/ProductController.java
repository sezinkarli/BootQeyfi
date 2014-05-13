package main.controller;

import main.dao.ProductRepository;
import main.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author trkarlis (sezin.karli@eu.sony.com)
 * @since 4/8/14 4:18 PM
 *        User: Sezin Karli
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductRepository repository;

    @RequestMapping(value = "/{sku}")
    public String getSku(@PathVariable String sku, ModelMap modelMap){
        List<Product> products = repository.findBySku(sku);
        if(!products.isEmpty()) {
            modelMap.put("products", products);
        }

        return "product-page";
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/available")
    public String getSku(ModelMap modelMap){
        List<Product> availableProducts = repository.findByAvailabilityNot(0);
        if(!availableProducts.isEmpty()) {
            modelMap.put("products", availableProducts);
        }

        return "product-page";
    }



}
