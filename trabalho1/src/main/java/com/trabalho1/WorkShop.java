package com.trabalho1;

import java.time.LocalDate;
/**
 * Represents a Workshop event, which has an apprenticeship area.
 */
public class WorkShop extends Event {
    
    private String apprenticeship;

    public WorkShop(String name, int capacity, LocalDate date,String local,String apprenticeship,boolean isOnline) {
        super(name, capacity, date, local,isOnline);
        this.apprenticeship = apprenticeship;
    }

    public String getApprenticeship() {
        return apprenticeship;
    }

    public void setApprenticeship(String apprenticeship) {
        this.apprenticeship = apprenticeship;
    }


}
