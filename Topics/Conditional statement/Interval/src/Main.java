import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        if (-15 < num && num <= 12) {
            System.out.println("True");
        } else if (14 < num && num < 17) {
            System.out.println("True");
        } else if (19 <= num) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}