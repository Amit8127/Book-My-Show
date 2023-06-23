package com.driver.bookMyShow.Dtos.RequestDtos;

import lombok.Data;

import java.util.List;

@Data
public class TicketEntryDto {
    private Integer showId;
    private Integer userId;
    private List<String> requestSeats;
}
