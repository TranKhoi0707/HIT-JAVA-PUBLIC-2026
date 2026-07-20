//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap mat khau: ");
    String Mk = scanner.nextLine();
    Mk = Mk.trim();
    boolean doDai = Mk.length()>=8;
    boolean coSo = false;
    boolean inHoa = false;
    for (int i =0; i<Mk.length(); i++) {
        char c = Mk.charAt(i);
        if (c >= '0' && c <= '9') {
            coSo = true;
        }
        if (c >= 'A' && c <= 'Z') {
            inHoa = true;
        }
    }
    if(doDai&&coSo&&inHoa) {
        System.out.println("Mat khau hop le");
    } else {
        System.out.println("Mat khau khong hop le");
        if (!doDai) {
            System.out.println("- Mat khau phai co it nhat la 8 ky tu");
        }
        if (!coSo) {
            System.out.println("- Mat khau phai co it nhat 1 chu so.");
        }

        if (!inHoa) {
            System.out.println("- Mat khau phai co it nhat 1 chu cai viet hoa.");
        }
    }
}
