package designs.bookmyshow.moviestores;

import designs.bookmyshow.Location;

public class MoranhatMovieStore extends MovieStore {

    private static MoranhatMovieStore instance;
    public static MoranhatMovieStore getInstance() {
        if(instance == null) {
            instance = new MoranhatMovieStore(Location.MORANHAT.getId());
        }
        return instance;
    }

    private MoranhatMovieStore(int id) {
        super(id);
    }

    @Override
    Location getLocation() {
        return Location.MORANHAT;
    }
}
