import java.util.Scanner; 

public class giftTax {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxValue;

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scanner.nextLine());

        if (giftValue < 5000) {taxValue = 0;}
        else if (giftValue < 25000) {taxValue = 100 + 0.08 * (giftValue - 5000);}
        else if (giftValue < 55000) {taxValue = 1700 + 0.10 * (giftValue - 25000);}
        else if (giftValue < 200000) {taxValue = 4700 + 0.12 * (giftValue - 55000);}
        else if (giftValue < 1000000) {taxValue = 22100 + 0.15 * (giftValue - 200000);}
        else {taxValue = 142100 + 0.17 * (giftValue - 1000000);}

        if (taxValue == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + taxValue);
        }
        
    }
}