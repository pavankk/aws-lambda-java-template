package com.cupello.json;

public class User {

    /*
    The get and set methods are required in order for the POJOs to work with AWS Lambda's built
    in JSON serializer.
     */

    private String name;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
