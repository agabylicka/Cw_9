import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Choose Your operation: add, subtract, divide or multiply. If You want quit, please write: exit ");
            input = scanner.nextLine();
            if (input.equals("add")) {
                System.out.println("Give Your first number:");
                int first = Integer.parseInt(scanner.nextLine());
                System.out.println("Give Your second number:");
                int second = Integer.parseInt(scanner.nextLine());
                int result = add(first, second);
                System.out.println(result);
            } else if (input.equals("subtract")) {
                System.out.println("Give Your first number:");
                int first = Integer.parseInt(scanner.nextLine());
                System.out.println("Give Your second number:");
                int second = Integer.parseInt(scanner.nextLine());
                int result = subtract(first, second);
                System.out.println(result);
            } else if (input.equals("divide")) {
                System.out.println("Give Your first number:");
                int first = Integer.parseInt(scanner.nextLine());
                System.out.println("Give Your second number:");
                int second = Integer.parseInt(scanner.nextLine());
                int result = divide(first, second);
                System.out.println(result);

            } else if (input.equals("multiply")) {
                System.out.println("Give Your first number:");
                int first = Integer.parseInt(scanner.nextLine());
                System.out.println("Give Your second number:");
                int second = Integer.parseInt(scanner.nextLine());
                int result = multiply(first, second);
                System.out.println(result);

            } else if (input.equals("exit")) {
                System.exit(0);

            } else {
                System.out.println("Give proper answer");
            }
        } while (input.equals("add") || input.equals("subtract") || input.equals("divide") || input.equals("multiply"));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int divide(int a, int b) {
        if ((a != 0) && (b != 0)) {
            return a / b;
        } else {
            System.out.println("It is not possible divide by 0");
            System.exit(0);
        }
        return 0;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }
}
