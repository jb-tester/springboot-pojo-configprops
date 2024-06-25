package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@ConfigurationProperties("my.props")
public class MyProps {

  //  @NestedConfigurationProperty // annotation is required here
    Foo foo;
    //  annotation is not required for collection of external pojos:
    List<Foo> foolist;
    //  annotation is not required for the inner class
    InnerFoo innerfoo;


    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public List<Foo> getFoolist() {
        return foolist;
    }

    public void setFoolist(List<Foo> foolist) {
        this.foolist = foolist;
    }

    public InnerFoo getInnerfoo() {
        return innerfoo;
    }

    public void setInnerfoo(InnerFoo innerfoo) {
        this.innerfoo = innerfoo;
    }

    public static class InnerFoo{
        String buzz;

        public String getBuzz() {
            return buzz;
        }

        public void setBuzz(String buzz) {
            this.buzz = buzz;
        }
    }
}
