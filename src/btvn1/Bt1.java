package btvn1;

import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args){
        Scanner bt = new Scanner(System.in);
        System.out.println("nhap mot so n : ");
        int n =  bt.nextInt();

        int sum=0;
        for (int i = 1;i < n;i++) {
            if (n % i == 0) {
                sum = sum + i;

            }
        }
        if(sum == n){
            System.out.println(n+"la so hoan hao");
        }else{
            System.out.println(n+"khong phai so hoan hao");
        }


    }
}
