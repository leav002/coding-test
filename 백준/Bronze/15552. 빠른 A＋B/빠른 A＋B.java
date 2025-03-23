import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        for(int i = 0; i < input; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            int front = Integer.parseInt(arr[0]);
            int back = Integer.parseInt(arr[1]);
            bw.write((front + back) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
