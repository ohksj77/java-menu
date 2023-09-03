package menu.io;

import menu.domain.CoachList;

import java.util.Arrays;
import java.util.function.Supplier;

public class InputManager {
    private static final String SPLITTER = ",";
    private final InputView inputView;

    public InputManager(final InputView inputView) {
        this.inputView = inputView;
    }

    public CoachList readCoach() {
        return read(() -> new CoachList(Arrays.asList(inputView.readCoach().split(SPLITTER))));
    }

    private <T> T read(final Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (final IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
