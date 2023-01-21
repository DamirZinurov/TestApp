package org.example.printer;

public class ConsolePrinter {
    private static final String INPUT_FIRST_VALUE = "Введите первое значение: ";
    private static final String INPUT_SECOND_VALUE = "Введите второе значение: ";
    private static final String INPUT_COMMAND = "Введите оператор ( +,  -,  /,  *, ** ): ";
    private static final String RESULT_EXPRESSION = "Полученное выражение: %s %s %s = %s";

    public void printInputFirstValue() {
        System.out.print(INPUT_FIRST_VALUE);
    }

    public void printInputSecondValue() {
        System.out.print(INPUT_SECOND_VALUE);
    }

    public void printInputCommand() {
        System.out.print(INPUT_COMMAND);
    }

    public void printExpression(int firstValue, int secondValue, String command, int result) {
        System.out.printf(RESULT_EXPRESSION, firstValue, command, secondValue, result);
        System.out.println();
        System.out.println();
    }
}
