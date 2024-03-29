package com.lgy.xiaoyou_index.enums;

public enum NotificationEnum {
    NOTIFICATION_COMMENT(1,"回复了评论"),
    NOTIFICATION_QUESTION(2,"回复了问题");
    private int type;
    private String name;
    NotificationEnum(int type, String name){
        this.type=type;
        this.name=name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
