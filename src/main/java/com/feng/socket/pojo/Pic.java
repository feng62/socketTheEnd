package com.feng.socket.pojo;

public class Pic {
    String name;
    Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pic{" +
                "value='" + value + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
