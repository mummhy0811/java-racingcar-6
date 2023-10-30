package racingcar.domain;

import racingcar.util.Constant;

public class Car {
    String name;
    String score;

    public Car(String name, String score){
        this.name = name;
        this.score = score;
    }

    public void addScore() {
        this.score = score+ Constant.POSITION_SYMBOL;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }
}