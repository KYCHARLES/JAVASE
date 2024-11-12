package server.impl;

import dao.GetInformation;
import dao.impl.GetInformationImpl;
import pojo.Merchant;
import server.GetInformationServer;

import java.util.List;

public class GetInformationServerImpl implements GetInformationServer {
    @Override
    public void getAllMerchant() {
        GetInformation getInformation = new GetInformationImpl();

        List<Merchant> merchantList = getInformation.getAllMerchant();
        if (merchantList != null) {
            for (Merchant merchant : merchantList) {
                System.out.println(merchant);
            }
        }else
            System.out.println("没有相关信息!");
    }
}
