package com.example.oscarodiop.repositories;

import com.example.oscarodiop.models.Order;
import com.example.oscarodiop.models.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
@Modifying
 void deleteOrderById(Long id);


    @Modifying

    @Query("select ol from Order o join OrderLine ol on o.id = ol.order.id where o.id = :id")
    List<OrderLine> findByCustomer(Long id);

    List<Order> findOrdersByOrderDateBetween(LocalDate startDate, LocalDate endDate);


    //a verifier avec les autres
    //Récupère l'ensemble des commandes par Modele entre 2 dates
    @Query(value ="select m.name Model,order_date,count( orders.id) NbCommande, count( customer_id) NbClient\n" +
            "from orders join order_line ol on orders.id = ol.order_id\n" +
            "join part p on ol.part_id = p.id\n" +
            "join model m on m.id = p.model_id\n" +
            "where  order_date BETWEEN :fromDate and :toDate and m.id=:modelId \n" +
            "group by m.name,order_date",nativeQuery = true )
    List<String> getOrdersByDateAndModel(Long modelId,LocalDate fromDate, LocalDate toDate);


   @Query(value ="select b.name Marque,order_date,count( orders.id) NbCommande, count( customer_id) NbClient\n" +
           "from orders join order_line ol on orders.id = ol.order_id\n" +
           "            join part p on ol.part_id = p.id\n" +
           "            join model m on m.id = p.model_id\n" +
           "join brand b on b.id = m.brand_id\n" +
           "where  order_date BETWEEN :fromDate and :toDate and b.id= :brandId\n" +
           "group by b.name,order_date",nativeQuery = true )
   List<String> getOrdersByDateAndBrand(Long brandId,LocalDate fromDate, LocalDate toDate);
}
