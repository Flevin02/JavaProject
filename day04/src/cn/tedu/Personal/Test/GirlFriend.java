package cn.tedu.Personal.Test;

public class GirlFriend {

    private String name;
    private int age;
    private String hobbies;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return hobbies
     */
    public String getHobbies() {
        return hobbies;
    }

    /**
     * 设置
     * @param hobbies
     */
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", hobbies = " + hobbies + "}";
    }
}
