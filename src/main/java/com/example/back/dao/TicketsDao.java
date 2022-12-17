package com.example.back.dao;

import com.example.back.pojo.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketsDao extends JpaRepository<Tickets, Integer> {
    List<Tickets> findAll();
}
