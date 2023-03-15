package service;

import entity.Customers;
import entity.Products;

public interface CustomerService {
    void buyProduct(Customers customers, String products, int quantity);
}
