package com.example.demo;


import org.springframework.boot.context.properties.NestedConfigurationProperty;

public class Buzz {

    @NestedConfigurationProperty
    Boo boo;
    String buzzProp;

    public Boo getBoo() {
        return boo;
    }

    public void setBoo(Boo boo) {
        this.boo = boo;
    }

    public String getBuzzProp() {
        return buzzProp;
    }
// has gutter:
    public void setBuzzProp(String buzzProp) {
        this.buzzProp = buzzProp;
    }
}
