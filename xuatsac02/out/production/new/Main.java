import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vận tốc (km):");
        float v = scan.nextFloat();
        System.out.println("Nhập thời gian (h):");
        float t = scan.nextFloat();

        System.out.printf( v >=0 && t>=0 ? "Quãng đường đi được: %.2f" : "Có giá trị âm" , v*t);
    }
}