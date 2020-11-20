package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Diapers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long diaperId;
    private Long babyId;
    private String dateDiapersChanged;
    private String timeDiapersChanged;
    @ManyToOne
    @JoinColumn(name = "id")
    private Baby baby;

    public Diapers() {
    }

    public Long isDiaperId() {
        return diaperId;
    }

    public void setDiaperId(Long diaperId) {
        this.diaperId = diaperId;
    }

    public String getDateDiapersChanged() {
        return dateDiapersChanged;
    }

    public void setDateDiapersChanged(String dateDiapersChanged) {
        this.dateDiapersChanged = dateDiapersChanged;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }

    public String getTimeDiapersChanged() {
        return timeDiapersChanged;
    }

    public void setTimeDiapersChanged(String timeDiapersChanged) {
        this.timeDiapersChanged = timeDiapersChanged;
    }

    public Long getDiaperId() {
        return diaperId;
    }

    public Long getBabyId() {
        return babyId;
    }

    public void setBabyId(Long babyId) {
        this.babyId = babyId;
    }

    @Override
    public String toString() {
        return "Diapers{" +
                "diaperId=" + diaperId +
                ", babyId=" + babyId +
                ", dateDiapersChanged='" + dateDiapersChanged + '\'' +
                ", timeDiapersChanged='" + timeDiapersChanged + '\'' +
                ", baby=" + baby +
                '}';
    }
}
