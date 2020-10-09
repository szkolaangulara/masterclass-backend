package szkolaangulara.com.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cars")
public class CarsRestResource {

    @GetMapping("dashboard")
    public List<Car> fetchDashboardCars() {
        return prepareDashboardResponse();
    }

    @GetMapping("top")
    public List<Car> fetchTopCars() {
        return prepareTopResponse();
    }

    @GetMapping("best")
    public List<Car> fetchBestCars() {
        return prepareBestResponse();
    }

    @GetMapping("top-external")
    public List<CarTop> fetchTopExternalCars() {
        return prepareTopExternalResponse();
    }

    @GetMapping("best-external")
    public List<CarBest> fetchBestExternalCars() {
        return prepareBestExternalResponse();
    }


    private List<Car> prepareDashboardResponse() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Audi", "RS7", 560726, "https://www.szkolaangulara.pl/wp-content/uploads/2020/05/3-small.jpeg"));
        cars.add(new Car("Mercedes", "GTR", 897654, "https://www.szkolaangulara.pl/wp-content/uploads/2020/05/4-small.jpeg"));
        cars.add(new Car("Audi", "A3", 150450, "https://www.szkolaangulara.pl/wp-content/uploads/2020/05/5-small.jpeg"));

        return cars;
    }

    private List<Car> prepareTopResponse() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Mercedes", "Klasa G", 1250650, "https://www.szkolaangulara.pl/wp-content/uploads/2020/05/6-small.jpeg"));
        cars.add(new Car("BMW", "Seria 3", 50450, "https://www.szkolaangulara.pl/wp-content/uploads/2020/05/7-small.jpeg"));
        cars.add(new Car("Nissan", "370z", 130850, "https://www.szkolaangulara.pl/wp-content/uploads/2020/05/8-small.jpeg"));

        return cars;
    }

    private List<Car> prepareBestResponse() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Mercedes", "Klasa A", 1250650, "https://www.szkolaangulara.pl/wp-content/uploads/2020/01/mercedesA.jpg"));
        cars.add(new Car("BMW", "Seria 4", 150450, "https://www.szkolaangulara.pl/wp-content/uploads/2020/01/bmw4.jpg"));
        cars.add(new Car("Audi", "A6", 230850, "https://www.szkolaangulara.pl/wp-content/uploads/2020/01/a6-1.jpg"));

        return cars;
    }

    private List<CarBest> prepareBestExternalResponse() {
        List<CarBest> cars = new ArrayList<>();

        cars.add(new CarBest("Mercedes", "Klasa A", 1250650, "https://www.szkolaangulara.pl/wp-content/uploads/2020/01/mercedesA.jpg"));
        cars.add(new CarBest("BMW", "Seria 4", 150450, "https://www.szkolaangulara.pl/wp-content/uploads/2020/01/bmw4.jpg"));
        cars.add(new CarBest("Audi", "A6", 230850, "https://www.szkolaangulara.pl/wp-content/uploads/2020/01/a6-1.jpg"));

        return cars;
    }

    private List<CarTop> prepareTopExternalResponse() {
        List<CarTop> cars = new ArrayList<>();

        cars.add(new CarTop("Mercedes", "Klasa G", 1250650, "https://www.szkolaangulara.pl/wp-content/uploads/2020/05/6-small.jpeg"));
        cars.add(new CarTop("BMW", "Seria 3", 50450, "https://www.szkolaangulara.pl/wp-content/uploads/2020/05/7-small.jpeg"));
        cars.add(new CarTop("Nissan", "370z", 130850, "https://www.szkolaangulara.pl/wp-content/uploads/2020/05/8-small.jpeg"));

        return cars;
    }

}
