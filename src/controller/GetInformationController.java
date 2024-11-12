package controller;

import pojo.Merchant;

import java.util.List;

public interface GetInformationController {
    public void GrtAllMerchant();
    public List<Merchant> getMerchantUnaudited();
}
