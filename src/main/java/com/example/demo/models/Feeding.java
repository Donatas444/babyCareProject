package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Feeding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long feedingId;

    @ManyToOne
    @JoinColumn(name = "id")
    private Baby baby;

//@Transient
    private Long babyId;
    private String feedingDate;
    private String feedingTime;
    private String feedingPeriod;
    private String feedingAmount;

    private Long feedingType;

    @ManyToOne

    @JoinColumn(name = "typeId")
    private FoodType foodType;

    public Feeding() {
    }
    public Long getFeedingId() {
        return feedingId;
    }

    public void setFeedingId(Long feedingId) {
        this.feedingId = feedingId;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }

    public Long getBabyId() {
        return babyId;
    }

    public void setBabyId(Long babyId) {
        this.babyId = babyId;
    }

    public String getFeedingDate() {
        return feedingDate;
    }

    public void setFeedingDate(String feedingDate) {
        this.feedingDate = feedingDate;
    }

    public String getFeedingTime() {
        return feedingTime;
    }

    public void setFeedingTime(String feedingTime) {
        this.feedingTime = feedingTime;
    }

    public Long getFeedingType() {
        return feedingType;
    }

    public void setFeedingType(Long feedingType) {
        this.feedingType = feedingType;
    }

    public String getFeedingPeriod() {
        return feedingPeriod;
    }

    public void setFeedingPeriod(String feedingPeriod) {
        this.feedingPeriod = feedingPeriod;
    }



    public String getFeedingAmount() {
        return feedingAmount;
    }

    public void setFeedingAmount(String feedingAmount) {
        this.feedingAmount = feedingAmount;
    }

    @Override
    public String toString() {
        return "Feeding{" +
                "feedingId=" + feedingId +
                ", baby=" + baby +
                ", babyId=" + babyId +
                ", feedingDate='" + feedingDate + '\'' +
                ", feedingTime='" + feedingTime + '\'' +
                ", feedingPeriod='" + feedingPeriod + '\'' +
                ", feedingAmount='" + feedingAmount + '\'' +
                ", feedingType=" + feedingType +
                ", foodType=" + foodType +
                '}';
    }
}
