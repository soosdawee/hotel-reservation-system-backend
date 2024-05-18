package com.example.siemens.models;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(length=512)
    private String description;

    private Integer stars;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    public Feedback(Long id, String description, Integer stars, Hotel hotel) {
        this.id = id;
        this.description = description;
        this.stars = stars;
        this.hotel = hotel;
    }

    public Feedback() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
