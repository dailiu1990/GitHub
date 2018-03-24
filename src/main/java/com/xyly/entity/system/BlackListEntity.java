package com.xyly.entity.system;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2018/3/14.
 */
@Entity
@Table(name="blacklist",catalog="xyly")
public class BlackListEntity {

    @Id
    @GeneratedValue(generator = "seq_blacklist_id",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_blacklist_id", allocationSize = 1, initialValue = 1, sequenceName = "seq_log_id")
    private int id;

    private String ip;

    private String Remark;

    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    private String operation;

    public BlackListEntity() {
    }

    public BlackListEntity(String ip, String remark, Date time, String operation) {
        this.ip = ip;
        Remark = remark;
        this.time = time;
        this.operation = operation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
