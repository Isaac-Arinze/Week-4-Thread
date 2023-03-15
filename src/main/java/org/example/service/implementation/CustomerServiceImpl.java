package service.implementation;

import entity.Customers;
import entity.Products;
import entity.Store;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    public void buyProduct(Customers customers, String product, int quantity) {
        for(Products p : Store.inventory){
            if(product.equalsIgnoreCase(p.getProductName())){
                customers.getCart().add(p);
                System.out.println(customers.getCustomersName() + " added " + p.getProductName());
            }
        }


    }
}
