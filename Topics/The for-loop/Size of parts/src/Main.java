import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int n = sc.nextInt();
        int zeroCount=0;
        int oneCount=0;
        int negativeOneCount=0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                zeroCount++;
            }
            if (num == -1) {
                negativeOneCount++;
            }
            if (num == 1) {
                oneCount++;
            }
        }
        System.out.printf("%d %d %d",zeroCount, oneCount, negativeOneCount);
    }
}