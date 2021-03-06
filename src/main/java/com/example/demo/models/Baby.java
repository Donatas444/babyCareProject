package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Baby {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToMany(mappedBy="baby", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private List<Feeding> feedings;

    @OneToMany(mappedBy="baby", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Diapers> diapers;

    private String name;

    private int age;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "id=" + id +
                ", feedings=" + feedings +
                ", diapers=" + diapers +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
