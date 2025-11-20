package org.example.domain;

import jakarta.persistence.*;

@Entity
@Table(name="college")

public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 250)
    private String name;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @Column(name = "founded_year", nullable = false)
    private Integer foundedYear;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Integer getFounded_year(){
        return foundedYear;
    }
    public void setFounded_year(Integer founded_year){
        this.foundedYear = founded_year;
    }

    public City getCity() { return city; }
    public void setCity(City city){
        this.city = city;
    }

}
