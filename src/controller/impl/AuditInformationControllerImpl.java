package controller.impl;

import controller.AuditInformationController;
import server.impl.AudiInformationServerImpl;

public class AuditInformationControllerImpl implements AuditInformationController {
    AudiInformationServerImpl audiInformationServer = new AudiInformationServerImpl();
    @Override
    public void auditMerchant(int merchantId) {

        audiInformationServer.auditMerchant(merchantId);
    }

    @Override
    public void auditDish(int dishId) {

        audiInformationServer.auditDish(dishId);
    }

    @Override
    public void auditDelivery(int deliveryId) {
        audiInformationServer.auditDelivery(deliveryId);
    }
}
