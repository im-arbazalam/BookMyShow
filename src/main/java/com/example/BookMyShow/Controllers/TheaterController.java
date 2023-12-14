package com.example.BookMyShow.Controllers;

import com.example.BookMyShow.Dtos.RequestDto.TheaterEntryDto;
import com.example.BookMyShow.Dtos.RequestDto.TheaterSeatsEntryDto;
import com.example.BookMyShow.Services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
public class TheaterController {
    @Autowired
    TheaterService theaterService;

    @PostMapping("/add")
    public ResponseEntity<String> addTheater(@RequestBody TheaterEntryDto theaterEntryDto){
        try {
            String result= theaterService.addTheater(theaterEntryDto);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/addTheaterSeats")
    public  ResponseEntity<String> addTheaterSeats(@RequestBody TheaterSeatsEntryDto entryDto){

        try{
            String result=theaterService.addTheaterSeats(entryDto);
            return new ResponseEntity<>(result,HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }


}
