package com.example.demo.agent;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class AgentService {

    public List<Agent> getAgents() {
        return List.of(
                new Agent(
                        1L,
                        "Liam Byrne",
                        "Brimstone - Controller",
                        "Human",
                        LocalDate.of(1976, Month.SEPTEMBER, 7),
                        46
                ),
                new Agent(
                        2L,
                        "Unknown",
                        "Omen - Controller",
                        "Radiant",
                        LocalDate.of(1992, Month.NOVEMBER, 1),
                        30
                )
        );
    }
}
