package com.example.hotelsbookingsystemxam_backend.service;

import com.example.hotelsbookingsystemxam_backend.model.Hotel;
import com.example.hotelsbookingsystemxam_backend.repo.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    @Autowired
    HotelRepo hotelRepo;

    public ResponseEntity<Hotel> saveHotel(Hotel hotel) {
        hotelRepo.save(hotel);
        return ResponseEntity.ok(hotel);
    }
}
