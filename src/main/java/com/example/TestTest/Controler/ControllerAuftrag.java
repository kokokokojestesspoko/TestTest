package com.example.TestTest.Controler;

import com.example.TestTest.model.Overview;
import com.example.TestTest.repo.AuftragRepository;
import com.example.TestTest.model.Auftrag;

import com.example.TestTest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class ControllerAuftrag {
    @Autowired
    OrderService orderService;


  //  @GetMapping("/Overview")
  //  public List<Overview> Overview() {
   //     return orderService.getDataOrders();
   // }

    @GetMapping("/Auftrag/{kundeNummer}")
    public List<Auftrag> show(@PathVariable Integer kundeNummer, @RequestParam(value = "indexAll", required = false) boolean index) {
        if (index) {
            return orderService.ShowAll();
        }


        return orderService.byId(kundeNummer);
    }
    @GetMapping("/Auftrag/last10Years")
    public List<Auftrag> show(){
            return orderService.last10Years(orderService.last10());
        }
    }

