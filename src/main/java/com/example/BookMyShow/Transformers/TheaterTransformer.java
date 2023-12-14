package com.example.BookMyShow.Transformers;

import com.example.BookMyShow.Dtos.RequestDto.TheaterEntryDto;
import com.example.BookMyShow.Models.Theater;

public class TheaterTransformer {
    public static Theater convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        Theater theater = Theater.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

        return theater;
    }
}
