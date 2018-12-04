package com.petsvalley.entity;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * seedoctor
 * @author 
 */
public class Seedoctor implements Serializable {
    /**
     * 就医ID
     */
    private Integer docId;

    /**
     * 就医宠物ID
     */
    private Integer docPetId;

    /**
     * 就医时间
     */
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date docTime;

    /**
     * 就医地点
     */
    private String docLoc;

    /**
     * 就医细节
     */
    private String docDetalis;

    /**
     * 状态
     */
    private Integer docState;

    private String docSpare;

    private static final long serialVersionUID = 1L;

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Integer getDocPetId() {
        return docPetId;
    }

    public void setDocPetId(Integer docPetId) {
        this.docPetId = docPetId;
    }

    public Date getDocTime() {
        return docTime;
    }

    public void setDocTime(Date docTime) {
        this.docTime = docTime;
    }

    public String getDocLoc() {
        return docLoc;
    }

    public void setDocLoc(String docLoc) {
        this.docLoc = docLoc;
    }

    public String getDocDetalis() {
        return docDetalis;
    }

    public void setDocDetalis(String docDetalis) {
        this.docDetalis = docDetalis;
    }

    public Integer getDocState() {
        return docState;
    }

    public void setDocState(Integer docState) {
        this.docState = docState;
    }

    public String getDocSpare() {
        return docSpare;
    }

    public void setDocSpare(String docSpare) {
        this.docSpare = docSpare;
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
        Seedoctor other = (Seedoctor) that;
        return (this.getDocId() == null ? other.getDocId() == null : this.getDocId().equals(other.getDocId()))
            && (this.getDocPetId() == null ? other.getDocPetId() == null : this.getDocPetId().equals(other.getDocPetId()))
            && (this.getDocTime() == null ? other.getDocTime() == null : this.getDocTime().equals(other.getDocTime()))
            && (this.getDocLoc() == null ? other.getDocLoc() == null : this.getDocLoc().equals(other.getDocLoc()))
            && (this.getDocDetalis() == null ? other.getDocDetalis() == null : this.getDocDetalis().equals(other.getDocDetalis()))
            && (this.getDocState() == null ? other.getDocState() == null : this.getDocState().equals(other.getDocState()))
            && (this.getDocSpare() == null ? other.getDocSpare() == null : this.getDocSpare().equals(other.getDocSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDocId() == null) ? 0 : getDocId().hashCode());
        result = prime * result + ((getDocPetId() == null) ? 0 : getDocPetId().hashCode());
        result = prime * result + ((getDocTime() == null) ? 0 : getDocTime().hashCode());
        result = prime * result + ((getDocLoc() == null) ? 0 : getDocLoc().hashCode());
        result = prime * result + ((getDocDetalis() == null) ? 0 : getDocDetalis().hashCode());
        result = prime * result + ((getDocState() == null) ? 0 : getDocState().hashCode());
        result = prime * result + ((getDocSpare() == null) ? 0 : getDocSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", docId=").append(docId);
        sb.append(", docPetId=").append(docPetId);
        sb.append(", docTime=").append(docTime);
        sb.append(", docLoc=").append(docLoc);
        sb.append(", docDetalis=").append(docDetalis);
        sb.append(", docState=").append(docState);
        sb.append(", docSpare=").append(docSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}