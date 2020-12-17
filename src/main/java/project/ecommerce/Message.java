package project.ecommerce;

import lombok.Data;

@Data
public class Message {

    private final String message;

    public Message(String message) {
        this.message = message;
    }
}