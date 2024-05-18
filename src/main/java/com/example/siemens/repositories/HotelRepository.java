package com.example.siemens.repositories;

import com.example.siemens.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
