package thread.customer.Function;

import controller.impl.GetInformationControllerImpl;
import pojo.Address;
import pojo.Customer;
import util.Console;

import java.util.List;
import java.util.Scanner;

public class CustomerFunction  {
    private Customer customer;
    public CustomerFunction(Customer customer) {
        this.customer = customer;
    }

    public void customerFunction() {
        System.out.println("\n" + "这里是顾客功能页面:");
        Console.console_customer_functions();
        Scanner scanner = new Scanner(System.in);
        int customerFunctionChoice = 0;


        while ((customerFunctionChoice = scanner.nextInt()) != 5) {
            switch (customerFunctionChoice) {
                case 1:
                    CustomerViewAddress customerViewAddress = new CustomerViewAddress(customer);
                    customerViewAddress.customerViewAddress();
                    break;
                case 2:
                    CustomerSearchMerchant customerSearchMerchant = new CustomerSearchMerchant();
                    customerSearchMerchant.customerSearchMerchant();
                    break;
                case 3:
                    CustomerSearchDish customerSearchDish = new CustomerSearchDish();
                    customerSearchDish.customerSearchDish();
                    break;
                case 4:
                    break;
            }


            Console.console_customer_functions();
        }

    }
}
