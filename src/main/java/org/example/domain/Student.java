package org.example.domain;

import jakarta.persistence.*;

@Entity
@Table(name="student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 250)
    private String fio;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "college_id", nullable = false)
    private College college;

    @Column(name = "record_book_no", nullable = false)
    private Integer record_book_no;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "specialization_id", nullable = false)
    private Specialization specialization;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getFio(){
        return fio;
    }
    public void setFio(String fio){
        this.fio = fio;
    }

    public Integer getRecord_book_no(){
        return record_book_no;
    }
    public void setRecord_book_no(Integer record_book_no){
        this.record_book_no = record_book_no;
    }

    public College getCollege(){
        return college;
    }
    public void setCollege(College college){this.college = college;}

    public Specialization getSpecialization(){
        return specialization;
    }
    public void setSpecialization(Specialization specialization){
        this.specialization = specialization;
    }

}