package com.example.demo.models;

import javax.persistence.*;

@Entity
public class FoodType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer foodTypeId;
    private int formulaMl;
    private Integer leftBreastTimer;
    private Integer rightBreastTimer;
    @ManyToOne
    @JoinColumn(name = "feedingId")
    private Feeding feeding;

    public FoodType() {
    }

    public Integer getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(Integer foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    public int getFormulaMl() {
        return formulaMl;
    }

    public void setFormulaMl(int formulaMl) {
        this.formulaMl = formulaMl;
    }

    public Integer getLeftBreastTimer() {
        return leftBreastTimer;
    }

    public void setLeftBreastTimer(Integer leftBreastTimer) {
        this.leftBreastTimer = leftBreastTimer;
    }

    public Integer getRightBreastTimer() {
        return rightBreastTimer;
    }

    public void setRightBreastTimer(Integer rightBreastTimer) {
        this.rightBreastTimer = rightBreastTimer;
    }

    public Feeding getFeeding() {
        return feeding;
    }

    public void setFeeding(Feeding feeding) {
        this.feeding = feeding;
    }
}
