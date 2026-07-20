//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap gia tri cua a: ");
    double a = Double.parseDouble(scanner.nextLine());

    System.out.print("Nhap gia tri cua b: ");
    double b = Double.parseDouble(scanner.nextLine());

    System.out.print("Nhap gia tri cua c: ");
    double c = Double.parseDouble(scanner.nextLine());

    if (a + b > c && a + c > b && b + c > a) {

        double cv = a + b + c;
        double p = cv / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        if (a == b && b == c) {
            System.out.println("Day la tam giac deu");
        } else if (a == b || a == c || b == c) {
            System.out.println("Day la tam giac can");
        } else {
            System.out.println("Day la tam giac thuong");
        }

        System.out.printf("Chu vi cua tam giac ABC la: %.2f%n", cv);
        System.out.printf("Dien tich cua tam giac ABC la: %.2f%n", s);
    } else {
        System.out.println("Gia tri cua a, b, c khong tao thanh mot tam giac.");
    }

    scanner.close();
}
