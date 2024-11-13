package server.impl;

import dao.GetInformation;
import dao.impl.GetInformationImpl;
import pojo.Dish;
import pojo.Merchant;
import pojo.MerchantView;
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

    @Override
    public List<MerchantView> getAllMerchantView(String merchantName) {
        GetInformationImpl getInformation = new GetInformationImpl();
        List<MerchantView> merchantViewList = getInformation.getAllMerchantView(merchantName);
        if (merchantViewList != null) {
            for (int i = 0; i < merchantViewList.size(); i++) {
                System.out.println(i + " " + merchantViewList.get(i));
            }
        }else
            System.out.println("搜索异常,请重新尝试!");
        return merchantViewList;
    }

    @Override
    public List<Dish> getDishUnaudited() {
        GetInformationImpl getInformation = new GetInformationImpl();
        List<Dish> dishList = getInformation.getDishUnaudited();
        if (dishList != null) {
            for (int i = 0; i < dishList.size(); i++) {
                System.out.println(i + " " + dishList.get(i));
            }
        }else
            System.out.println("没有相关信息!");
        return dishList;
    }
}
