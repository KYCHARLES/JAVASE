package controller.impl;

import controller.GetInformationController;
import pojo.Merchant;
import server.GetInformationServer;
import server.impl.GetInformationServerImpl;

import java.util.List;

public class GetInformationControllerImpl implements GetInformationController {

    @Override
    public void GrtAllMerchant() {
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
}
