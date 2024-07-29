package com.codingshuttle.project.uber.Controller;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.Services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RiderController {

    private final RiderService riderservice;
    @PostMapping("/requestRide")
    public ResponseEntity<RideRequestDTO> requestRide(@RequestBody RideRequestDTO riderequestdto){
        return ResponseEntity.ok(riderservice.requestRide(riderequestdto));
    }
}
