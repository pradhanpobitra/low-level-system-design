package designs.bookmyshow;

import designs.bookmyshow.movie.Movie;
import designs.bookmyshow.moviestores.MovieStore;
import designs.bookmyshow.moviestores.MovieStoreFactory;
import designs.bookmyshow.screen.Screen;
import designs.bookmyshow.theatre.Theatre;

import java.time.Duration;
import java.util.*;

public class BookingSite {
    private MovieStoreFactory factory;

    public static void main(String[] args) {
        BookingSite bookingSite = new BookingSite();
        bookingSite.initializeData();
        Map<String, List<PreppedData>> preppedData = bookingSite.prepareData(Location.JORHAT);

        bookingSite.printInfoForMovie("Sholay", preppedData);
        bookingSite.printInfoForMovie("3 Idiots", preppedData);
    }

    private void printInfoForMovie(String movie, Map<String, List<PreppedData>> preppedData) {
        List<PreppedData> data = preppedData.get(movie);

        data.forEach( pd ->
                System.out.println(" Theatre: " + pd.getTheatre().name() + " Start time: " + pd.getScreen().startTime()));
    }

    private Map<String, List<PreppedData>> prepareData(Location location) {
        MovieStore movieStore = factory.getMovieStore(location);
        Map<String, List<PreppedData>> movieMap = new HashMap<>();

        List<Theatre> theatreList = movieStore.getTheatreList();
        for (Theatre theatre : theatreList) {
            List<Screen> screens = theatre.screenList();
            for (Screen screen : screens) {
                Movie movie = screen.movie();
                List<PreppedData> preppedDataList = movieMap.getOrDefault(movie.getTitle(), new ArrayList<PreppedData>());
                preppedDataList.add(new PreppedData(theatre, screen));
                movieMap.put(movie.getTitle(), preppedDataList);
            }
        }
        return movieMap;
    }

    private void initializeData() {
        // replaced by database

        factory = new MovieStoreFactory();
        MovieStore jorhatMovieStore = factory.getMovieStore(Location.JORHAT);

        Movie sholay = new Movie(1, "Sholay", Duration.ofHours(4));
        Movie three_idiots = new Movie(2, "3 Idiots", Duration.ofHours(3));

        jorhatMovieStore.addTheatre(new Theatre(
                List.of(new Screen(
                                sholay, 1, 1, 9, 13
                        ),
                        new Screen(
                                three_idiots, 1, 1, 14, 17
                        )),
                1,
                1,
                "Eleye hall"
        ));

        jorhatMovieStore.addTheatre(new Theatre(
                List.of(new Screen(
                                sholay, 2, Location.JORHAT.getId(), 10, 14
                        ),
                        new Screen(
                                three_idiots, 2, Location.JORHAT.getId(), 15, 18
                        )),
                Location.JORHAT.getId(),
                2,
                "INOX"
        ));
    }
}


class PreppedData {
    private Theatre theatre;
    private Screen screen;

    public PreppedData(Theatre theatre, Screen screen) {
        this.theatre = theatre;
        this.screen = screen;
    }

    public Theatre getTheatre() {
        return theatre;
    }
    public Screen getScreen() {
        return screen;
    }
}