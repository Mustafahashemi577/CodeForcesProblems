import java.util.Scanner;

public class EverybodyLikesGoodArrays {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int a[] = new int [n];
            for(int i = 0;i<n;i++)
                a[i]=scan.nextInt();
            int ops = 0;
            for(int i = 0;i<n-1;i++)
                if(a[i]%2==a[i+1]%2)
                    ops++;

            System.out.println(ops);
        }
    }
}
