package cn.tcbd.entity;

import java.sql.Date;

public class Grade {

    private int id;
    private String gradeName;
    private Date createDate;
    private String details;

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gradeName='" + gradeName + '\'' +
                ", createDate=" + createDate +
                ", details='" + details + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Grade() {
    }

    public Grade(int id, String gradeName, Date createDate, String details) {
        this.id = id;
        this.gradeName = gradeName;
        this.createDate = createDate;
        this.details = details;
    }
}
