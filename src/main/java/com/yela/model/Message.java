package com.yela.model;

public class Message {

    private int id;
    private String text;

    public Message(){
        super();
    }

    public Message(int id, String text) {
        super();
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return text;
    }

    public void setMessage(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Message [id=%s, text=%s]", id, text);
    }
}
