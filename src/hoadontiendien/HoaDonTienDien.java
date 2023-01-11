package hoadontiendien;

public class HoaDonTienDien {
    private String makh;
    private String hoten;
    private String day;
    private String doituong;
    private double sodien;
    private double Gia1sd;



    public HoaDonTienDien(String ma,String ten,String day,String doituong,double sodien,double gia){
        this.makh = ma;
        this.hoten = ten;
        this.day  = day;
        this.doituong = doituong;
        this.sodien = sodien;
        this.Gia1sd = gia;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }

    public double getSodien() {
        return sodien;
    }

    public void setSodien(double sodien) {
        this.sodien = sodien;
    }

    public double Dongia(double x){
        if (this.sodien<50){
            return this.Gia1sd = 1000 * this.sodien;
        }else if (this.sodien>=50 && this.sodien<100){
            return this.Gia1sd = 1200 * this.sodien;
        }else if (this.sodien>=100 && this.sodien<200){
            return this.Gia1sd = 1500 * this.sodien;
        }else{
            return this.Gia1sd = 2000 * this.sodien;
        }
    }
    public double HoaDonThanhTien(){
        return this.sodien * this.Dongia(this.Gia1sd);
    }
}
