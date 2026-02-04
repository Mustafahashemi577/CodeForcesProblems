import java.util.Scanner;

public class JellyfishAndUndertale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            Long sum = (long) b;
            for(int i = 0;i<n;i++)
                sum+=Math.min(scan.nextInt(),a-1);
            System.out.println(sum);
        }
    }
}
