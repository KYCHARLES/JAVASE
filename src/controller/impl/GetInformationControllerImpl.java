package controller.impl;

import controller.GetInformationController;
import pojo.Merchant;
import pojo.MerchantView;
import server.GetInformationServer;
import server.impl.GetInformationServerImpl;

import java.util.List;

public class GetInformationControllerImpl implements GetInformationController {

    @Override
    public void getAllMerchant() {
        System.out.println("\"--------------------所有的商家信息--------------------\"");
        GetInformationServer getInformationServer = new GetInformationServerImpl();
        getInformationServer.getAllMerchant();
    }

    @Override
    public List<Merchant> getMerchantUnaudited() {
        System.out.println("\"--------------------所有未审核的商家信息--------------------\"");
        GetInformationServer getInformationServer = new GetInformationServerImpl();
        return getInformationServer.getMerchantUnaudited();
    }

    @Override
    public List<MerchantView> getAllMerchantView(String merchantName) {
        System.out.println("\"--------------------所有的商家信息--------------------\"");
        GetInformationServer getInformationServer = new GetInformationServerImpl();
        return getInformationServer.getAllMerchantView(merchantName);
    }
}
