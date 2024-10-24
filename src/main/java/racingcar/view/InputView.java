package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.racing.Car;
import racingcar.racing.RacingMessage;
import racingcar.util.Parser;

import java.util.List;

public class InputView {
    public static List<Car> readCarNames() {
        System.out.println(RacingMessage.INPUT_CAR_NAME_MESSAGE);
        String userInput = Console.readLine().trim();

        return Parser.convertInputToCars(userInput);
    }

    public static int readAttemptTimes() {
        System.out.println(RacingMessage.INPUT_ATTEMPT_TIMES_MESSAGE);
        String userInput = Console.readLine().trim();

        return Parser.parseToInteger(userInput);
    }
}