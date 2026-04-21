package com.example.demo;

import com.mytests.spring.LibPojo1;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@ConfigurationProperties("my.props")
public class MyProps {
     // Project class-type property.
     // annotation is required here to make configurationProcessor/IDEA resolve the keys
     @NestedConfigurationProperty
    Foo foo;

    // Collection<project class>-type property.
    //  annotation is not required for collection of external pojos: IDEA shows properties of Foo as resolved in this case
    // however, may be this is incorrect from the metadata point of view: configurationProcessor doesn't generate these properties
    // in this case even the annotation doesn't help
    List<Bar> barList;

    // static inner class-type property.
    //  annotation is not required for the inner class: both IDEA and configurationProcessor support the properties in this case
    InnerFoo innerfoo;

    // non-static inner class-type property
    // annotation is not required, metadata is generated, but the null value is set for the class-type property
    NonStaticInnerFoo nonStaticInnerFoo;

    // Library class-type property
    // annotation is required here to make configurationProcessor/IDEA resolve the keys
    @NestedConfigurationProperty
    LibPojo1 libPojo1;

    public static class InnerFoo{
        String buzz;

        public String getBuzz() {
            return buzz;
        }

        public void setBuzz(String buzz) {
            this.buzz = buzz;
        }
    }

    public class NonStaticInnerFoo{
        String buzz;

        public String getBuzz() {
            return buzz;
        }

        public void setBuzz(String buzz) {
            this.buzz = buzz;
        }
    }
    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public List<Bar> getBarList() {
        return barList;
    }

    public void setBarList(List<Bar> barList) {
        this.barList = barList;
    }

    public InnerFoo getInnerfoo() {
        return innerfoo;
    }

    public void setInnerfoo(InnerFoo innerfoo) {
        this.innerfoo = innerfoo;
    }

    public NonStaticInnerFoo getNonStaticInnerFoo() {
        return nonStaticInnerFoo;
    }

    public void setNonStaticInnerFoo(NonStaticInnerFoo nonStaticInnerFoo) {
        this.nonStaticInnerFoo = nonStaticInnerFoo;
    }

    public LibPojo1 getLibPojo1() {
        return libPojo1;
    }

    public void setLibPojo1(LibPojo1 libPojo1) {
        this.libPojo1 = libPojo1;
    }
}
