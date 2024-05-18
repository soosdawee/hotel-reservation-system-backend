package com.example.siemens.controllers;

import com.example.siemens.dtos.HotelDto;
import com.example.siemens.dtos.RoomDto;
import com.example.siemens.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    RoomService service;

    @GetMapping
    public ResponseEntity<List<RoomDto>> getRooms(){
        List<RoomDto> rooms = service.getAll();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @PatchMapping("{id}")
    public RoomDto updateRoom(@PathVariable Long id, @RequestBody Map<String, Object> fields) {
        return service.update(id, fields);
    }
}

