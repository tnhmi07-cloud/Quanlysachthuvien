import java.util.Scanner;

public class BTT3 
{
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double donGia;
    protected Scanner sc = new Scanner(System.in);
    public BTT3 (){}
    public BTT3 (String maSach, String tenSach, String tacGia, int namXuatBan, int soLuong, double donGia) 
    {
        this.maSach=maSach;
        this.tenSach=tenSach;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
        this.soLuong=soLuong;
        this.donGia=donGia;
    }

    public String getmaSach() { return maSach;}
    public String gettenSach() {return tenSach;}
    public String gettacGia() {return tacGia;}
    public int getnamXuatBan() {return namXuatBan;}
    public int getsoLuong() {return soLuong;}
    public double getdonGia() {return donGia;}
    
    public void setmaSach(String maSach) {this.maSach=maSach;}
    public void settenSach(String tenSach) {this.tenSach=tenSach;}
    public void settacGia(String tacGia) {this.tacGia=tacGia;}
    public void setnamXuatBan(int namXuatBan ) {this.namXuatBan=namXuatBan;}
    public void setsoLuong(int soLuong) {this.soLuong=soLuong;}
    public void setdonGia(double donGia) {this.donGia=donGia;}

    public void Nhap()
    {
        System.out.println("Nhap ma sach: ");
        this.maSach =this.sc.nextLine();
        System.out.println("Nhap ten sach: ");
        this.tenSach =this.sc.nextLine();
        System.out.println("Nhap tac gia: ");
        this.tacGia =this.sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        this.namXuatBan =this.sc.nextInt();
        System.out.println("Nhap don gia: ");
        this.donGia =this.sc.nextDouble();
        System.out.println("Nhap so luong: ");
        this.soLuong =this.sc.nextInt();
    }

    public double thanhTien() {return this.donGia * this.soLuong;}
    public double phiVanChuyen() {return thanhTien() * 0.05;}
    public double tongTienNhap() {return thanhTien() + phiVanChuyen();}

    public void Xuat() 
    {
        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
    }

    public static void main(String[] args)
        {
            BTT3 sach = new BTT3();
            sach.Nhap();
            sach.Xuat();
            System.out.println("\n--- KET QUA TINH TOAN ---");
            System.out.println("Thanh tien = " + sach.thanhTien());
            System.out.println("Phi van chuyen = " + sach.phiVanChuyen());
            System.out.println("Tong tien nhap = " + sach.tongTienNhap());
        }
}