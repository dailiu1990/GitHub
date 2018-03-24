package com.xyly.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;


import javax.persistence.*;
import java.util.Set;

/**
 * Created by daichao on 2018/1/23.
 */
@Entity
@Table(name = "menu")
public class Menu extends TreeModel {
    public Menu() {
        super();
    }

    @Id
    @GeneratedValue(generator = "seq_menu_id",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name ="seq_menu_id",allocationSize = 1,initialValue = 1,sequenceName = "seq_menu_id")
    private Integer id;
    private String label;
    private Integer parentid;
    private Integer order;
    private Integer level;
    private String url;
    private Integer type;
    private String style;
    private Boolean disabled;

    /*@ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("menuSet")
    @JoinTable(name = "role_menu",
            joinColumns = {@JoinColumn(name="menu_id",referencedColumnName = "id")}
            ,inverseJoinColumns = {@JoinColumn(name = "role_id",referencedColumnName = "id")  })
    private Set<Role> roleSet;*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

   /* public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }*/
}
