package com.praveen.moviebasicapplication;

import com.praveen.moviebasicapplication.Repository.MovieRepository;
import com.praveen.moviebasicapplication.request.MovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(MovieRequest movierequest) {

    }
    

}
