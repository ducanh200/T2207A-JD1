package tuhoctinhtruutuong2;

public abstract class PhuongTienDiChuyen {
    protected  String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String tenLoaiPhuongTien,HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }
    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenhangSanXuat();
    }
    public void batDau(){
        System.out.println("bat dau..... ");
    }
    public void tangToc(){
        System.out.println("tang toc.....");
    }
    public void dungLai(){
        System.out.println("dung lai...");
    }
    public abstract double layVanToc();
}
