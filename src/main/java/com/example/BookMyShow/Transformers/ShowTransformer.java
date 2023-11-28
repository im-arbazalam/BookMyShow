package com.example.BookMyShow.Transformers;

import com.example.BookMyShow.Dtos.RequestDto.AddShowDto;
import com.example.BookMyShow.Models.Show;

public class ShowTransformer {
    public static Show convertDtoToEntity(AddShowDto addShowDto){

        Show show = Show.builder().time(addShowDto.getShowStartTime())
                .date(addShowDto.getShowDate()).build();

        return show;

    }
}
