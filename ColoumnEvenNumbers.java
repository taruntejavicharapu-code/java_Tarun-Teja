import java.util.Scanner;

public class ColoumnEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers:");

        for(int i = 0; i < 10; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}