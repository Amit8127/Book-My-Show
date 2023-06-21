package com.driver.bookMyShow.Exceptions;

public class MovieAlreadyPresentWithSameName extends RuntimeException {
    public MovieAlreadyPresentWithSameName() {
        super("Movie is already exists with same name");
    }
}
