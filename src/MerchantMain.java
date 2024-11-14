import thread.customer.CustomerThread;
import thread.manager.ManagerThread;
import thread.merchant.MerchantThread;
import util.Console;

import java.util.Scanner;

public class MerchantMain {
    public static void main(String[] args) {
        MerchantThread merchant = new MerchantThread();
        Thread threadMerchant = new Thread(merchant);
        threadMerchant.start();
        try {
            threadMerchant.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
