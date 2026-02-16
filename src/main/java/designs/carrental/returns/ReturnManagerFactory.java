package designs.carrental.returns;

import designs.carrental.location.Location;

import java.util.Objects;

public class ReturnManagerFactory {

    public ReturnManager getReturnManager(Location location) {
        if (Objects.equals(location.getCity(), "Pune")) {
            return new PuneReturnManager();
        } else if (Objects.equals(location.getCity(), "Mumbai")) {
            return new MumbaiReturnManager();
        }
        return null;
    }
}
