package server.impl;

import dao.impl.AuditInformationImpl;
import server.AuditInformationServer;

public class AudiInformationServerImpl implements AuditInformationServer {
    AuditInformationImpl auditInformation = new AuditInformationImpl();
    @Override
    public void auditMerchant(int merchantId) {
        boolean resultAuditMerchant = auditInformation.AuditMerchant(merchantId);
        if (resultAuditMerchant) {
            System.out.println("审核成功!");
        }else
            System.out.println("审核失败!");
    }

    @Override
    public void auditDish(int dishId) {
        boolean resultAuditDish = auditInformation.AuditDish(dishId);
        if (resultAuditDish) {
            System.out.println("审核成功!");
        }else
            System.out.println("审核失败!");
    }

    @Override
    public void auditDelivery(int deliveryId) {
        boolean resultAuditDelivery = auditInformation.AuditDelivery(deliveryId);
        if (resultAuditDelivery) {
            System.out.println("审核成功!");
        }else
            System.out.println("审核失败!");
    }
}
