import thread.customer.CustomerThread;
import thread.manager.ManagerThread;
import thread.merchant.MerchantThread;
import util.Console;

import java.util.Scanner;


public class CustomerMain {


    public static void main(String[] args) {
        CustomerThread customer = new CustomerThread();
        Thread threadCustomer = new Thread(customer);
        threadCustomer.start();
        try {
            threadCustomer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}