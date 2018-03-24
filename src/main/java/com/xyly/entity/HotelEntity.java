package com.xyly.entity;

import javax.persistence.*;
import com.vividsolutions.jts.geom.Point;

/**
 * Created by daichao on 2018/1/15.
 */
@Entity
@Table(name = "hotel", schema = "public", catalog = "xyly")
public class HotelEntity {
    private int id;
    private String name;
    private String description;
    private String percost;
    private String detail;
    private String address;
    private String photo;
    private String ticket;
    private Integer starlevel;
    private String parking;
    private String network;
    private Integer phone;
    private Point theGeom;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "percost")
    public String getPercost() {
        return percost;
    }

    public void setPercost(String percost) {
        this.percost = percost;
    }

    @Basic
    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "ticket")
    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Basic
    @Column(name = "starlevel")
    public Integer getStarlevel() {
        return starlevel;
    }

    public void setStarlevel(Integer starlevel) {
        this.starlevel = starlevel;
    }

    @Basic
    @Column(name = "parking")
    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    @Basic
    @Column(name = "network")
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @Basic
    @Column(name = "phone")
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "the_geom")
    public Point getTheGeom() {
        return theGeom;
    }

    public void setTheGeom(Point theGeom) {
        this.theGeom = theGeom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelEntity that = (HotelEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (percost != null ? !percost.equals(that.percost) : that.percost != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (ticket != null ? !ticket.equals(that.ticket) : that.ticket != null) return false;
        if (starlevel != null ? !starlevel.equals(that.starlevel) : that.starlevel != null) return false;
        if (parking != null ? !parking.equals(that.parking) : that.parking != null) return false;
        if (network != null ? !network.equals(that.network) : that.network != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (theGeom != null ? !theGeom.equals(that.theGeom) : that.theGeom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (percost != null ? percost.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (ticket != null ? ticket.hashCode() : 0);
        result = 31 * result + (starlevel != null ? starlevel.hashCode() : 0);
        result = 31 * result + (parking != null ? parking.hashCode() : 0);
        result = 31 * result + (network != null ? network.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (theGeom != null ? theGeom.hashCode() : 0);
        return result;
    }
}
