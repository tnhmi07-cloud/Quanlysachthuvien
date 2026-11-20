
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n===== QUAN LY SACH THU VIEN =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String maSach = sc.nextLine();

                    System.out.print("Nhap tieu de: ");
                    String tieuDe = sc.nextLine();

                    System.out.print("Nhap tac gia: ");
                    String tacGia = sc.nextLine();

                    System.out.print("Nhap nam xuat ban: ");
                    int namXuatBan = sc.nextInt();

                    System.out.print("Nhap so luong: ");
                    int soLuong = sc.nextInt();
                    sc.nextLine();

                    Sach s = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
                    danhSachSach.add(s);

                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    System.out.println("\n===== DANH SACH SACH =====");

                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach rong!");
                    } else {
                        for (Sach sach : danhSachSach) {
                            sach.hienThiThongTin();
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 3);

        sc.close();
    }
}
