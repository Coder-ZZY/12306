package com.example.back.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "tickets")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    String trainNum;
    String startStation;
    String endStation;
    Time startTime;
    Time endTime;
    Time totalTime;
    String arrive;
    String principalSeat;
    String fristSeat;
    String secondSeat;
    String advancedSleeper;
    String fristSleeper;
    String dongSleeper;
    String secondSleeper;
    String softSeat;
    String hardSeat;
    String noSeat;
    String other;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Time getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Time totalTime) {
        this.totalTime = totalTime;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getPrincipalSeat() {
        return principalSeat;
    }

    public void setPrincipalSeat(String principalSeat) {
        this.principalSeat = principalSeat;
    }

    public String getFristSeat() {
        return fristSeat;
    }

    public void setFristSeat(String fristSeat) {
        this.fristSeat = fristSeat;
    }

    public String getSecondSeat() {
        return secondSeat;
    }

    public void setSecondSeat(String secondSeat) {
        this.secondSeat = secondSeat;
    }

    public String getAdvancedSleeper() {
        return advancedSleeper;
    }

    public void setAdvancedSleeper(String advancedSleeper) {
        this.advancedSleeper = advancedSleeper;
    }

    public String getFristSleeper() {
        return fristSleeper;
    }

    public void setFristSleeper(String fristSleeper) {
        this.fristSleeper = fristSleeper;
    }

    public String getDongSleeper() {
        return dongSleeper;
    }

    public void setDongSleeper(String dongSleeper) {
        this.dongSleeper = dongSleeper;
    }

    public String getSecondSleeper() {
        return secondSleeper;
    }

    public void setSecondSleeper(String secondSleeper) {
        this.secondSleeper = secondSleeper;
    }

    public String getSoftSeat() {
        return softSeat;
    }

    public void setSoftSeat(String softSeat) {
        this.softSeat = softSeat;
    }

    public String getHardSeat() {
        return hardSeat;
    }

    public void setHardSeat(String hardSeat) {
        this.hardSeat = hardSeat;
    }

    public String getNoSeat() {
        return noSeat;
    }

    public void setNoSeat(String noSeat) {
        this.noSeat = noSeat;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
