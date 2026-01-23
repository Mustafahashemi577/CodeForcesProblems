import java.util.ArrayList;
import java.util.Scanner;

public class UnitArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int pos = 0,neg = 0;
            for(int i = 0;i<n;i++){
                int x = scan.nextInt();
                if(x==1)
                    pos++;
                else
                    neg++;
            }
            int ops = 0;
            while (pos < neg || neg % 2 == 1) {
                ops++;
                pos++;
                neg--;
            }
            System.out.println(ops);
        }
    }
}
