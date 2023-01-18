package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        int firstValue = 0;
        int secondValue = 0;
        // Это + - . *
        String command = null;

        while (running) {
            firstValue = getValue(scanner, firstValue, "Введите первое значение: ");
            secondValue = getValue(scanner, secondValue, "Введите второе значение: ");
            command = getCommand(scanner, command);
            int result = getResult(firstValue, secondValue, command);
            printExpression(firstValue, secondValue, command, result);
            String inputString = getCommandToContinue(scanner);
            running = checkInputValue(inputString);
        }
    }

    private static int getValue(Scanner scanner, int value, String s) {
        System.out.print(s);
        if (scanner.hasNext()) {
            String inputValue = scanner.nextLine();
            value = Integer.parseInt(inputValue);
        }
        return value;
    }

    private static String getCommand(Scanner scanner, String command) {
        System.out.print("Введите бинарный оператор ( +  -  /  * ): ");
        if (scanner.hasNext()) {
            command = scanner.nextLine();
        }
        return command;
    }

    private static int getResult(int firstValue, int secondValue, String command) {
        int result = 0;
        if ("+".equals(command)) result = firstValue + secondValue;
        if ("-".equals(command)) result = firstValue - secondValue;
        if ("/".equals(command)) result = firstValue / secondValue;
        if ("*".equals(command)) result = firstValue * secondValue;
        return result;
    }

    private static void printExpression(int firstValue, int secondValue, String command, int result) {
        System.out.println("Полученное выражение: " + firstValue + " " + command + " " + secondValue + " = " + result);
        System.out.println();

        System.out.println("Продолжить? (y)");
    }

    private static String getCommandToContinue(Scanner scanner) {
        String inputString = "";
        if (scanner.hasNext()) {
            inputString = scanner.nextLine();
        }
        return inputString;
    }

    private static boolean checkInputValue(String inputString) {
        return "y".equals(inputString.toLowerCase());
    }
}
