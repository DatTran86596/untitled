package OOP.common;

import java.util.Scanner;

public class Constants {
    static String browser = "chrome";
    static boolean report = false;
    static boolean headless = false;

    void set(String browser,boolean report,boolean headless) {
        this.browser = browser;
        this.report = report;
        this.headless = headless;
    }
    void get() {
        System.out.println(browser+" "+report+" "+headless);
    }
}

