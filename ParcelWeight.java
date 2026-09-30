import java.util.Scanner;

import java.util.Scanner ;
public class ParcelWeight {
  public Static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try {
        System.out.print (
            "Enter parcel weight;"
        );
        Double weight =
        Double.parseDouble (
            sc.nextline ( )
        );
        System.out.println (
            " wight accepeted : "
            + weight + " kg "
        )
        catch (Number Format Exception e) {

            System.out.println(
               "Invalid weight." +
               "Please enter a number."
            );
        }
        finally {
            System.out.println(
                "Weight checking completed."
            );
        }
        sc.close();
    }
  }
}