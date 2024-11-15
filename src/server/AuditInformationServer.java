package server;

import pojo.Merchant;

public interface AuditInformationServer {
    public void auditMerchant(int merchantId);

    public void auditDish(int dishId);

    public void auditDelivery(int deliveryId);
}
