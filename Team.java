import java.util.Scanner;
public class Team {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int count = 0;
        while (n-->0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if(a+b+c>=2)
                count++;
        }
        System.out.println(count);
    }
}
