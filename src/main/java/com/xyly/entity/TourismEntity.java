package com.xyly.entity;


import com.vividsolutions.jts.geom.Point;
import javax.persistence.*;
/*import com.vividsolutions.jts.geom.Point;*/
/**
 * Created by daichao on 2018/1/15.
 */
@Entity
@Table(name = "tourism", schema = "public", catalog = "xyly")
public class TourismEntity {
    @Id
    @GeneratedValue(generator = "seq_tourism_id",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name ="seq_tourism_id",allocationSize = 1,initialValue = 1,sequenceName = "seq_tourism_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "detail")
    private String detail;
    @Column(name = "photo")
    private String photo;
    @Column(name = "ticket")
    private String ticket;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "time")
    private String time;
    @Column(name = "the_geom",columnDefinition = "geometry(Point,4326)")
    private Point theGeom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Point getTheGeom() {
        return theGeom;
    }

    public void setTheGeom(Point theGeom) {
        this.theGeom = theGeom;
    }

}
