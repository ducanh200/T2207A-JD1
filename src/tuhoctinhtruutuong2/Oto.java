package tuhoctinhtruutuong2;

public class Oto extends PhuongTienDiChuyen{
    protected String loaiNhienLieu;

    public Oto(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("Xe oto",hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu( String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 150;
    }
}
