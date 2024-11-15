package server;

public interface AddressManageServer {
    public void addAddress(int customerId,String recipient, String phoneNumber, String location);

    public void updateAddress(int addressId, String recipient, String phoneNumber, String location);

    public void deleteAddress(int addressId);
}
