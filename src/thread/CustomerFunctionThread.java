package thread;

import util.Console;

import java.util.Scanner;

public class CustomerFunctionThread implements Runnable {
    @Override
    public void run() {
        System.out.println("\n" + "这里是顾客功能页面:");
        Console.console_customer_functions();
        Scanner scanner = new Scanner(System.in);
        int customerFunctionChoice = 0;


        while ((customerFunctionChoice = scanner.nextInt()) != 5) {
            switch (customerFunctionChoice) {
                case 1:
                    break;
                case 2:
                    CustomerSearchMerchantThread customerSearchMerchant = new CustomerSearchMerchantThread();
                    Thread customerSearchMerchantThread = new Thread(customerSearchMerchant);
                    customerSearchMerchantThread.start();

                    try {
                        customerSearchMerchantThread.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }


            Console.console_customer_functions();
        }

    }
}
