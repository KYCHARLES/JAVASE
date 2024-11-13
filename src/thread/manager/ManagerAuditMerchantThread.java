package thread.manager;

import controller.impl.AuditInformationControllerImpl;
import controller.impl.GetInformationControllerImpl;
import pojo.Merchant;

import java.util.List;
import java.util.Scanner;

public class ManagerAuditMerchantThread implements Runnable {

    public List<Merchant> merchantList;
    public ManagerAuditMerchantThread(List<Merchant> merchantList) {
        this.merchantList = merchantList;
    }
    @Override
    public void run() {
        System.out.println("\n" + "这里是管理员审核商家的功能:");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入确认通过的商家的索引信息(输入-1退出)");
        AuditInformationControllerImpl auditInformationController = new AuditInformationControllerImpl();
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        int merchantChoice = 0;
        while ((merchantChoice = sc.nextInt()) != -1) {
            auditInformationController.AuditMerchant(merchantList.get(merchantChoice).getId());

            merchantList.clear();
            merchantList = getInformationController.getMerchantUnaudited();
            System.out.println("请输入确认通过的商家的索引信息(输入-1退出)");
        }
        System.out.println("退出管理员审核商家的功能!");
    }
}
