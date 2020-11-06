package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Diapers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private boolean diaperId;
    private LocalDate timeDiapersChanged;
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

    public LocalDate getTimeDiapersChanged() {
        return timeDiapersChanged;
    }

    public void setTimeDiapersChanged(LocalDate timeDiapersChanged) {
        this.timeDiapersChanged = timeDiapersChanged;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }

    @Override
    public String toString() {
        return "Diapers{" +
                "diaperId=" + diaperId +
                ", timeDiapersChanged=" + timeDiapersChanged +
                ", baby=" + baby +
                '}';
    }
}
