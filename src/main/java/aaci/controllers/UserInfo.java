package aaci.controllers;

import javax.persistence.*;

/**
 * Created by Nico on 5/4/17.
 */
@Entity
@Table(name = "USER_INFO")
public class UserInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;

    @Column(name = "NAME")
    String name;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "email")
    String email;

    public UserInfo() {
    }

    public UserInfo(String name, String username, String password, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
