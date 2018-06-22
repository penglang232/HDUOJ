package Q1002;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println("Case "+i+":");
            System.out.println(a+" + "+b+" = "+a.add(b));
            if(i!=n){
                System.out.println();
            }
        }
    }
}
 