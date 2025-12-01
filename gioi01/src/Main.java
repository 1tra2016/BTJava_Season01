import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tử phân số đầu tiên:");
        int tu1 = scan.nextInt();
        System.out.println("Nhập mẫu phân số đầu tiên:");
        int mau1 = scan.nextInt();
        System.out.println("Nhập tử phân số thứ hai:");
        int tu2 = scan.nextInt();
        System.out.println("Nhập tử phân số thứ hai:");
        int mau2 = scan.nextInt();

        int tu = tu1*mau2 + tu2*mau1;
        int mau = mau1*mau2;
        System.out.printf("Kết quả tổng hai mẫu: %d / %d",tu,mau);
    }
}