import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        int count = 0;

        int arr[][] = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            count += arr[i][0] * arr[i][1];
        }


        if (count == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
