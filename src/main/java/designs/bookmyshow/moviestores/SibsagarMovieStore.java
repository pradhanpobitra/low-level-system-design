package designs.bookmyshow.moviestores;

import designs.bookmyshow.Location;

public class SibsagarMovieStore extends MovieStore {
    private static SibsagarMovieStore instance;
    public static SibsagarMovieStore getInstance() {
        if(instance == null) {
            instance = new SibsagarMovieStore(Location.SIBSAGAR.getId());
        }
        return instance;
    }

    private SibsagarMovieStore(int id) {
        super(id);
    }

    @Override
    Location getLocation() {
        return Location.SIBSAGAR;
    }
}
