package com.cupello.json;

public class GreetingMessage {

    /*
    The get and set methods are required in order for the POJOs to work with AWS Lambda's built
    in JSON serializer.
     */

    private String greetingMessage;

    public GreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
}
