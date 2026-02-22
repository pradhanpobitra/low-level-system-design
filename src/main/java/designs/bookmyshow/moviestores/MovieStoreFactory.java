package designs.bookmyshow.moviestores;

import designs.bookmyshow.Location;

public class MovieStoreFactory {

    public MovieStore getMovieStore(Location location) {
        if(location == Location.MORANHAT) {
            return MoranhatMovieStore.getInstance();
        } else if(location == Location.JORHAT) {
            return JorhatMovieStore.getInstance();
        } else if(location == Location.SIBSAGAR) {
            return SibsagarMovieStore.getInstance();
        }
        return null;
    }
}
