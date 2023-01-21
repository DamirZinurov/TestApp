package org.example;

import org.example.printer.ConsolePrinter;
import org.example.validator.IOValidator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();
        IOValidator checker = new IOValidator();
        Scanner scanner = new Scanner(System.in);

        int firstValue;
        int secondValue;
        String command;

        while (true){
            try {
                // Ввод первого значения
                printer.printInputFirstValue();
                String inputValue = scanner.nextLine();
                checker.checkInputValue(inputValue);
                firstValue = Integer.parseInt(inputValue);

                // Ввод второго значения
                printer.printInputSecondValue();
                inputValue = scanner.nextLine();
                checker.checkInputValue(inputValue);
                secondValue = Integer.parseInt(inputValue);

                // Ввод оператора
                printer.printInputCommand();
                command = scanner.nextLine();
                checker.checkInputValue(command);

                // Подсчёт и вывод результата
                int result = getResult(firstValue, secondValue, command);
                printer.printExpression(firstValue, secondValue, command, result);
            } catch (Exception e) {
                System.out.println("Ввели неправильные данные");
            }
        }
    }

    private static int getResult(int firstValue, int secondValue, String command) {
        int result = 0;
        if ("+".equals(command)) result = firstValue + secondValue;
        if ("-".equals(command)) result = firstValue - secondValue;
        if ("/".equals(command)) result = firstValue / secondValue;
        if ("*".equals(command)) result = firstValue * secondValue;
        if ("**".equals(command)) result = (int) Math.pow(firstValue, secondValue); // добавил эту строку
        return result;
    }
}
