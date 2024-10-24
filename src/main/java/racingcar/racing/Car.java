package racingcar.racing;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getCarName() { return name; }

    public int getPosition() { return position; }

    public String getStatus() {
        return name + " : " + "-".repeat(position);
    }

    public void movePosition() {
        position++;
    }
}