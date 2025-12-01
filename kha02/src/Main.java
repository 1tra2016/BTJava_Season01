import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất:");
        int firstNumber = scan.nextInt();
        System.out.println("Nhập số thứ hai:");
        int secondNumber = scan.nextInt();

        System.out.println("---Kết quả---");
        System.out.printf("firstNumber =  %d\n", firstNumber);
        System.out.printf("secondNumber =  %d\n", secondNumber);
        System.out.printf("Tổng =  %d\n", firstNumber+secondNumber);
        System.out.printf("Hiệu =  %d\n", firstNumber-secondNumber);
        System.out.printf("Tích =  %d\n", firstNumber*secondNumber);
        System.out.printf("Thương =  %d\n", firstNumber/secondNumber);
        System.out.printf("Phần dư =  %d\n", firstNumber%secondNumber);
    }
}