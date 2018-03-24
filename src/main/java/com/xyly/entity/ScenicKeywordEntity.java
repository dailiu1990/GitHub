package com.xyly.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by daichao on 2018/1/15.
 */
@Entity
@Table(name = "scenic_keyword", schema = "public", catalog = "xyly")
public class ScenicKeywordEntity {
    @Id
    @GeneratedValue(generator = "seq_scenickeyword_id",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name ="seq_scenickeyword_id",allocationSize = 1,initialValue = 1,sequenceName = "seq_scenickeyword_id")
    private int id;
    @JoinColumn(name = "scenicid")
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = ScenicEntity.class)
    @JsonIgnoreProperties("scenicKeywordEntities")
    private ScenicEntity scenicEntity;

    @Column(name = "content")
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ScenicEntity getScenicEntity() {
        return scenicEntity;
    }

    public void setScenicEntity(ScenicEntity scenicEntity) {
        this.scenicEntity = scenicEntity;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
