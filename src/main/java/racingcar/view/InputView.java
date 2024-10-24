package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.racing.Car;
import racingcar.racing.RacingMessage;

import java.util.List;

public class InputView {
    public static String readCarNames() {
        System.out.println(RacingMessage.INPUT_CAR_NAME_MESSAGE);
        String userInput = Console.readLine().trim();

        return userInput;
    }

    public static String readAttemptTimes() {
        System.out.println(RacingMessage.INPUT_ATTEMPT_TIMES_MESSAGE);
        String userInput = Console.readLine().trim();

        return userInput;
    }
}