package com.example.demo;

import com.mytests.spring.LibPojo1;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
@ConfigurationProperties("my.props")
public class MyProps {
     // Project class-type property.
     // annotation is required here to make configurationProcessor/IDEA resolve the keys
     @NestedConfigurationProperty
    Foo foo;

     // project class-type property that also has the nested external class-type property
     @NestedConfigurationProperty
     Buzz buzz;

    // Collection<project class>-type property.
    //  annotation is not required for collection of external pojos: IDEA shows properties of Bar as resolved
    // metadata: configurationProcessor doesn't generate Bar class properties

    // note the gutter icons absence in the Bar class
    List<Bar> barList;

    // Map<project class>-type property.
    //  annotation is not required for map of external pojos: IDEA shows properties of Dummy as resolved
    // metadata: configurationProcessor doesn't generate the Dummy class properties

    // note the gutter icons absence in the Dummy class
    Map<String, Dummy> dummyMap;

    // Collection<inner class>-type property.
    //  annotation is not required for collection of inner pojos: IDEA shows properties of InnerBar as resolved
    // metadata: configurationProcessor doesn't generate InnerBar class properties

    // note the gutter icons absence in the InnerBar class
    List<InnerBar> innerBarList;

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
        // gutter is shown:
        public void setBuzz(String buzz) {
            this.buzz = buzz;
        }
    }

    public static class InnerBar{
        String barProp;

        public String getBarProp() {
            return barProp;
        }
        // no gutter:
        public void setBarProp(String barProp) {
            this.barProp = barProp;
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

    public Buzz getBuzz() {
        return buzz;
    }

    public void setBuzz(Buzz buzz) {
        this.buzz = buzz;
    }

    public Map<String, Dummy> getDummyMap() {
        return dummyMap;
    }

    public void setDummyMap(Map<String, Dummy> dummyMap) {
        this.dummyMap = dummyMap;
    }

    public List<InnerBar> getInnerBarList() {
        return innerBarList;
    }

    public void setInnerBarList(List<InnerBar> innerBarList) {
        this.innerBarList = innerBarList;
    }
}
