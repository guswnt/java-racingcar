package step6.view;

import step6.domain.Car;
import step6.domain.Cars;

public class ResultView {
    private static final String GUIDE_MESSAGE = "실행 결과";
    public static void printCurrentPosition(Cars cars) {
        for (Car car: cars.getCars()) {
            System.out.print(car.getCarName() + ": " + car.getPosition());
            System.out.println();
        }
    }

    public static void printResultGuideMessage() {
        System.out.println(GUIDE_MESSAGE);
    }
}
