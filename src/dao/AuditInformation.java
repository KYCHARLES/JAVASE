package dao;

import pojo.Merchant;

public interface AuditInformation {
    public boolean AuditMerchant(int merchantId);
    public boolean AuditDish(int dishId);
}
