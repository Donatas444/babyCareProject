package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Feeding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long feedingId;

    @ManyToOne
    @JoinColumn(name="id")
    private Baby baby;


private Long babyId;

    private LocalDate feedingDate;


    private Integer feedingTime;

    private Long feedingType;

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

    public LocalDate getFeedingDate() {
        return feedingDate;
    }

    public void setFeedingDate(LocalDate feedingDate) {
        this.feedingDate = feedingDate;
    }

    public Integer getFeedingTime() {
        return feedingTime;
    }

    public void setFeedingTime(Integer feedingTime) {
        this.feedingTime = feedingTime;
    }

    public Long getFeedingType() {
        return feedingType;
    }

    public void setFeedingType(Long feedingType) {
        this.feedingType = feedingType;
    }
}
