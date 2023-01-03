package com.kgisl.bootbrite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.bootbrite.model.Event;
@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {
    
}
