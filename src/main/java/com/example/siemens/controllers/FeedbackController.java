package com.example.siemens.controllers;

import com.example.siemens.dtos.FeedbackDto;
import com.example.siemens.models.Feedback;
import com.example.siemens.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    FeedbackService service;

    @PostMapping
    public ResponseEntity<FeedbackDto> addFeedbackToHotel(@RequestBody FeedbackDto feedbackDto) {
        FeedbackDto savedFeedback = service.create(feedbackDto);
        return ResponseEntity.ok(savedFeedback);
    }
}
