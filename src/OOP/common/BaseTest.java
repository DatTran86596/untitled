package OOP.common;

import java.util.Scanner;

public class BaseTest extends Constants{
    public static Scanner scanner = new Scanner(System.in);
    public void closeDriver() {
        System.out.printf("Moi nhap browser: ");
        browser = scanner.next();
        String Closedbrowser = "anhtester";
        System.out.println("Closedbrowser: "+ Closedbrowser);
        System.out.println("Browser: "+browser);
    }
    public void createDriver() {
        super.get();
    }
}
