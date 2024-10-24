package racingcar.racing;

import racingcar.util.InputValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {
    private final Computer computer;

    public RacingController() {
        this.computer = new Computer();
    }

    public void start() {
        initializeGame();

        race();

        announceWinners();
    }

    private void initializeGame() {
        List<Car> cars = InputView.readCarNames();
        int times = InputView.readAttemptTimes();

        InputValidator.validateInputs(cars, times);

        computer.prepareGame(cars, times);
    }

    private void race() {
        OutputView.printResult();
        int totalRounds = computer.getTimes();

        for (int round = 0; round < totalRounds; round++) {
            computer.moveCars();
            OutputView.printRaceStatus(computer.getCars());
        }
    }

    private void announceWinners() {
        List<Car> winners = computer.determineWinners();
        OutputView.printWinners(winners);
    }
}
