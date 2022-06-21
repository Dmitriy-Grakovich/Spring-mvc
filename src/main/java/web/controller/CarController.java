package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.models.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String carsCount(HttpServletRequest request, Model model) {
        List<Car> listCar;
        try {
            Integer count = Integer.parseInt(request.getParameter("count"));
            if (count >= 5) {
                listCar = carService.getCars(5);
            } else {
                listCar = carService.getCars(count);
            }
        } catch (RuntimeException e) {
            listCar = carService.getCars(5);
        }
        model.addAttribute("carList", listCar);
        return "cars";
    }
}
