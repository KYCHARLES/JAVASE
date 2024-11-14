package server.impl;

import dao.impl.MerchantStatusImpl;
import server.MerchantStatusServer;

public class MerchantStatusServerImpl implements MerchantStatusServer {
    MerchantStatusImpl merchantStatus =  new MerchantStatusImpl();
    @Override
    public void merchantBusiness(int merchantId) {
        merchantStatus.merchantBusiness(merchantId);
    }

    @Override
    public void merchantRest(int merchantId) {
        merchantStatus.merchantRest(merchantId);
    }
}
