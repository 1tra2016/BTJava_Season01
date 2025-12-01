import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập cân nặng (kg):");
        float m = scan.nextFloat();
        System.out.println("Nhập chiều cao (m):");
        float l = scan.nextFloat();

        System.out.printf( m >=0 && l>=0 ? "BMI: %.2f " : "Có giá trị âm" , m/(l*l));
    }
}