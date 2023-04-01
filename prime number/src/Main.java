import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isPrime = true;

        do {
            System.out.print("Please enter a positive number greater than 1: ");
            number = scanner.nextInt();
        } while (number < 2);

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is a not prime number");
        }
    }
}



