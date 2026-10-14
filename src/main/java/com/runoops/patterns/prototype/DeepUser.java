package com.runoops.patterns.prototype;

/**
 * 具体原型：深拷贝
 * 引用类型单独新建一份，新旧对象完全隔离。
 */
public class DeepUser implements Cloneable {
    private String username;
    private int age;
    private Address address;

    public DeepUser(String username, int age, Address address) {
        this.username = username;
        this.age = age;
        this.address = address;
    }

    @Override
    protected DeepUser clone() throws CloneNotSupportedException {
        DeepUser user = (DeepUser) super.clone();
        // 引用类型单独拷贝
        user.address = new Address(address.getCity());
        return user;
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
        return "DeepUser{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
