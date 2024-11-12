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

    @Override
    public List<Merchant> getMerchantUnaudited() {
        GetInformationImpl getInformation = new GetInformationImpl();
        List<Merchant> merchantList = getInformation.getMerchantUnaudited();
        if (merchantList != null) {
            for (int i = 0; i < merchantList.size(); i++) {
                System.out.println(i + " " + merchantList.get(i));
            }
        }else
            System.out.println("没有相关信息!");
        return merchantList;
    }
}
