import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scan.nextDouble();
        System.out.print("Enter y: ");
        double y = scan.nextDouble();
        System.out.print("Enter z: ");
        double z = scan.nextDouble();

        if (x < y && y < z) {
            System.out.println("Increasing");
        } else if (x > y && y > z) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }
}