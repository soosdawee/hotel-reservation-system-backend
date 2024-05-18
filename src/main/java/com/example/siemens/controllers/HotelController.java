package com.example.siemens.controllers;

import com.example.siemens.dtos.HotelDto;
import com.example.siemens.services.HotelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    HotelService service;

    @PostMapping
    public ResponseEntity<HotelDto> createHotel(@Valid @RequestBody HotelDto hotelDto) {
        HotelDto savedHotel = service.create(hotelDto);
        return new ResponseEntity<>(savedHotel, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<HotelDto>> getHotels(){
        List<HotelDto> hotels = service.getAll();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }
}
