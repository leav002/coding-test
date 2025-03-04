import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (H < 0 || H > 23 || M < 0 || M > 59) {
            System.out.println("옳바르지 않은 범위. 다시 실행하세요.");
            return;
        }

        M -= 45;
        if (M < 0) {
            M += 60;
            H--;
            if (H < 0) {
                H = 23;
            }
        }

        System.out.println(H + " " + M);
    }
}
