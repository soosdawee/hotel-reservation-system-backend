package com.example.siemens.services;

import com.example.siemens.dtos.FeedbackDto;
import com.example.siemens.interfaces.ServiceInterface;
import com.example.siemens.mappers.FeedbackMapper;
import com.example.siemens.models.Feedback;
import com.example.siemens.models.Hotel;
import com.example.siemens.repositories.FeedbackRepository;
import com.example.siemens.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class FeedbackService implements ServiceInterface<FeedbackDto> {
    @Autowired
    FeedbackRepository repository;

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public FeedbackDto create(FeedbackDto dto) {
        Optional<Hotel> hotelOptional = hotelRepository.findById(dto.getHotelId());
        if (hotelOptional.isPresent()) {
            Hotel hotel = hotelOptional.get();
            Feedback feedback = new Feedback(dto.getId(), dto.getDescription(), dto.getStars(), hotel);
            repository.save(feedback);
            return FeedbackMapper.mapToFeedbackDto(feedback);
        }
        return null;
    }

    @Override
    public FeedbackDto getById(Long id) {
        return null;
    }

    @Override
    public List<FeedbackDto> getAll() {
        return null;
    }

    @Override
    public FeedbackDto update(Long id, Map<String, Object> fields) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
