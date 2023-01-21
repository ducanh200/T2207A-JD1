package tuhoctinhtruutuong2;

public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("hang1","Viet Nam");
        HangSanXuat h2 = new HangSanXuat("hang2","Nga");
        HangSanXuat h3 = new HangSanXuat("hang3","HoaKi");

        PhuongTienDiChuyen p1 = new Oto(h1 , "Xang" );
        MayBay p2 = new MayBay(h2 , "Xang" );
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println("Lay hang san xuat : "+p1.layTenHangSanXuat());

        System.out.println("bat dau");
        p2.batDau();

        System.out.println("lay van toc : ");
        System.out.println("p1 : "+p1.layVanToc());
        System.out.println("p2 : "+p2.layVanToc());
        System.out.println("p3 : "+p3.layVanToc());

        System.out.println("cat canh : ");
        p2.catCanh();
    }
}
