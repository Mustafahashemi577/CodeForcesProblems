import java.util.Scanner;

public class VasilijeInCacak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            long x = scan.nextLong();
            long minSum=((long) k *(k+1))/2;
            long first = n - k + 1;
            long maxSum = (long) k * (first + n) / 2;
            if(x==minSum||x==maxSum || x>minSum&&x<maxSum)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
