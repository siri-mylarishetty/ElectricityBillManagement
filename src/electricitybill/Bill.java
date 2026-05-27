package electricitybill;

public class Bill {

    public static double calculateBill(int units) {

        double bill = 0;

        if(units <= 100) {
            bill = units * 2;
        }

        else if(units <= 300) {
            bill = (100 * 2) + ((units - 100) * 3);
        }

        else {
            bill = (100 * 2) + (200 * 3) + ((units - 300) * 5);
        }

        return bill;
    }
}