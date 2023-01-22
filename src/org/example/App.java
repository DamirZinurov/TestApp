package org.example;

import org.example.manager.AppManager;
import org.example.manager.AppManager2Impl;

public class App {
    public static void main(String[] args) {
        AppManager appManager = new AppManager2Impl();
        appManager.runCalculator();
    }
}
