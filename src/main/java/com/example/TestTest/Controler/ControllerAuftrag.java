package com.example.TestTest.Controler;

import com.example.TestTest.model.Auftrag;
import com.example.TestTest.model.MoneyOverview;
import com.example.TestTest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerAuftrag {
    @Autowired
    OrderService orderService;

    @GetMapping("/Auftrag/{kundeNummer}")
    public List<Auftrag> show(@PathVariable Integer kundeNummer, @RequestParam(value = "indexAll", required = false) boolean index) {
        if (index) {
            return orderService.ShowAll();
        }
        return orderService.byId(kundeNummer);
    }

    @GetMapping("/Auftrag/last10Years")
    public List<Auftrag> show() {
        return orderService.last10Years(orderService.last10(10));
    }

    @GetMapping("/Auftrag/zahl/{jahr}")
    public MoneyOverview overview(@PathVariable Integer jahr) {
        return orderService.calculate(jahr);
    }
}


