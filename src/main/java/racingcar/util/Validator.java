package racingcar.util;

import racingcar.racing.Car;

import java.util.List;

public class Validator {
    public static final int STANDARD_NUMBER = 4;

    public static boolean canMove(int randomNumber) {
        return randomNumber >= STANDARD_NUMBER;
    }
}