package tuhoctinhtruutuong2;

public class MayBay extends PhuongTienDiChuyen{
    protected String loaiNhienLieu;

    public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("May bay",hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 500;
    }
    public void catCanh(){
        System.out.println("cat canh");
    }
    public void haCanh(){
        System.out.println("ha canh");
    }
}
