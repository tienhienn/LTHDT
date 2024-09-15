import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien gui: ");
        double tiengui = sc.nextDouble();
        System.out.print("Nhap lai suat hang nam (%): ");
        double lai = sc.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int thang = sc.nextInt();
        double tienlai = tiengui * lai/100 * 1/12 * thang;
        double tiencuoiky = tienlai + tiengui;
        System.out.println("So tien lai la: " +tienlai +" VNĐ" );
        System.out.println("So tien cuoi ky nhan duoc la: " +tiencuoiky +" VNĐ" );
    }
}
