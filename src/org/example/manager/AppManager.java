package org.example.manager;

import org.example.evaluator.Evaluator;
import org.example.printer.ConsolePrinter;
import org.example.validator.IOValidator;

import java.util.Scanner;

public class AppManager {
    private final ConsolePrinter printer = new ConsolePrinter();
    private final Scanner scanner = new Scanner(System.in);
    private final IOValidator checker = new IOValidator();
    private final Evaluator evaluator = new Evaluator();
    private int firstValue;
    private int secondValue;
    private String command;

    private void inputFirstValue() {
        printer.printInputFirstValue();
        String inputValue = scanner.nextLine();
        checker.checkInputValue(inputValue);
        firstValue = evaluator.parseInteger(inputValue);
    }

    private void inputSecondValue() {
        printer.printInputSecondValue();
        String inputValue = scanner.nextLine();
        checker.checkInputValue(inputValue);
        secondValue = evaluator.parseInteger(inputValue);
    }

    private void inputCommand() {
        printer.printInputCommand();
        command = scanner.nextLine();
        checker.checkInputValue(command);
    }

    private void outputResult() {
        int result = evaluator.getResult(firstValue, secondValue, command);
        printer.printExpression(firstValue, secondValue, command, result);
    }

    public void runCalculator() {
        while (true) {
            try {
                inputFirstValue();
                inputSecondValue();
                inputCommand();
                outputResult();
            } catch (Exception e) {
                System.out.println("¬вели неправильные данные");
            }
        }
    }
}
