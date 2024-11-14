import thread.customer.CustomerThread;
import thread.manager.ManagerThread;
import thread.merchant.MerchantThread;
import util.Console;

import java.util.Scanner;

public class ManagerMain {
    public static void main(String[] args) {
        ManagerThread manager = new ManagerThread();
        Thread threadManager = new Thread(manager);
        threadManager.start();
        try {
            threadManager.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
