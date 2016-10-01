package com.zulkarnyaev.notification.server.model;

/**
 * Created by azulkarnyaev on 26.09.16.
 */
public class Chat {

    public enum Type {
        PRIVATE, GROUP, SUPERGROUP, CHANNEL
    }

    private Integer chatId;
    private Type type;

    private String title;
    private String username;
    private String firstName;
    private String lastName;
}
