package electricitybill;

public class Customer {

    int customerId;
    String customerName;
    String meterNumber;
    int unitsConsumed;

    public Customer(int customerId, String customerName,
                    String meterNumber, int unitsConsumed) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.meterNumber = meterNumber;
        this.unitsConsumed = unitsConsumed;
    }
}