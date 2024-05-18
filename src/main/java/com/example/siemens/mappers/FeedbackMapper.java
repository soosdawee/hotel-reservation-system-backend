package com.example.siemens.mappers;

import com.example.siemens.dtos.FeedbackDto;
import com.example.siemens.models.Feedback;

public class FeedbackMapper {
    public static FeedbackDto mapToFeedbackDto(Feedback feedback) {
        FeedbackDto feedbackDto = new FeedbackDto(
                feedback.getId(),
                feedback.getStars(),
                feedback.getDescription(),
                feedback.getHotel().getId()
        );
        return feedbackDto;
    }
}


