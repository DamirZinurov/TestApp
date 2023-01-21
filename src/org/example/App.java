package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        int firstValue;
        int secondValue;
        String command;

        while (running) {
            try {
                firstValue = getValue(scanner, "Введите первое значение: ");
                secondValue = getValue(scanner, "Введите второе значение: ");
                command = getCommand(scanner);
                int result = getResult(firstValue, secondValue, command);
                printExpression(firstValue, secondValue, command, result);
                String inputString = scanner.nextLine();
                running = checkInputValue(inputString);
            } catch (Exception e) {
                System.out.println("Ввели неправильные данные");
            }
        }
    }

    private static int getValue(Scanner scanner, String message) {
        System.out.print(message);
        String inputValue = scanner.nextLine();
        return Integer.parseInt(inputValue);
    }

    private static String getCommand(Scanner scanner) {
        System.out.print("Введите оператор ( +  -  /  * ): ");
        return scanner.nextLine();
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
        System.out.println("Для выхода набери: Exit");
    }

    private static boolean checkInputValue(String inputString) {
        return !"Exit".equalsIgnoreCase(inputString);
    }
}
