/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Trần Việt
 */
public class Student {
    private int STT;
    private String roll,name;
    private boolean gender;
    private String date;
    private String address;
    private boolean status;//đang học và chưa học/đã nghỉ
    private int sesion;//kỳ học 
    private boolean inDom;
    private String phone;

    public Student() {
    }

    public Student(int STT, String roll, String name, boolean gender, 
            String date, String address, boolean status, int sesion,boolean inDom,String phone) {
        this.STT = STT;
        this.roll = roll;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.status = status;
        this.sesion = sesion;
        this.inDom = inDom;
        this.phone = phone;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public boolean isInDom() {
        return inDom;
    }

    public void setInDom(boolean inDom) {
        this.inDom = inDom;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSesion() {
        return sesion;
    }

    public void setSesion(int sesion) {
        this.sesion = sesion;
    }
    
    
    
}
