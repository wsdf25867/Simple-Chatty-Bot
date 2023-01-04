import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        boolean result = one.replaceAll(" ", "").equals(two.replaceAll(" ", ""));
        System.out.println(result);
    }
}