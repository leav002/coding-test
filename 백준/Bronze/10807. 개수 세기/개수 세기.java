import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c =0;

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m) {
                c++;
            }
        }
        System.out.println(c);
    }
}
