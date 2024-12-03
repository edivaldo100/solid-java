package org.example.en_us.dip_dependency_inversion_principle.violation;
import org.example.en_us.srp_single_responsability_principle.violation.Order;
import org.example.en_us.srp_single_responsability_principle.violation.PgConnection;

/**
 * DIP VIOLATION
 */
public class PgRepository {

    public boolean save(Order order) {
        PgConnection dbConnection = new PgConnection("database.url");

        try {
            dbConnection.persist(order);
        } catch (Exception e) {
            // log
            return false;
        }

        return true;
    }

}
