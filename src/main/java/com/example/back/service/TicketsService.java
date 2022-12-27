package com.example.back.service;

import com.example.back.dao.TicketsDao;
import com.example.back.pojo.Tickets;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.domain.Sort.Direction.ASC;
import static org.springframework.data.domain.Sort.Direction.DESC;

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
    public Page<Tickets> listByStationAndPage(int pageNum,int pageSize,String startStation, String endStation, boolean isQuick){
        Sort sort = Sort.by(ASC,"id");
        Pageable page = PageRequest.of(pageNum,pageSize,sort);
        String s = "^[A-Z]";
        if(isQuick) {
            s = "G|D";
        }
        return ticketsDao.findByStationAndPages(page,startStation, endStation, s);
    }
}
