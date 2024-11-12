package server;

import pojo.Merchant;

import java.util.List;

public interface GetInformationServer {
    public void getAllMerchant();
    public List<Merchant> getMerchantUnaudited();
}
