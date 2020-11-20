package com.example.demo.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FoodType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer foodTypeId;
    private int formulaMl;
    private String leftBreast;
    private String rightBreast;
    // @ManyToOne
    // @JoinColumn(name = "feedingId")
    // private Feeding feeding;
    @ManyToMany
    @JoinTable(
            name = "feeding_food_type",
            joinColumns = @JoinColumn(name = "food_type_id"),
            inverseJoinColumns = @JoinColumn(name = "feeding_id"))
    Set<Feeding> feedingSet;

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

    public String getLeftBreast() {
        return leftBreast;
    }

    public void setLeftBreast(String leftBreast) {
        this.leftBreast = leftBreast;
    }

    public String getRightBreast() {
        return rightBreast;
    }

    public void setRightBreast(String rightBreast) {
        this.rightBreast = rightBreast;
    }

    // public Feeding getFeeding() {
    //     return feeding;
    // }
    //
    // public void setFeeding(Feeding feeding) {
    //     this.feeding = feeding;
    // }


    public Set<Feeding> getFeedingSet() {
        return feedingSet;
    }

    public void setFeedingSet(Set<Feeding> feedingSet) {
        this.feedingSet = feedingSet;
    }

    @Override
    public String toString() {
        return "FoodType{" +
                "foodTypeId=" + foodTypeId +
                ", formulaMl=" + formulaMl +
                ", leftBreast='" + leftBreast + '\'' +
                ", rightBreast='" + rightBreast + '\'' +
                ", feedingSet=" + feedingSet +
                '}';
    }
}
