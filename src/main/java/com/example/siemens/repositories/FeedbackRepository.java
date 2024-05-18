package com.example.siemens.repositories;

import com.example.siemens.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
