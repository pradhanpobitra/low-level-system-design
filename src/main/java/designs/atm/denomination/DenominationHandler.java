package designs.atm.denomination;

import static java.lang.Math.min;

public abstract class DenominationHandler {
    private final int denomination;
    private int noteCount;
    private final DenominationHandler next;

    public DenominationHandler(int denomination, int noteCount, DenominationHandler next) {
        this.denomination = denomination;
        this.noteCount = noteCount;
        this.next = next;
    }

    public void handle(int amount) {
        if(amount == 0) return;
        int notesRequired = min(amount / denomination, noteCount);
        if(amount >= denomination && noteCount != 0) {
            System.out.println(denomination + " notes dispatched: " +  notesRequired);
            noteCount -= notesRequired;
        }
        if(next != null) {
            next.handle(amount - notesRequired * denomination);
        }
    }
}
