package com.example.siemens.dtos;

import com.example.siemens.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoomDto {
    private Long id;
    private Integer roomNumber;
    private RoomType roomType;
    private Float price;
    private Boolean isAvailable;
}
