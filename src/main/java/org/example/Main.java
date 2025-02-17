import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                System.out.print(0); // Выводим 0 как есть
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.print(" fizz");
            } else if (i % 5 == 0) {
                System.out.print(" buzz");
            } else {
                System.out.print(" " + i);
            }
        }

        scanner.close();
    }
}