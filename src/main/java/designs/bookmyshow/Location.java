package designs.bookmyshow;

public enum Location {
    MORANHAT(1),
    JORHAT(2),
    SIBSAGAR(3);

    private int id;
    Location(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
