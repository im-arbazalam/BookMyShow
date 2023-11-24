package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Models.Theater;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater,Integer> {
    Theater findByLocation(String location);
}
