package com.xyly.entity.system;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2018/3/14.
 */
@Entity
@Table(name="log",catalog="xyly")
public class LogEntity {
    @Id
    @GeneratedValue(generator = "seq_log_id",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_log_id", allocationSize = 1, initialValue = 1, sequenceName = "seq_log_id")
    private int id;

    private  String username;

    private String event;
    @Temporal(TemporalType.TIMESTAMP)
    private Date operationtime;

    private String content;

    public LogEntity() {
    }

    public LogEntity(String username, String event, Date operationtime, String content) {
        this.username = username;
        this.event = event;
        this.operationtime = operationtime;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
