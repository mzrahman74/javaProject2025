package org.example;

/*
encapsulation - the meaning of encapsulation, is to make sure that 'sensitive ' data is hidden from
users.
declared class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

 */
public class sensitiveClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
