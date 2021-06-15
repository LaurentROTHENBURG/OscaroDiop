package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.OrderLine;
import com.example.oscarodiop.repositories.OrderLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/orderline")
public class OrderLineController {
    @Autowired
    private OrderLineRepository orderLineRepository;

    @GetMapping("/{orderId}")
    public List<OrderLine> getOrderLinesById(@PathVariable Long orderId){
        return orderLineRepository.findAllByOrder_Id(orderId);
    }

    @PutMapping ("/update")
    public OrderLine updateOrderById(@RequestBody OrderLine orderLine){
        return orderLineRepository.save(orderLine);
    }

    @DeleteMapping("/deleteline/{id}")
    public void deleteOrderLineById(@PathVariable Long id){
        orderLineRepository.deleteById(id);
    }

    @DeleteMapping("/delete/{orderId}")
    public void deleteOrderLineByOrderId(@PathVariable Long orderId){
        orderLineRepository.deleteAllByOrder_Id(orderId);
    }

    @PostMapping
    public OrderLine saveOrderLine(@RequestBody OrderLine orderLine){
        return orderLineRepository.save(orderLine);
    }
}
