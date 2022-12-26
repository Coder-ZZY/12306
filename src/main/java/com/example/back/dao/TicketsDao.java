package com.example.back.dao;

import com.example.back.pojo.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketsDao extends JpaRepository<Tickets, Integer> {
    List<Tickets> findAll();
    @Query(value = "select * from tickets where start_station like concat(?1,'%') and " +
            "end_station like concat(?2,'%') and train_num regexp ?3", nativeQuery = true)
    List<Tickets> findByStation(String startStation, String endStation, String quick);
}
