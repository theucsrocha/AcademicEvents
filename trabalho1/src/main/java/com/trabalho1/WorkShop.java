package com.trabalho1;

import java.time.LocalDate;

public class WorkShop extends Event {
    
    private String apprenticeship;

    public WorkShop(String name, int capacity, LocalDate date,String local,String apprenticeship) {
        super(name, capacity, date, local);
        this.apprenticeship = apprenticeship;
    }

    public String getApprenticeship() {
        return apprenticeship;
    }

    public void setApprenticeship(String apprenticeship) {
        this.apprenticeship = apprenticeship;
    }


}
