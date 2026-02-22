package designs.bookmyshow.theatre;

import designs.bookmyshow.screen.Screen;

import java.util.List;

public record Theatre(
    List<Screen> screenList,
    int cityId,
    int id,
    String name
) {
    public void addScreen(Screen screen) {
        screenList.add(screen);
    }

    public void removeScreen(Screen screen) {
        screenList.remove(screen);
    }
}
