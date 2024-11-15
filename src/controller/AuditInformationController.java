package controller;

public interface AuditInformationController {
    public void auditMerchant(int merchantId);

    public void auditDish(int dishId);

    public void auditDelivery(int deliveryId);
}
