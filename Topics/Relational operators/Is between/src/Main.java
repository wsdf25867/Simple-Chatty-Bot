import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        boolean result = two <= one && one <= three || two >= one && one >= three;
        System.out.println(result);
    }
}