import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String java = scanner.nextLine();
        String substring = java.substring(scanner.nextInt(), scanner.nextInt() + 1);
        System.out.println(substring);
    }
}
