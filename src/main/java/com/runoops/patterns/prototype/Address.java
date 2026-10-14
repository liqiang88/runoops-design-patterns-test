package com.runoops.patterns.prototype;

/**
 * 引用类型成员：地址
 * 参考：https://runoops.com/design-patterns-prototype.html
 */
public class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
