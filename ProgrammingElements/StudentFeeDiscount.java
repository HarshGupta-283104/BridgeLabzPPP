package ProgrammingElements;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        
        double fee = 125000;
        double discountPercentage = 10;
        double discount = (fee * discountPercentage)/100;
        double discountAmount = fee-discount;

        System.out.println("The discount amount: " + discount);
        System.out.println("The discount fee to pay: " + discountAmount);
    
    }
}
