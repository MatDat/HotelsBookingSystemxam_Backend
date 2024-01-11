package com.example.hotelsbookingsystemxam_backend.restcontroller;

import com.example.hotelsbookingsystemxam_backend.model.Hotel;
import com.example.hotelsbookingsystemxam_backend.repo.HotelRepo;
import com.example.hotelsbookingsystemxam_backend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HotelController {

    @Autowired
    HotelService hotelService;

    @PostMapping("/addHotel")
    public ResponseEntity<Hotel> addProduct(@RequestBody Hotel hotel) {
        return hotelService.saveHotel(hotel);
    }
}
