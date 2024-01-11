package com.example.hotelsbookingsystemxam_backend.repo;

import com.example.hotelsbookingsystemxam_backend.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Integer> {
}
