package controller.impl;

import controller.MerchantStatusController;
import server.impl.MerchantStatusServerImpl;

public class MerchantStatusControllerImpl implements MerchantStatusController {
    MerchantStatusServerImpl merchantStatusServer = new MerchantStatusServerImpl();
    @Override
    public void merchantBusiness(int merchantId) {
        merchantStatusServer.merchantBusiness(merchantId);
    }

    @Override
    public void merchantRest(int merchantId) {
        merchantStatusServer.merchantRest(merchantId);
    }
}
