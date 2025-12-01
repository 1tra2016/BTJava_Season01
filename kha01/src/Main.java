import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập bán kính:");
        float r = scan.nextFloat();

        final float PI = 3.14f;
        float A = r*PI*r;

        System.out.printf("Diện tích: %.2f",A);
    }
}