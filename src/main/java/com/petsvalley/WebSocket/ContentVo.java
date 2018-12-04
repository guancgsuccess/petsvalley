package com.petsvalley.WebSocket;

public class ContentVo {

    private String to;
    private String msg;
    private Integer type;
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ContentVo{" +
                "to='" + to + '\'' +
                ", msg='" + msg + '\'' +
                ", type=" + type +
                '}';
    }
}
