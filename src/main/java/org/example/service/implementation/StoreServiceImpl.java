package service.implementation;

import entity.Products;
import entity.Store;
import service.StoreService;

public class StoreServiceImpl implements StoreService {

    public void addProducts(Store store, Products products) {
        store.getInventory().add(products);
    }
}
