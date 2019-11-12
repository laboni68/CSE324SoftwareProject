package com.ELane;

//import oracle.sql.String;
import org.apache.tomcat.jni.File;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by User on 4/21/2017.
 */
@Entity
public class Consumer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Integer id;

    private  String  firstname;
    private  String  lastname;
    private  String  username;
    private  String  DOB;
    private  String password;
    private String image;
    public Consumer() {
    }

    public Consumer(Integer id, String firstname, String lastname, String username, String DOB) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.DOB = DOB;
        this.password=password;
    }

    public Consumer(Integer id, String firstname, String lastname, String username, String DOB, String password, String image) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.DOB = DOB;
        this.password = password;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
