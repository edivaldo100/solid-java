package org.example.en_us.dip_dependency_inversion_principle.solution;

import org.example.en_us.srp_single_responsability_principle.violation.Order;

/**
 * DIP SOLUTION
 */
public interface IMailRepository {

    void sendConfirmationEmail(Order order);

}
