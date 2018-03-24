package com.xyly.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vividsolutions.jts.geom.Point;

import java.util.Set;

/**
 * Created by daichao on 2018/1/15.
 */
@Entity
@Table(name = "scenic", schema = "public", catalog = "xyly")
public class ScenicEntity {
    @Id
    @GeneratedValue(generator = "seq_scenic_id",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name ="seq_scenic_id",allocationSize = 1,initialValue = 1,sequenceName = "seq_scenic_id")
    private int id;
    @Column(name = "name",columnDefinition="varchar(100) ")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "detail")
    private String detail;
    @Column(name = "starlevel")
    private Integer starlevel;
    @Column(name = "address")
    private String address;
    @Column(name = "photo")
    private String photo;
    @Column(name = "ticket")
    private String ticket;
    @Column(name = "descriptionphoto")
    private String descriptionphoto;
    @Column(name = "traffic")
    private String traffic;
    @Column(name = "heatdegree")
    private Integer heatdegree;
    @Column(name = "the_geom",columnDefinition = "geometry(Point,4326)")
    private Point theGeom;

    @OneToMany(targetEntity = ScenicKeywordEntity.class,cascade = CascadeType.ALL,
            fetch =FetchType.EAGER)
    @JoinColumn(name = "scenicid")
    @JsonIgnoreProperties("scenicEntity")
    private Set<ScenicKeywordEntity> scenicKeywordEntities;

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


    public Integer getStarlevel() {
        return starlevel;
    }

    public void setStarlevel(Integer starlevel) {
        this.starlevel = starlevel;
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

    public String getDescriptionphoto() {
        return descriptionphoto;
    }

    public void setDescriptionphoto(String descriptionphoto) {
        this.descriptionphoto = descriptionphoto;
    }


    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }


    public Integer getHeatdegree() {
        return heatdegree;
    }

    public void setHeatdegree(Integer heatdegree) {
        this.heatdegree = heatdegree;
    }


    public Point getTheGeom() {
        return theGeom;
    }

    public void setTheGeom(Point theGeom) {
        this.theGeom = theGeom;
    }

    public Set<ScenicKeywordEntity> getScenicKeywordEntities() {
        return scenicKeywordEntities;
    }

    public void setScenicKeywordEntities(Set<ScenicKeywordEntity> scenicKeywordEntities) {
        this.scenicKeywordEntities = scenicKeywordEntities;
    }
}
