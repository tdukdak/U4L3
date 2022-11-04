import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (or -1 to quit): ");
        int n = s.nextInt();
        int max = n;
        int min = n;
        while(n != -1){
            System.out.print("Enter a number (or -1 to quit): ");
            int x = s.nextInt();
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
