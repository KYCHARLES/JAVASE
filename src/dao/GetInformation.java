package dao;

import pojo.Merchant;

import java.util.List;

public interface GetInformation {

    public List<Merchant> getAllMerchant();
    public List<Merchant> getMerchantUnaudited();
}
