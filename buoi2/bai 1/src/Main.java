//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap gia tri cua x1, y1: ");
    double x1 = Integer.parseInt(scanner.nextLine());
    double y1 = Integer.parseInt(scanner.nextLine());
    System.out.println("Nhap gia tri cua x2, y2: ");
    double x2 = Integer.parseInt(scanner.nextLine());
    double y2 = Integer.parseInt(scanner.nextLine());
    double kc = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    System.out.printf("Khoang cach giua 2 diem A,B la: %.2f",kc);
}
