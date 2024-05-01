/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author hbtth
 */
public class User {
    private int idUser;
    private String username, password;
    private String dayOfBirth;
    private String phoneNumber, fullname, address;
    private int gender;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String dayOfBirth, String phoneNumber, String fullname, String address, int gender) {
        this.username = username;
        this.password = password;
        this.dayOfBirth = dayOfBirth;
        this.phoneNumber = phoneNumber;
        this.fullname = fullname;
        this.address = address;
        this.gender = gender;
    }

    public User(int idUser, String username, String password, String dayOfBirth, String phoneNumber, String fullname, String address, int gender) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.dayOfBirth = dayOfBirth;
        this.phoneNumber = phoneNumber;
        this.fullname = fullname;
        this.address = address;
        this.gender = gender;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    
}
