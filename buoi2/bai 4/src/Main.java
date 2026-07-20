//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    public static double calculateAverage(double[] arr) {
        double Tong=0;
        for (int i=0; i<arr.length;i++) {
            Tong+=arr[i];
        }
        return Tong/arr.length;
    }
    public static int countFailedStudents(double[] arr) {
        int dem=0;
        for(double x:arr) {
            if (x<5.0) {
                dem+=1;
            }
        }
        return dem;
    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap so luong hoc sinh: ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 0);

        double[] diem = new double[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhap diem hoc sinh thu " + (i + 1) + ": ");
                diem[i] = Double.parseDouble(scanner.nextLine());
            } while (diem[i] < 0 || diem[i] > 10);
        }

        double max = findMax(diem);
        double avg = calculateAverage(diem);
        int failed = countFailedStudents(diem);

        System.out.printf("Diem cao nhat: %.2f%n", max);
        System.out.printf("Diem trung binh: %.2f%n", avg);
        System.out.println("So hoc sinh duoi trung binh: " + failed);
    }
}
