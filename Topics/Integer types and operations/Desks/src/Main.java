import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first, second, third;
        first = scanner.nextInt();
        second = scanner.nextInt();
        third = scanner.nextInt();
        first = first % 2 == 0 ? first / 2 : first / 2 + 1;
        second = second % 2 == 0 ? second / 2 : second / 2 + 1;
        third = third % 2 == 0 ? third / 2 : third / 2 + 1;
        System.out.println(first+second+third);
    }
}