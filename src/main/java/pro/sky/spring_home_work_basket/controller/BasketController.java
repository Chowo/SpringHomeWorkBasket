package pro.sky.spring_home_work_basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.spring_home_work_basket.service.BasketService;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }


    @GetMapping(value = "/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        basketService.add(ids);
    }


    @GetMapping(value = "/get")
    public List<Integer> get() {
        return basketService.get();
    }


}
