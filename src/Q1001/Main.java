package Q1001;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        double n=0;
        while(s.hasNext()){
            n=s.nextFloat();
            System.out.println(Math.round((1+n)*n/2));
            System.out.println();
        }
        s.close();
    }
    
    
}
 