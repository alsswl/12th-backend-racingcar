package racingcar;

public class AnswerPrinter {

    public void printEffect(Car[] racingCars) {
        for (int i = 0; i < racingCars.length; i++) {
            System.out.println(racingCars[i].expressCarInfoToString());
        }
        System.out.println();
    }

}