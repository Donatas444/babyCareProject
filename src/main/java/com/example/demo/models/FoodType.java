package com.example.demo.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class FoodType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodTypeId;
    private String name;




    @OneToMany(mappedBy="foodType", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Feeding> feedings;


    public FoodType() {
    }

    public Long getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(Long foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Feeding> getFeedings() {
        return feedings;
    }

    public void setFeedings(List<Feeding> feedings) {
        this.feedings = feedings;
    }

    @Override
    public String toString() {
        return "FoodType{" +
                "foodTypeId=" + foodTypeId +
                ", name='" + name + '\'' +
                ", feedings=" + feedings +
                '}';
    }
}
