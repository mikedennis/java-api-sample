package com.example.hibernatedemo.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "phones")
@EntityListeners(AuditingEntityListener.class)
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; // Each phone will be given an auto-generated unique identifier when stored

    @Column(name = "phone_name", nullable = false)
    private String phoneName; // Save the name of the phone

    @Column(name = "os", nullable = false)
    private String os; // Save the operating system running in the phone
    
    /**
     * Our getters and setters for the attributes above
     */
    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String value) {
        this.phoneName = value;
    }
    
    public String getOs() {
        return os;
    }

    public void setOs(String value) {
        this.os = value;
    }
}
