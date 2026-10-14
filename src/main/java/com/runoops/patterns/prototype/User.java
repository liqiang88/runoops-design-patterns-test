package com.runoops.patterns.prototype;

/**
 * 具体原型：浅拷贝（Object.clone 默认行为）
 * 基本类型会复制，引用类型只复制引用，仍指向同一对象。
 */
public class User implements Cloneable {
    private String username;
    private int age;
    private Address address;

    public User(String username, int age, Address address) {
        this.username = username;
        this.age = age;
        this.address = address;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
