
import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    protected String maSach;
    protected int ngay, thang, nam;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public void Nhap(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ngay nhap: ");
        ngay = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap thang nhap: ");
        thang = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap nam nhap: ");
        nam = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
    }

    public void inthongtinsach() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ngay nhap: " + ngay + "/" + thang + "/" + nam);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
    }

    public double ThanhTien() {return soLuong * donGia;}
}

// lop SachGiaoKhoa ke thua Sach
class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("Nhap tinh trang sach (moi/cu): ");
        tinhTrang = sc.nextLine();
    }

    @Override
    public void inthongtinsach() {
        super.inthongtinsach();
        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + ThanhTien());
    }

    @Override
    public double ThanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {return soLuong * donGia;} 
        else {return soLuong * donGia * 0.5;}
    }
}

class SachThamKhao extends Sach {
    private double thue;

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("Nhap thue: ");
        thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void inthongtinsach() {
        super.inthongtinsach();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + ThanhTien());
    }

    @Override
    public double ThanhTien() {return soLuong * donGia + thue;}
}

public class BTT9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SachGiaoKhoa> dsSachGiaoKhoa = new ArrayList<>();
        ArrayList<SachThamKhao> dsSachThamKhao = new ArrayList<>();
        int n, m;
        System.out.print("\n Nhap so sach giao khoa: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n Nhap sach giao khoa thu: " + (i + 1));
            SachGiaoKhoa sgk = new SachGiaoKhoa();
            sgk.Nhap(sc);
            dsSachGiaoKhoa.add(sgk);
        }

        System.out.print("\n Nhap so sach tham khao: ");
        m = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < m; i++) {
            System.out.println("\n Nhap sach tham khao thu " + (i + 1));
            SachThamKhao stk = new SachThamKhao();
            stk.Nhap(sc);
            dsSachThamKhao.add(stk);
        }

        System.out.println("\n DANH SACH SACH GIAO KHOA ");
        for (SachGiaoKhoa sgk : dsSachGiaoKhoa) {
            sgk.inthongtinsach();
            System.out.println("--------------------");
        }

        System.out.println("\n DANH SACH SACH THAM KHAO ");
        for (SachThamKhao stk : dsSachThamKhao) {
            stk.inthongtinsach();
            System.out.println("--------------------");
        }

        double tongSGK = 0;
        for (SachGiaoKhoa sgk : dsSachGiaoKhoa) {tongSGK += sgk.ThanhTien();}

        double tongSTK = 0;
        for (SachThamKhao stk : dsSachThamKhao) {tongSTK += stk.ThanhTien();}

        System.out.println("\nTong thanh tien sach giao khoa: " + tongSGK);
        System.out.println("Tong thanh tien sach tham khao: " + tongSTK);

        double tongDonGia = 0;
        for (SachThamKhao stk : dsSachThamKhao) {tongDonGia += stk.donGia;}

        if (m > 0) {
            System.out.println("Trung binh don gia sach tham khao: " + (tongDonGia / m));} 
            else {System.out.println("Khong co sach tham khao.");}

        System.out.println("\n SACH GIAO KHOA CUA NHA XUAT BAN X ");
        for (SachGiaoKhoa sgk : dsSachGiaoKhoa) {
            if (sgk.nhaXuatBan.equalsIgnoreCase("X")) {
                sgk.inthongtinsach();
                System.out.println("--------------------");
            }
        }
        sc.close();
    }
}
