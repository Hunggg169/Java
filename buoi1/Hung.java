import java.util.Scanner;

public class Hung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        int result = findUCLN(num1, num2);

        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + result);
    }

    public static int findUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
