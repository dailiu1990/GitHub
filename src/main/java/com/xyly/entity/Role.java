package com.xyly.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by daichao on 2018/1/23.
 */
@Entity
@Table(name = "role", schema = "public", catalog = "xyly")
public class Role {

    public Role() {
        super();
    }

    @Id
    @GeneratedValue(generator = "seq_role_id",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name ="seq_role_id",allocationSize = 1,initialValue = 1,sequenceName = "seq_role_id")
    private  int id;
    private String name;
    private int disabled;
    private String description;

    private String rights;
    private String parent_id;
    private String add_qx;
    private String del_qx;
    private String edit_qx;
    private String cha_qx;

    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("roleSet")
    @JoinTable(name = "user_role",
            joinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") })
    private Set<User> userset;
   @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("roleSet")
    @JoinTable(name = "role_menu",
            joinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "menu_id", referencedColumnName = "id") })
    private Set<Menu> menuSet;

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

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUserset() {
        return userset;
    }

    public void setUserset(Set<User> userset) {
        this.userset = userset;
    }

    public Set<Menu> getMenuSet() {
        return menuSet;
    }

    public void setMenuSet(Set<Menu> menuSet) {
        this.menuSet = menuSet;
    }
   public String getRights() {
       return rights;
   }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getAdd_qx() {
        return add_qx;
    }

    public void setAdd_qx(String add_qx) {
        this.add_qx = add_qx;
    }

    public String getDel_qx() {
        return del_qx;
    }

    public void setDel_qx(String del_qx) {
        this.del_qx = del_qx;
    }

    public String getEdit_qx() {
        return edit_qx;
    }

    public void setEdit_qx(String edit_qx) {
        this.edit_qx = edit_qx;
    }

    public String getCha_qx() {
        return cha_qx;
    }

    public void setCha_qx(String cha_qx) {
        this.cha_qx = cha_qx;
    }

}
