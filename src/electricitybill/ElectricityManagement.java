package electricitybill;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ElectricityManagement {

    public void insert(Customer c) {

        try {

            Connection con = DBConnection.getConnection();

            double billAmount = Bill.calculateBill(c.unitsConsumed);

            String query =
            "INSERT INTO customers VALUES(?,?,?,?,?)";

            PreparedStatement ps =
            con.prepareStatement(query);

            ps.setInt(1, c.customerId);
            ps.setString(2, c.customerName);
            ps.setString(3, c.meterNumber);
            ps.setInt(4, c.unitsConsumed);
            ps.setDouble(5, billAmount);

            ps.executeUpdate();

            System.out.println("Customer added successfully");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}