package buoi2;

import java.util.Scanner;

public class Phanso {
    int tu;
    int mau;

    public Phanso() {
        do {
            Scanner ps = new Scanner(System.in);
            System.out.println("nhap tu : ");
            tu = ps.nextInt();
            System.out.println("nhap mau : ");
            mau = ps.nextInt();
        } while (!Kiemtra () );

    }
    public boolean Kiemtra(){
        return mau!=0;
    }

    public int In(){
        return   tu / mau;
      }
    }

