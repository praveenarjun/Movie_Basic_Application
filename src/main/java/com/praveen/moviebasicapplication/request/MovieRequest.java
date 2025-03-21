package com.praveen.moviebasicapplication.request;

import com.praveen.moviebasicapplication.enums.Genre;
import com.praveen.moviebasicapplication.enums.Language;
import lombok.Data;

import java.sql.Date;

@Data
public class MovieRequest {
    private String movieName;
    private Integer duration;
    private Double rating;
    private Date releaseDate;
    private Genre genre;
    private Language language;
}
