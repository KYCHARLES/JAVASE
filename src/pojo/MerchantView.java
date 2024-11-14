package pojo;

public class MerchantView {
    private int id;
    private String name;
    private int status;

    public MerchantView(int id, String name, int status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public MerchantView() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (getStatus() == 2) {
            return "MerchantView{" +
                    "name='" + name + '\'' +
                    ", 正在营业" +
                    '}';
        }
        else
            return "MerchantView{" +
                    "name='" + name + '\'' +
                    ",  正在休息" +
                    '}';
    }
}
