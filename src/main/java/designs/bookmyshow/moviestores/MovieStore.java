package designs.bookmyshow.moviestores;

import designs.bookmyshow.Location;
import designs.bookmyshow.theatre.Theatre;

import java.util.ArrayList;
import java.util.List;

public abstract class MovieStore {
    private int id;
    private List<Theatre> theatreList;

    protected MovieStore(int id) {
        this.id = id;
        this.theatreList = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre) {
        this.theatreList.add(theatre);
    }

    public void removeTheatre(Theatre theatre) {
        this.theatreList.remove(theatre);
    }

    public List<Theatre> getTheatreList() {
        return theatreList;
    }

    abstract Location getLocation();
}
