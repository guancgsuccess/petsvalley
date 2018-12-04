package com.petsvalley.entity;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * system_message
 * @author 
 */
public class SystemMessage implements Serializable {
    /**
     * 消息ID
     */
    private Integer systemMessageId;

    private Integer systemMessageStatue;

    /**
     * 消息标题
     */
    private String systemMessageTitle;

    /**
     * 消息内容
     */
    private String systemMessageContent;

    /**
     * 发送消息时间
     */
    private Date systemMessageTime;

    private String systemMessageSpare;

    private static final long serialVersionUID = 1L;

    public Integer getSystemMessageId() {
        return systemMessageId;
    }

    public void setSystemMessageId(Integer systemMessageId) {
        this.systemMessageId = systemMessageId;
    }

    public Integer getSystemMessageStatue() {
        return systemMessageStatue;
    }

    public void setSystemMessageStatue(Integer systemMessageStatue) {
        this.systemMessageStatue = systemMessageStatue;
    }

    public String getSystemMessageTitle() {
        return systemMessageTitle;
    }

    public void setSystemMessageTitle(String systemMessageTitle) {
        this.systemMessageTitle = systemMessageTitle;
    }

    public String getSystemMessageContent() {
        return systemMessageContent;
    }

    public void setSystemMessageContent(String systemMessageContent) {
        this.systemMessageContent = systemMessageContent;
    }

    public Date getSystemMessageTime() {
        return systemMessageTime;
    }

    public void setSystemMessageTime(Date systemMessageTime) {
        this.systemMessageTime = systemMessageTime;
    }

    public String getSystemMessageSpare() {
        return systemMessageSpare;
    }

    public void setSystemMessageSpare(String systemMessageSpare) {
        this.systemMessageSpare = systemMessageSpare;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SystemMessage other = (SystemMessage) that;
        return (this.getSystemMessageId() == null ? other.getSystemMessageId() == null : this.getSystemMessageId().equals(other.getSystemMessageId()))
            && (this.getSystemMessageStatue() == null ? other.getSystemMessageStatue() == null : this.getSystemMessageStatue().equals(other.getSystemMessageStatue()))
            && (this.getSystemMessageTitle() == null ? other.getSystemMessageTitle() == null : this.getSystemMessageTitle().equals(other.getSystemMessageTitle()))
            && (this.getSystemMessageContent() == null ? other.getSystemMessageContent() == null : this.getSystemMessageContent().equals(other.getSystemMessageContent()))
            && (this.getSystemMessageTime() == null ? other.getSystemMessageTime() == null : this.getSystemMessageTime().equals(other.getSystemMessageTime()))
            && (this.getSystemMessageSpare() == null ? other.getSystemMessageSpare() == null : this.getSystemMessageSpare().equals(other.getSystemMessageSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSystemMessageId() == null) ? 0 : getSystemMessageId().hashCode());
        result = prime * result + ((getSystemMessageStatue() == null) ? 0 : getSystemMessageStatue().hashCode());
        result = prime * result + ((getSystemMessageTitle() == null) ? 0 : getSystemMessageTitle().hashCode());
        result = prime * result + ((getSystemMessageContent() == null) ? 0 : getSystemMessageContent().hashCode());
        result = prime * result + ((getSystemMessageTime() == null) ? 0 : getSystemMessageTime().hashCode());
        result = prime * result + ((getSystemMessageSpare() == null) ? 0 : getSystemMessageSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", systemMessageId=").append(systemMessageId);
        sb.append(", systemMessageStatue=").append(systemMessageStatue);
        sb.append(", systemMessageTitle=").append(systemMessageTitle);
        sb.append(", systemMessageContent=").append(systemMessageContent);
        sb.append(", systemMessageTime=").append(systemMessageTime);
        sb.append(", systemMessageSpare=").append(systemMessageSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}