package org.example;
import marketX.StreamOps;
import marketX.Customer;

import java.util.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        StreamOps streamOps = new StreamOps();

        List<Customer> filtered = streamOps.filterCustomers();
        List<String> mapped = streamOps.mapCustomers();
        double totalPurchase= streamOps.totalPurchaseAmount();
        Customer customer = streamOps.highestPurchaseAmount();
        Map<String,Double> avgPurchaseByCity = streamOps.averagePurchaseByCity();
        /// report generation

        System.out.println("Filtered customers: "+ mapped);
        System.out.println("Total purchase: "+ totalPurchase);
        System.out.println("Customer with highest purchase: "+ customer.getName());
        System.out.println("Avg purchase: "+ avgPurchaseByCity);

    }
}