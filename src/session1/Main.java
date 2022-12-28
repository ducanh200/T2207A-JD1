package session1;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x = 10;
        double y =3.14;
        String s = "Hello world !";
        System.out.println("x = "+x);
        y = y + 20 *x;

        if(y>100){
            System.out.println("y= "+y);
        } else {
            System.out.println("x= "+x);
        }
        for (int i=0;i<10;i++){
            System.out.println("i= "+i);
        }
        //tính S=1+2+3+...+1000;
        //tính s= 1+1/2+1/3+...+1/1000
        int S1 =0 ;
        for (int i=1;i<=1000;i++){
            S1=S1+i;
        }
        System.out.println("S1= "+S1);
        double S2 = 0;
        for(int i=1;i<=1000;i++){
            S2 = S2 + (double) 1/i;
        }
        System.out.println("S2= "+S2);

        int z=tinhTong(10,15);
        boolean t=true;
        //nhập một số nguyên từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so nguyen:");
        int n = sc.nextInt();

        System.out.println("nhap mot so thuc:");
        Double d =sc.nextDouble();
        System.out.println("nhap mot string:");
        String str = sc.nextLine();
        System.out.println("n: "+n);
        System.out.println("d: "+d);
        System.out.println("str: "+str);

        //nhap mot so nguyen tu ban phim
        // ting tong s=1+2+3+...+n;

    }
    static int tinhTong(int a,int b){
        return a+b;
    }
    static int tinhHieu(int a,int b) {
        return a - b;
    }
    static int tinhTich(int a,int b){
        return a*b;
    }
    static int tinhThuong(int a,int b){
        return b==0? null:a/b;
    }


}
