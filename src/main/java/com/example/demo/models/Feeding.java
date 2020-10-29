package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Feeding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long feedingId;


    private Long babyId;

    private LocalDate feedingDate;

    private Integer feedingTime;

    private Long feedingTypeId;


    public Long getFeedingId() {
        return feedingId;
    }

    public void setFeedingId(Long feedingId) {
        this.feedingId = feedingId;
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

    public Long getFeedingTypeId() {
        return feedingTypeId;
    }

    public void setFeedingTypeId(Long feedingTypeId) {
        this.feedingTypeId = feedingTypeId;
    }
}
