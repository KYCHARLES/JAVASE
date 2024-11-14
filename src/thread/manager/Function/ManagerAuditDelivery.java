package thread.manager.Function;

import controller.impl.AuditInformationControllerImpl;
import controller.impl.GetInformationControllerImpl;
import pojo.Delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerAuditDelivery {
    private List<Delivery> deliveryList;
    public ManagerAuditDelivery(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }
    public void managerAuditDelivery() {
        System.out.println("\n" + "这里是管理员审核骑手的动能:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入确认通过审核的骑手的索引信息(输入-1退出)");
        AuditInformationControllerImpl auditInformationController = new AuditInformationControllerImpl();
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        int index = 0;
        while ((index = scanner.nextInt()) != -1){

            auditInformationController.auditDelivery(deliveryList.get(index).getId());
            deliveryList.clear();
            deliveryList = getInformationController.getDeliveryUnaudited();
            System.out.println("请输入确认通过审核的骑手的索引信息(输入-1退出)");
        }
        System.out.println("退出审核骑手信息的功能");
    }
}
