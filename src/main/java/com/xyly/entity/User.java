package com.xyly.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

/**
 * Created by daichao on 2018/1/23.
 */
@Entity
@Table(name = "user", schema = "public", catalog = "xyly")
public class User {

    public User() {
    }

    @Id
    @GeneratedValue(generator = "seq_user_id",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_user_id", allocationSize = 1, initialValue = 1, sequenceName = "seq_user_id")
    private int id;
    @Column(name = "email", length = 30)
    private String email;
    @Column(name = "username", length = 40,unique = true)
    private String username;
    @Column(name = "password", nullable = false)
    @Size(min = 4, max = 100)
    private String password;

    @Column(name = "enabled",nullable = false)
    private Boolean enabled;

    @Column(name = "lastpasswordresetdate",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastPasswordResetDate;

    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    @Column(name = "last_logintime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTime;
    private String phone;
    @Column(name = "sex")
    private Short sex;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("userset")
    @JoinTable(name = "user_role",
            joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") })
    private Set<Role> roleSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public void setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }
}
