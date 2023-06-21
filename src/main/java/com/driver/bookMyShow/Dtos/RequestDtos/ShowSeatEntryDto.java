package com.driver.bookMyShow.Dtos.RequestDtos;

import lombok.Data;

@Data
public class ShowSeatEntryDto {
    private Integer theaterId;
    private Integer priceOfPremiumSeat;
    private Integer priceOfClassicSeat;
}
