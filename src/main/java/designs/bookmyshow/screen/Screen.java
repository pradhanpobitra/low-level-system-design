package designs.bookmyshow.screen;

import designs.bookmyshow.movie.Movie;

public record Screen (
    Movie movie,
    int theatreId,
    int cityId,
    int startTime,
    int endTime
) {}
