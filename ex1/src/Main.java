import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Car1", 1923);
        Car c2 = new Car("Car2", 1912);
        Car c3 = new Car("Car3", 1924);
        Car c4 = new Car("Car4", 2013);
        Car c5 = new Car("Car5", 1993);
        Car c6 = new Car("Car6", 1951);
        Car c7 = new Car("Car7", 2023);
        Car c8 = new Car("Car8", 2000);
        Car c9 = new Car("Car9", 2001);
        Car c10 = new Car("Car10", 1999);

        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);


        Collections.sort(cars);
        for (Car each : cars)
            System.out.printf(each.name, each.productionYear);
    }
}