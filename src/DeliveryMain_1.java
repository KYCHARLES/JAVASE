import thread.delivery.DeliveryThread;

public class DeliveryMain_1 {
    public static void main(String[] args) {
        DeliveryThread delivery = new DeliveryThread();
        Thread deliveryThread = new Thread(delivery);
        deliveryThread.start();
        try {
            deliveryThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
