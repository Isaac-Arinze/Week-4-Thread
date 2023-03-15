package service.implementation;

import entity.Customers;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CashierServiceImpl {

    private final Queue<Customers> priority = new PriorityQueue<>();
    private Queue<Customers> fifo = new LinkedList<>();

    public void sellProduct(Customers customers){
        System.out.println(" sold  : " + customers.getCart().size() + " products ");
    }

    public void addToPriority(Customers customers){
        priority.offer(customers);
    }

    public void priorityBasedOnItemSize(){
        System.out.println("\n");
        System.out.println("***********************************");
        System.out.println("Selling to customers based on number of Items");

        while (!priority.isEmpty()) {
            sellProduct(priority.poll());
        }
    }

    public void addCustomerToFIFO(Customers customers){
        fifo.offer(customers);
    }

    public void printOutFIFO(){
        System.out.println("\n");
        System.out.println("************");
        System.out.println("selling to customers based on FIFO");

        while(!fifo.isEmpty()){
            sellProduct(fifo.poll());
        }
    }
}
