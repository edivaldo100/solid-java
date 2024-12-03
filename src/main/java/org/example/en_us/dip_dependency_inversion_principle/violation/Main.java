package org.example.en_us.dip_dependency_inversion_principle.violation;

import org.example.en_us.srp_single_responsability_principle.violation.Order;

/**
 * DIP VIOLATION
 */
public class Main {
    
    public static void main(String[] args) {
        
        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.process(new Order());

    }

}
