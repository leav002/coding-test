import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A < 0 || A > 23 || B < 0 || B > 59) {
            System.out.println("올바르지 않은 시간 범위, 다시 입력하세요.");
            return;
        }

        B += C;
        A += B / 60;
        B %= 60;
        A %= 24;

        System.out.println(A + " " + B);
    }
}
