package org.example.evaluator;

public class Evaluator {
    public int parseInteger(String inputValue) {
        return Integer.parseInt(inputValue);
    }

    public int getResult(int firstValue, int secondValue, String command) {
        int result = 0;
        if ("+".equals(command)) result = firstValue + secondValue;
        if ("-".equals(command)) result = firstValue - secondValue;
        if ("/".equals(command)) result = firstValue / secondValue;
        if ("*".equals(command)) result = firstValue * secondValue;
        if ("**".equals(command)) result = (int) Math.pow(firstValue, secondValue);
        return result;
    }
}
