package controller.impl;

import controller.GetInformationController;
import server.GetInformationServer;
import server.impl.GetInformationServerImpl;

public class GetInformationControllerImpl implements GetInformationController {

    @Override
    public void GrtAllMerchant() {
        System.out.println("\"--------------------所有的商家信息--------------------\"");
        GetInformationServer getInformationServer = new GetInformationServerImpl();
        getInformationServer.getAllMerchant();
    }
}
