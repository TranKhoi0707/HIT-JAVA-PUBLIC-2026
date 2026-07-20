import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thong tin nhan vien: ");
        String input = scanner.nextLine().trim();
        String[] parts = input.split("-");
        String ma = parts[0].trim().toUpperCase();
        String ten = parts[1].trim().toLowerCase();
        String namSinh = parts[2].trim();
        String phongBan = parts[3].trim();
        String[] words = ten.split("\\s+");
        String hoTen = "";
        for (String word : words) {
            hoTen += word.substring(0, 1).toUpperCase();
            hoTen += word.substring(1);
            hoTen += " ";
        }
        hoTen = hoTen.trim();
        int tuoi = 2026 - Integer.parseInt(namSinh);
        String pb = phongBan.toLowerCase();
        if (pb.contains("kỹ thuật") || pb.contains("ky thuat")) {
            System.out.println("Phan loai: Nhan vien ky thuat");
        } else {
            System.out.println("Phan loai: Nhan vien nghiep vu");
        }
        System.out.println("Ma nhan vien: " + ma
                + " | Ho va ten: " + hoTen
                + " | Tuoi: " + tuoi
                + " | Bo phan: " + phongBan);
    }
}