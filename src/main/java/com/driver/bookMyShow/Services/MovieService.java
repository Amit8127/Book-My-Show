package com.driver.bookMyShow.Services;

import com.driver.bookMyShow.Dtos.RequestDtos.MovieEntryDto;
import com.driver.bookMyShow.Exceptions.MovieAlreadyPresentWithSameName;
import com.driver.bookMyShow.Models.Movie;
import com.driver.bookMyShow.Repositories.MovieRepository;
import com.driver.bookMyShow.Transformers.MovieTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto) throws MovieAlreadyPresentWithSameName{
        if(movieRepository.findByName(movieEntryDto.getMovieName()) != null) {
            throw new MovieAlreadyPresentWithSameName();
        }
        Movie movie = MovieTransformer.movieDtoToMovie(movieEntryDto);
        movieRepository.save(movie);
        return "The movie has been added successfully";
    }
}