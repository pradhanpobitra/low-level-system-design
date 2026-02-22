package designs.bookmyshow.movie;

import java.time.Duration;

public class Movie {
    private final int id;
    private final String title;
    private final Duration duration;

    public Movie(int id, String title, Duration duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public Duration getDuration() {
        return duration;
    }
}
