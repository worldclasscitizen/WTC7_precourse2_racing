package racingcar.view;

import racingcar.racing.Car;
import racingcar.racing.RacingMessage;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static void printResult() {
        System.out.println("\n" + RacingMessage.EXECUTION_RESULT_MESSAGE);
    }

    public static void printWinners(List<Car> winners) {
        String winnerNames = winners.stream()
                .map(Car::getCarName)
                .collect(Collectors.joining(", "));

        System.out.println(RacingMessage.FINAL_WINNER_MESSAGE + winnerNames);
    }
}