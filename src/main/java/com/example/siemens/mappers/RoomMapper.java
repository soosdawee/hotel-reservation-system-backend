package com.example.siemens.mappers;

import com.example.siemens.dtos.RoomDto;
import com.example.siemens.models.Hotel;
import com.example.siemens.models.Room;

public class RoomMapper {
    public static RoomDto mapToRoomDto(Room room){
        RoomDto roomDto = new RoomDto(
                room.getId(),
                room.getRoomNumber(),
                room.getRoomType(),
                room.getPrice(),
                room.getIsAvailable()
        );
        return roomDto;
    }

    public static Room mapToRoom(RoomDto roomDto){
        Room room = new Room(
                roomDto.getId(),
                roomDto.getRoomNumber(),
                roomDto.getRoomType(),
                roomDto.getPrice(),
                roomDto.getIsAvailable()
        );
        return room;
    }
}
