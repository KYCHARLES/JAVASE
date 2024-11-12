import thread.CustomerThread;
import thread.MerchantThread;
import util.Console;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Console.console();
        Scanner sc = new Scanner(System.in);

        int consoleChoice;
        while ((consoleChoice = sc.nextInt()) != 4) {
            switch (consoleChoice) {
                case 1:
                    CustomerThread customerThread = new CustomerThread();
                    Thread thread = new Thread(customerThread);
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                       e.printStackTrace();
                    }
                    break;
                case 2:
                    MerchantThread merchantThread = new MerchantThread();
                    Thread thread2 = new Thread(merchantThread);
                    thread2.start();
                    try {
                        thread2.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }
            Console.console();

        }
    }
}