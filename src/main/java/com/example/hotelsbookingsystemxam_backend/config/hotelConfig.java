package com.example.hotelsbookingsystemxam_backend.config;

import com.example.hotelsbookingsystemxam_backend.repo.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class hotelConfig implements CommandLineRunner {

    @Autowired
    HotelRepo hotelRepo;

    @Override
    public void run(String... args) throws Exception {

    }
}
