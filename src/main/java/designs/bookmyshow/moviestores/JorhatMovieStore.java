package designs.bookmyshow.moviestores;

import designs.bookmyshow.Location;

public class JorhatMovieStore extends MovieStore {
    private static JorhatMovieStore instance;
    public static JorhatMovieStore getInstance() {
        if(instance == null) {
            instance = new JorhatMovieStore(Location.JORHAT.getId());
        }
        return instance;
    }

    private JorhatMovieStore(int id) {
        super(id);
    }

    @Override
    Location getLocation() {
        return Location.JORHAT;
    }
}
