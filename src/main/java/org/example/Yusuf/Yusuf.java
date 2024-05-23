
package org.example.Yusuf;
import java.util.Scanner;
public class Yusuf{
    public static long power(int n,int m){
        long pow=1;
        for(int i = m;i>=1;i--){
            pow *=n;
        }
        return pow;
    }
    public static void main(String [] args){
        final Scanner scanner = new Scanner(System.in);
        final   int n = scanner.nextInt();


        final int m = scanner.nextInt();
        System.out.println(power(n,m));

    }

}