package thread;

import controller.GetInformationController;
import controller.impl.GetInformationControllerImpl;
import util.Console;

import java.util.Scanner;

public class ManagerFunctionThread implements Runnable {
    @Override
    public void run() {
        Console.console_manager_functions();
        Scanner scanner = new Scanner(System.in);
        int managerFunctionChoice = 0;
        while ((managerFunctionChoice = scanner.nextInt()) != 8) {
            switch (managerFunctionChoice) {
                case 1:
                    GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
                    getInformationController.GrtAllMerchant();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }

            Console.console_manager_functions();

        }
    }
}
