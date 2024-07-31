import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong numbers.");
        }
    }

    // Function to check if a number is an Armstrong number
    static boolean isArmstrong(int number) {
        int originalNumber = number;
        int n = String.valueOf(number).length(); // Number of digits
        int result = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, n);
            originalNumber /= 10;
        }

        return result == number;
    }
}
