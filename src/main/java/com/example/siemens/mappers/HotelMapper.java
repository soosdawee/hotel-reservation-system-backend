package com.example.siemens.mappers;

import com.example.siemens.dtos.HotelDto;
import com.example.siemens.models.Hotel;

public class HotelMapper {
    public static HotelDto mapToHotelDto(Hotel hotel){
        HotelDto hotelDto = new HotelDto(
                hotel.getId(),
                hotel.getName(),
                hotel.getLatitude(),
                hotel.getLongitude(),
                hotel.getRooms()
        );
        return hotelDto;
    }

    public static Hotel mapToHotel(HotelDto hotelDto){
        Hotel hotel = new Hotel(
                hotelDto.getId(),
                hotelDto.getName(),
                hotelDto.getLatitude(),
                hotelDto.getLongitude(),
                hotelDto.getRooms()
        );
        return hotel;
    }
}
