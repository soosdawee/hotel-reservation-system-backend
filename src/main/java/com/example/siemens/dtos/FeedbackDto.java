package com.example.siemens.dtos;

import com.example.siemens.models.Hotel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackDto {
    private Long id;
    private Integer stars;
    private String description;
    private Long hotelId;
}
