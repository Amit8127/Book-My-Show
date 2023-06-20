package com.driver.bookMyShow.Dtos.RequestDtos;

import com.driver.bookMyShow.Enums.SeatType;
import lombok.Data;

@Data
public class TheaterSeatEntryDto {
    private String address;
    private Integer noOfSeatInRow;
    private Integer noOfPremiumSeat;
    private Integer noOfClassicSeat;
}
