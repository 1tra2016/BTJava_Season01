import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        float width = scan.nextFloat();
        System.out.println("Nhập chiều cao:");
        float height = scan.nextFloat();
        float area = width * height;
        float perimeter = 2 * (width + height);

        System.out.printf("Diện tích: %.2f\nChu vi: %.2f",area, perimeter);
    }
}