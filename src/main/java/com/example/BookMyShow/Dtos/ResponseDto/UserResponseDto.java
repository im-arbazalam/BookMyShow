package com.example.BookMyShow.Dtos.ResponseDto;

import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
    private String name;
    private int age;
    private String mobNo;


    private String statusCode;
    private String statusMessage;


}
