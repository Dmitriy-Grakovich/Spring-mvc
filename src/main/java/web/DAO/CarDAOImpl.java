package web.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDAOImpl implements CarDAO {

    private List<Car> listCar;

    public CarDAOImpl() {
        listCar = new ArrayList<>();
        listCar.add(new Car(1L, "Lada", 100));
        listCar.add(new Car(2L, "Mazda", 150));
        listCar.add(new Car(3L, "Lexus", 250));
        listCar.add(new Car(4L, "Ferrari", 350));
        listCar.add(new Car(5L, "Bugatti", 600));
    }

    @Override
    public List<Car> getCars(int cars) {
        return listCar.stream().limit(cars).collect(Collectors.toList());
    }
}
