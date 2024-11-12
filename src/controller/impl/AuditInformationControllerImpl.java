package controller.impl;

import controller.AuditInformationController;
import server.impl.AudiInformationServerImpl;

public class AuditInformationControllerImpl implements AuditInformationController {
    @Override
    public void AuditMerchant(int merchantId) {
        AudiInformationServerImpl audiInformationServer = new AudiInformationServerImpl();
        audiInformationServer.auditMerchant(merchantId);
    }
}
