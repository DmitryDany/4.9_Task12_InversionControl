import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;

        System.out.println("Введите число а");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        System.out.println("Введите число b");
        b = scanner.nextDouble();
        String c = "Результат";

        Calculator colculator = new Calculator(new Adder());
        colculator.calc(c, a, b);

        colculator = new Calculator(new Subtractor());
        colculator.calc(c, a, b);

        colculator = new Calculator(new Multiplier());
        colculator.calc(c, a, b);

        colculator = new Calculator(new Divider());
        colculator.calc(c, a, b);
    }
}
