package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.Order;
import com.example.oscarodiop.models.OrderLine;
import com.example.oscarodiop.models.PartGroup;
import com.example.oscarodiop.repositories.OrderLineRepository;
import com.example.oscarodiop.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("admin/order")
public class OrderController {
    private OrderRepository orderRepository;
    @Autowired
    private OrderLineRepository orderLineRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public List<Order> getAllOrder(){
     return   orderRepository.findAll();
    }

    @PostMapping
    public Long createOrder(@RequestBody Order order){
        return   orderRepository.save(order).getId();
    }



    @Transactional
    @DeleteMapping("{id}")
    public void deleteOrder(@PathVariable Long id){
        orderLineRepository.deleteAllByOrder_Id(id);
        orderRepository.deleteOrderById(id);
    }

    @GetMapping("/clientId")
    public List<OrderLine> GetIOrderByClient(@RequestParam Long clientId){
        return orderRepository.findByCustomer(clientId);
    }

    @GetMapping("/OrderDate")
        public List<Order> GetOrderBetweenDate(@RequestParam LocalDate startDate,@RequestParam LocalDate endDate){
        return orderRepository.findOrdersByOrderDateBetween(startDate,endDate);
        }

        //a verifier avec les autres
    @GetMapping("/OrderDateModel/{id}")
    public List<String> GetOrdersByModelBetweenDate(@PathVariable Long id,
                                                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate){
        return orderRepository.getOrdersByDateAndModel(id,startDate,endDate);
    }

    @GetMapping("/OrderDateBrand/{id}")
    public List<String> GetOrdersByBrandBetweenDate(@PathVariable Long id,
                                                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate){
        return orderRepository.getOrdersByDateAndBrand(id,startDate,endDate);
    }


}
