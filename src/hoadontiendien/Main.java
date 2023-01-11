package hoadontiendien;

public class Main {
    public static void main(String[] args){
        HoaDonTienDien hs = new HoaDonTienDien("99999","Nguyen Duc Anh","18/12/2022","Hoc Sinh",150,1);


        System.out.println("ma khach hang : "+hs.getMakh());
        System.out.println("Ho ten khach hang : "+hs.getHoten());
        System.out.println("Ngay cc hoa don cho khach hang : "+hs.getDay());
        System.out.println("Doi tuong khach hang : "+hs.getDoituong());
        System.out.println("So dien khach hang da sd : "+hs.getSodien()+" so dien");

        System.out.println("gia tien phai tra la : "+hs.Dongia(hs.HoaDonThanhTien())+" vnd");

        System.out.println("______________________________________");
        System.out.println("Hoa don cua nguoi nuoc ngoai : ");

    }
}
