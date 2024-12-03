package org.example.en_us.dip_dependency_inversion_principle.solution;

import org.example.en_us.srp_single_responsability_principle.violation.Order;

/**
 * DIP SOLUTION
 */
public class Main {

    public static void main(String[] args) {

        PgRepository pgRepo = new PgRepository();
        OracleRepository oracleRepository = new OracleRepository();
        SendConfirmationEmail sendMail = new SendConfirmationEmail();

        Order order = new Order();

        OrderProcessor orderProcessor = new OrderProcessor(pgRepo, sendMail);

        orderProcessor.process(order);
    }

}
