package pro.calculatorcalculatorpro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final Service service;
    public Controller(Service service) {
        this.service = service;
    }
    @GetMapping
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        int result = service.sum(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }
    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        int result = service.substract(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = service.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }
    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if(num2 ==0) {
            return " Второй аргумент 0, на 0 делить нельзя";
        }
        float result = service.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;

    }
}
