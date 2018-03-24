package com.xyly.entity;

import javax.persistence.*;
import com.vividsolutions.jts.geom.Point;
/**
 * Created by daichao on 2018/1/15.
 */
@Entity
@Table(name = "food", schema = "public", catalog = "xyly")
public class FoodEntity {
    @Id
    @GeneratedValue(generator = "seq_foot_id",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name ="seq_foot_id",allocationSize = 1,initialValue = 1,sequenceName = "seq_foot_id")
    private int id;
    @Column(name = "name",columnDefinition="varchar(100) ")
    private String name;
    @Column(name = "description",columnDefinition="varchar(1000)")
    private String description;
    @Column(name = "type",columnDefinition="varchar(10)")
    private String type;
    @Column(name = "percost",columnDefinition="varchar(10)")
    private String percost;
    @Column(name = "detail")
    private String detail;
    @Column(name = "address",columnDefinition="varchar(500)")
    private String address;
    @Column(name = "photo",columnDefinition="varchar(50)")
    private String photo;
    @Column(name = "ticket",columnDefinition="varchar(30)")
    private String ticket;
    @Column(name = "business_hours",columnDefinition="varchar(1000)")
    private String businessHours;
    @Column(name = "recommended_dish",columnDefinition="varchar(500)")
    private String recommendedDish;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "the_geom",columnDefinition = "geometry(Point,4326)")
    private Point location;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPercost() {
        return percost;
    }

    public void setPercost(String percost) {
        this.percost = percost;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }

    public String getRecommendedDish() {
        return recommendedDish;
    }

    public void setRecommendedDish(String recommendedDish) {
        this.recommendedDish = recommendedDish;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodEntity that = (FoodEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (percost != null ? !percost.equals(that.percost) : that.percost != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (ticket != null ? !ticket.equals(that.ticket) : that.ticket != null) return false;
        if (businessHours != null ? !businessHours.equals(that.businessHours) : that.businessHours != null)
            return false;
        if (recommendedDish != null ? !recommendedDish.equals(that.recommendedDish) : that.recommendedDish != null)
            return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (percost != null ? percost.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (ticket != null ? ticket.hashCode() : 0);
        result = 31 * result + (businessHours != null ? businessHours.hashCode() : 0);
        result = 31 * result + (recommendedDish != null ? recommendedDish.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
