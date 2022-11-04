import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int max = x;
        int min = x;

        while(x != -1){
            System.out.print("Enter a number (or -1 to quit): ");
            x = s.nextInt();
            max = x;
            min = x;
            if (x > max){
                max = x;
            }
            if (x < min){
                min = x;
            }
        }
        System.out.println("max is: " + max);
        System.out.println("min is: " + min);
    }
}
