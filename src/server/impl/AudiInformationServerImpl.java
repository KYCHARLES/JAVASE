package server.impl;

import dao.impl.AuditInformationImpl;
import server.AuditInformationServer;

public class AudiInformationServerImpl implements AuditInformationServer {
    @Override
    public void auditMerchant(int merchantId) {
        AuditInformationImpl auditInformation = new AuditInformationImpl();
        boolean resultAuditMerchant = auditInformation.AuditMerchant(merchantId);
        if (resultAuditMerchant) {
            System.out.println("审核成功!");
        }else
            System.out.println("审核失败!");
    }
}
