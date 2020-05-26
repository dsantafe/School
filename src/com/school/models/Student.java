/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.models;

import java.util.Date;

/**
 *
 * @author EliteBook
 */
public class Student {
    public int Id;
    public String LastName;
    public String FirstMidName;
    public Date EnrollmentDate; 
    public int Code;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstMidName() {
        return FirstMidName;
    }

    public void setFirstMidName(String FirstMidName) {
        this.FirstMidName = FirstMidName;
    }

    public Date getEnrollmentDate() {
        return EnrollmentDate;
    }

    public void setEnrollmentDate(Date EnrollmentDate) {
        this.EnrollmentDate = EnrollmentDate;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }
    
    
}
