import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String s = scanner.nextLine();
        int sum = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}