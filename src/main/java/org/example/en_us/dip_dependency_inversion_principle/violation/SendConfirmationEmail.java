package org.example.en_us.dip_dependency_inversion_principle.violation;

import org.example.en_us.srp_single_responsability_principle.violation.Order;
import org.example.en_us.srp_single_responsability_principle.violation.SmtpGmail;

/**
 * DIP VIOLATION
 */
public class SendConfirmationEmail {

    public void sendConfirmationEmail(Order order) {
        SmtpGmail smtp = new SmtpGmail("mySmtpUser", "mySmtpPassword");
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();

        String html = "Dear ".concat(name).concat(", yor Order ")
                .concat(order.getId().toString()).concat(" is confirmed!😎");

        smtp.send(html, email);
    }

}
