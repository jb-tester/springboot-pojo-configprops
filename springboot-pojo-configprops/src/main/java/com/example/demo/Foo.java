package com.example.demo;

import java.util.List;
import java.util.Map;

/**
 * *
 * <p>Created by Irina on 6/25/2024.</p>
 * *
 */
public class Foo {
    String fooProp1;
    List<String> fooListProp;
    Map<String, String> fooMapProp;

    public String getFooProp1() {
        return fooProp1;
    }

    public void setFooProp1(String fooProp1) {
        this.fooProp1 = fooProp1;
    }

    public List<String> getFooListProp() {
        return fooListProp;
    }

    public void setFooListProp(List<String> fooListProp) {
        this.fooListProp = fooListProp;
    }

    public Map<String, String> getFooMapProp() {
        return fooMapProp;
    }

    public void setFooMapProp(Map<String, String> fooMapProp) {
        this.fooMapProp = fooMapProp;
    }
}
