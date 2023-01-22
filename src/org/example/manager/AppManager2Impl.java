package org.example.manager;

import org.example.printer.ConsolePrinter;
import org.example.validator.IOValidator;

import java.util.Scanner;

/**
 * @author PaxaH
 */
public class AppManager2Impl implements AppManager {
    private final ConsolePrinter printer = new ConsolePrinter();
    private final Scanner scanner = new Scanner(System.in);
    private final IOValidator checker = new IOValidator();
    private int firstValue;
    private int secondValue;

    @Override
    public void runCalculator() { // Сделать рефакторинг!!!!!!!!!!!!!!!!!
        while (true) {
            try {
                printer.printInputExpression();
                String inputExpression = scanner.nextLine();
                checker.checkInputValue(inputExpression);

                if (inputExpression.contains("+")) {
                    String[] values = inputExpression.split("\\+");
                    if (values.length == 2) {
                        firstValue = Integer.parseInt(values[0]);
                        secondValue = Integer.parseInt(values[1]);
                    }

                    System.out.println("Результат: " + firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
                }

                if (inputExpression.contains("-")) {
                    String[] values = inputExpression.split("-");
                    if (values.length == 2) {
                        firstValue = Integer.parseInt(values[0]);
                        secondValue = Integer.parseInt(values[1]);
                    }

                    System.out.println("Результат: " + firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
                }

                if (inputExpression.contains("*")) {
                    String[] values = inputExpression.split("\\*");
                    if (values.length == 2) {
                        firstValue = Integer.parseInt(values[0]);
                        secondValue = Integer.parseInt(values[1]);
                    }

                    System.out.println("Результат: " + firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
                }

                if (inputExpression.contains("/")) {
                    String[] values = inputExpression.split("/");
                    if (values.length == 2) {
                        firstValue = Integer.parseInt(values[0]);
                        secondValue = Integer.parseInt(values[1]);
                    }

                    System.out.println("Результат: " + firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
                }

            } catch (Exception e) {
                printer.printGeneralExceptionMessage();
            }
        }
    }
}
