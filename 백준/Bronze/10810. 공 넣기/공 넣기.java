import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for(int o = 0; o < M; o++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int p = i - 1; p <= j - 1; p++) {
                arr[p] = k;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
