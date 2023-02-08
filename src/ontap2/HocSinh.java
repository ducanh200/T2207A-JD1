package ontap2;

public class HocSinh {
    String ten;
    String masv;
    String ngaysinh;
    String lop;
    String sdt;
    double diemtb;

    public HocSinh(String ten, String masv,String ngaysinh, String lop, String sdt, double diemtb) {
        this.ten = ten;
        this.masv = masv;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
        this.sdt = sdt;
        this.diemtb = diemtb;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void Inthongtin(){
        System.out.println("Ho va ten : "+ten);
        System.out.println("Ma sinh vien : "+masv);
        System.out.println("Ngay sinh : "+ngaysinh);
        System.out.println("Lop : "+lop);
        System.out.println("So dien thoai : "+sdt);
        System.out.println("Diem trung binh : "+diemtb);
    }

    public void Kiemtradiem(){
        if (this.diemtb>=8){
            System.out.println("hoc sinh xuat sac");
        }else {
            System.out.println("hoc sinh trng binh / kha ");
        }
    }
}
