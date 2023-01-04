import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String hello = scanner.nextLine();
        String java = scanner.nextLine();
        String future = scanner.nextLine();
        System.out.println(hello);
        System.out.println(java);
        System.out.println(future.split(" ")[0]);
        System.out.println(future.split(" ")[1]);

    }
}