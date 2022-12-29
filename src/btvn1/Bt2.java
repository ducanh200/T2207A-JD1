package btvn1;

import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args){
        Scanner kt = new Scanner(System.in);
        System.out.println("nhap cac gia tri");
        int n = kt.nextInt();
        int m = kt.nextInt();

        if(n==0 || m==0){
            System.out.println(n+ + m+ " la ucln");
        }
        while (n!=m){
            if (n>m){
                n=n-m;
            }else{
                m=m-n;
            }
        }
        System.out.println(n+" la ucln");
    }
}
