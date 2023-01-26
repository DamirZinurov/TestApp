package org.example.manager;

import org.example.evaluator.Evaluator;
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
    private final Evaluator evaluator = new Evaluator();
    private final String[] commands = {"+", "-", "*", "/"};


    private int firstValue;
    private int secondValue;

    @Override
    public void runCalculator() {
        while (true) {
            try {
                printer.printInputExpression();
                String inputExpression = scanner.nextLine();
                checker.checkInputValue(inputExpression);

                for (String command : commands) {
                    if (inputExpression.contains(command)) {
                        String[] values;

                        switch (command) {
                            case ("+"):
                                values = inputExpression.split("\\+");
                                break;
                            case ("*"):
                                values = inputExpression.split("\\*");
                                break;
                            default:
                                values = inputExpression.split(command);
                        }

//                        if ("+".equals(command)) {
//                            values = inputExpression.split("\\+");
//                        } else if ("*".equals(command)) {
//                            values = inputExpression.split("\\*");
//                        } else values = inputExpression.split(command);

                        if (values.length == 2) {
                            firstValue = evaluator.parseInteger(values[0]);
                            secondValue = evaluator.parseInteger(values[1]);
                        }

                        printer.printResultExpression(firstValue, secondValue, command);
                    }
                }
            } catch (Exception e) {
                printer.printGeneralExceptionMessage();
            }
        }
    }
}
