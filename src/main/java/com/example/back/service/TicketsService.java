package com.example.back.service;

import com.example.back.dao.TicketsDao;
import com.example.back.pojo.Tickets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketsService {
    @Autowired
    TicketsDao ticketsDao;

    public List<Tickets> list() {
        return ticketsDao.findAll();
    }

    public List<Tickets> listByStation(String startStation, String endStation, boolean isQuick) {
        String s = "^[A-Z]";
        if(isQuick) {
            s = "G|D";
        }
        return ticketsDao.findByStation(startStation, endStation, s);
    }
}
