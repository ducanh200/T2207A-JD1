package ontap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HocSinh[] hs = new HocSinh[1];
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i<hs.length;i++){
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap ma sinh vien : ");
            String ma = sc.nextLine();
            System.out.println("Nhap ngay sinh:");
            String ns = sc.nextLine();
            System.out.println("lop:");
            String lh = sc.nextLine();
            System.out.println("Nhap so lien lac : ");
            String sdt = sc.nextLine();
            System.out.println("diem trung binh:");
            double tb = sc.nextDouble();
            hs[i] = new HocSinh(ten,ma,ns,lh,sdt,tb);
        }
        for (int i = 0;i<hs.length;i++){
            hs[i].Inthongtin();
        }
        for (int i = 0; i < hs.length;i++){
            if (hs[i].getDiemtb()>=8){
                System.out.println("Hoc sinh xuat sac");
            }else{
                System.out.println("Hoc sinh trung binh/kha");
            }
            return;
        }
    }
}
