package com.example.siemens.services;

import com.example.siemens.dtos.HotelDto;
import com.example.siemens.dtos.RoomDto;
import com.example.siemens.interfaces.ServiceInterface;
import com.example.siemens.mappers.RoomMapper;
import com.example.siemens.models.Room;
import com.example.siemens.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoomService implements ServiceInterface<RoomDto> {
    @Autowired
    RoomRepository repository;

    @Override
    public RoomDto create(RoomDto dto) {
        return null;
    }

    @Override
    public RoomDto getById(Long id) {
        return null;
    }

    @Override
    public List<RoomDto> getAll() {
        return repository.findAll().stream()
                .map(RoomMapper::mapToRoomDto)
                .collect(Collectors.toList());
    }

    @Override
    public RoomDto update(Long id, Map<String, Object> fields) {
        Optional<Room> currentRoom = repository.findById(id);

        if (currentRoom.isPresent()) {
            fields.forEach((key, value) -> {
                Field field = ReflectionUtils.findField(Room.class, key);
                field.setAccessible(true);
                ReflectionUtils.setField(field, currentRoom.get(), value);
            });

            repository.save(currentRoom.get());
            return RoomMapper.mapToRoomDto(currentRoom.get());
        }

        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
