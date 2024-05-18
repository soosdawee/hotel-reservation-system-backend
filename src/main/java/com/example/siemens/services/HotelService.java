package com.example.siemens.services;

import com.example.siemens.dtos.HotelDto;
import com.example.siemens.interfaces.ServiceInterface;
import com.example.siemens.mappers.HotelMapper;
import com.example.siemens.models.Hotel;
import com.example.siemens.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class HotelService implements ServiceInterface<HotelDto> {
    @Autowired
    private HotelRepository repository;

    public HotelDto create(HotelDto hotelDto) {
        Hotel hotel = HotelMapper.mapToHotel(hotelDto);
        Hotel savedHotel = repository.save(hotel);
        return HotelMapper.mapToHotelDto(savedHotel);
    }

    @Override
    public HotelDto getById(Long id) {
        return null;
    }

    @Override
    public List<HotelDto> getAll() {
        return repository.findAll().stream()
                .map(HotelMapper::mapToHotelDto)
                .collect(Collectors.toList());
    }

    @Override
    public HotelDto update(Long id, Map<String, Object> fields) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }


}
