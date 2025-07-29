import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1 - Count digits");
        System.out.println("2 - Reverse a number");
        System.out.println("3 - GCD / HCF of two numbers");
        System.out.println("4 - Is the number prime ??");
        System.out.print("Enter choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number to count digits: ");
                int n = sc.nextInt();
                int ans1 = count(n);
                System.out.println("Number of digits: " + ans1);
                break;

            case 2:
                System.out.print("Enter a number to reverse: ");
                int n2 = sc.nextInt();
                int ans2 = rev(n2);
                System.out.println("Reversed number: " + ans2);
                break;

            case 3:
                System.out.println("Enter two numbers for GCD/HCF: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int ans3 = gcd(a, b);
                System.out.println("GCD / HCF: " + ans3);
                break;

            case 4:
                System.out.println("Enter the number : ");
                int n3 = sc.nextInt();
                prime(n3);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static int count(int n) {
        int c = 0;
        while (n != 0) {
            int rem = n % 10;
            c++;
            n = n / 10;
        }
        return c;
    }

    public static int rev(int n) {
        int rem;
        int rev = 0;
        while (n != 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }

    public static int gcd(int a, int b) {
        int min;
        int gcd = 1;
        int maxgcd = 1;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            if (maxgcd < gcd) {
                maxgcd = gcd;
            }
        }
        return maxgcd;
    }

    public static void prime(int a) {
        int c = 0;
        for (int i = 1; i <= a; i++) {
            if (i == 1) {
                continue;
            }
            if (i == a) {
                continue;
            }
            if (a % i == 0) {
                c = 1;
                break;
            }
        }
        if (c == 1) {
            System.out.println("nOt a prime number !!");

        } else {
            System.out.println("Prime");
        }

    }
}
