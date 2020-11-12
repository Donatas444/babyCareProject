package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Diapers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private boolean diaperId;
    private LocalDate dateDiapersChanged;
    private LocalTime timeDiapersChanged;
    @ManyToOne
    @JoinColumn(name = "id")
    private Baby baby;

    public Diapers() {
    }

    public boolean isDiaperId() {
        return diaperId;
    }

    public void setDiaperId(boolean diaperId) {
        this.diaperId = diaperId;
    }

    public LocalDate getDateDiapersChanged() {
        return dateDiapersChanged;
    }

    public void setDateDiapersChanged(LocalDate dateDiapersChanged) {
        this.dateDiapersChanged = dateDiapersChanged;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }

    public LocalTime getTimeDiapersChanged() {
        return timeDiapersChanged;
    }

    public void setTimeDiapersChanged(LocalTime timeDiapersChanged) {
        this.timeDiapersChanged = timeDiapersChanged;
    }

    @Override
    public String toString() {
        return "Diapers{" +
                "diaperId=" + diaperId +
                ", dateDiapersChanged=" + dateDiapersChanged +
                ", timeDiapersChanged=" + timeDiapersChanged +
                ", baby=" + baby +
                '}';
    }
}
