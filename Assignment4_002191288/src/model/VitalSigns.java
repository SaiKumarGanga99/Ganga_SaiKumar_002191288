/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author saikumarganga
 *
 */
import java.time.LocalDateTime;
import java.util.Date;


public class VitalSigns {

    public Double getSysBP() {
        return sysBP;
    }

    @Override
    public String toString() {
        return  "Systolic Blood Pressure= " + sysBP ;
    }
    Double sysBP;

    public void setSysBP(Double sysBP) {
        this.sysBP = sysBP;
    }
    LocalDateTime entryDateTime;

    public LocalDateTime getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(LocalDateTime entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    int age;
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    Date dob;
    
}
