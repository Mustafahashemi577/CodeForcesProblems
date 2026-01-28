import java.util.Scanner;

public class OneAndTwo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int a[] = new int[n];
            var totalTwo = 0;
            for(int i = 0;i<n;i++) {
                a[i] = scan.nextInt();
                if(a[i]==2)
                    totalTwo++;
            }
            int ans = -1;
            var currTwo = 0;
            for(int i = 0;i<n;i++){
                if(a[i]==2)
                    currTwo++;
                if(currTwo==(totalTwo-currTwo)) {
                    ans = i + 1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
