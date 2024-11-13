import thread.customer.CustomerThread;
import thread.manager.ManagerThread;
import thread.merchant.MerchantThread;
import util.Console;

import java.util.Scanner;


public class CustomerMain {


    public static void main(String[] args) {
        Console.console();
        Scanner sc = new Scanner(System.in);

        int consoleChoice;
        while ((consoleChoice = sc.nextInt()) != 5) {
            switch (consoleChoice) {
                case 1:
                    CustomerThread customer = new CustomerThread();
                    Thread threadCustomer = new Thread(customer);
                    threadCustomer.start();
                    try {
                        threadCustomer.join();
                    } catch (InterruptedException e) {
                       e.printStackTrace();
                    }
                    break;
                case 2:
                    MerchantThread merchant = new MerchantThread();
                    Thread threadMerchant = new Thread(merchant);
                    threadMerchant.start();
                    try {
                        threadMerchant.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    ManagerThread manager = new ManagerThread();
                    Thread threadManager = new Thread(manager);
                    threadManager.start();
                    try {
                        threadManager.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
            Console.console();

        }
    }
}