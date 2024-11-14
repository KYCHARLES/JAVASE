package controller.impl;

import controller.AuditInformationController;
import server.impl.AudiInformationServerImpl;

public class AuditInformationControllerImpl implements AuditInformationController {
    AudiInformationServerImpl audiInformationServer = new AudiInformationServerImpl();
    @Override
    public void AuditMerchant(int merchantId) {

        audiInformationServer.auditMerchant(merchantId);
    }

    @Override
    public void AuditDish(int dishId) {

        audiInformationServer.auditDish(dishId);
    }

    @Override
    public void AuditDelivery(int deliveryId) {
        audiInformationServer.auditDelivery(deliveryId);
    }
}
