package pojo;

import java.time.LocalDate;

public class Merchant {
    private int id;
    private String name;
    private String username;
    private String password;
    private int status;
    private int unfinishedOrder;
    private int completedOrder;
    private int cancelledOrder;
    private int score;
    private LocalDate createDate;
    private LocalDate updateDate;

    public Merchant() {
    }

    public Merchant(int id, String name, String username, String password, int status, int unfinishedOrder, int completedOrder, int cancelledOrder, int score, LocalDate createDate, LocalDate updateDate) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.status = status;
        this.unfinishedOrder = unfinishedOrder;
        this.completedOrder = completedOrder;
        this.cancelledOrder = cancelledOrder;
        this.score = score;
        this.createDate = createDate;
        this.updateDate = updateDate;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUnfinishedOrder() {
        return unfinishedOrder;
    }

    public void setUnfinishedOrder(int unfinishedOrder) {
        this.unfinishedOrder = unfinishedOrder;
    }

    public int getCompletedOrder() {
        return completedOrder;
    }

    public void setCompletedOrder(int completedOrder) {
        this.completedOrder = completedOrder;
    }

    public int getCancelledOrder() {
        return cancelledOrder;
    }

    public void setCancelledOrder(int cancelledOrder) {
        this.cancelledOrder = cancelledOrder;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "merchant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", unfinishedOrder=" + unfinishedOrder +
                ", completedOrder=" + completedOrder +
                ", cancelledOrder=" + cancelledOrder +
                ", score=" + score +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
