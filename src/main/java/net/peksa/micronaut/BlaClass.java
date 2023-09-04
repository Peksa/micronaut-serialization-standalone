package net.peksa.micronaut;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class BlaClass {
    private String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
