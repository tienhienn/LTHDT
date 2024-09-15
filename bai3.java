import java.awt.*;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a*b;
        double thuong = a*(1.0)/b;
        int chiacodu = a%b;
        System.out.println("Tong = "+tong);
        System.out.println("Hieu = "+hieu);
        System.out.println("Tich = "+tich);
        System.out.println("Thuong = "+thuong);
        System.out.println("Phan du = "+chiacodu);
    }
}
