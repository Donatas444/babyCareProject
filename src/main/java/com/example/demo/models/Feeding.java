package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
public class Feeding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long feedingId;

    @ManyToOne
    @JoinColumn(name = "id")
    private Baby baby;


    private Long babyId;
    private String feedingDate;
    private String feedingTime;

    private Long feedingType;

    @OneToMany(mappedBy="feeding", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<FoodType> foodTypes;


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


    public List<FoodType> getFoodTypes() {
        return foodTypes;
    }

    public void setFoodTypes(List<FoodType> foodTypes) {
        this.foodTypes = foodTypes;
    }

    @Override
    public String toString() {
        return "Feeding{" +
                "feedingId=" + feedingId +
                ", baby=" + baby +
                ", babyId=" + babyId +
                ", feedingDate=" + feedingDate +
                ", feedingTime=" + feedingTime +
                ", feedingType=" + feedingType +
                ", foodTypes=" + foodTypes +
                '}';
    }
}
