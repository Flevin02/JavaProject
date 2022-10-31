package cn.tedu.Personal.Test;

public class Good {

    //属性
    private String id;
    private String name;
    private double prize;
    private int inventory;


    public Good() {
    }

    public Good(String id, String name, double prize, int inventory) {
        this.id = id;
        this.name = name;
        this.prize = prize;
        this.inventory = inventory;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return prize
     */
    public double getPrize() {
        return prize;
    }

    /**
     * 设置
     * @param prize
     */
    public void setPrize(double prize) {
        this.prize = prize;
    }

    /**
     * 获取
     * @return inventory
     */
    public int getInventory() {
        return inventory;
    }

    /**
     * 设置
     * @param inventory
     */
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

}
