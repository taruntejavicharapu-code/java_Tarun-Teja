import java.util.Scanner;
public class ParcelIntake {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String id = scn.next();
        String recipient = scn.next();
        char size = scn.next().charAt(0);
        double weight = scn.nextDouble();

        // storage fee = size base + weight surcharge (arithmetic + casting)
        int base = (size=='L') ? 30 : (size=='M') ? 20 : 10;
        int surcharge = (int) Math.ceil(weight) * 2; // Rs 2 per rounded-up kg
        int fee = base + surcharge;
        System.out.printf("Parcel: %s (%s)%n", id, recipient);
        System.out.printf("Size: %cWegiht: %.1fkg%n", size,weight);
        System.out.printf("Fee: Rs %d%n", fee);

    }
}