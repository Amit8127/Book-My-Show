package com.driver.bookMyShow.Dtos.RequestDtos;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class ShowEntryDto {

    private Time showStartTime;
    private Date showDate;
    private Integer theaterId;
    private Integer movieId;
}
