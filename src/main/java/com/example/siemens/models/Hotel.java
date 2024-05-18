package com.example.siemens.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.scheduling.config.Task;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    private Long id;

    @Column(unique = true)
    private String name;

    private Float latitude;
    private Float longitude;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_hotel_id", referencedColumnName = "id")
    private List<Room> rooms = new ArrayList<>();

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Feedback> feedbacks = new ArrayList<>();

    public Hotel(Long id, String name, Float latitude, Float longitude, List<Room> rooms) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.rooms = rooms;
    }

    public Hotel() { }

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

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
