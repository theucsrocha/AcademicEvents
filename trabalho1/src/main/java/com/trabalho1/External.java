package com.trabalho1;
/**
 * Represents an external participant in an event.
 * External participants have an occupation.
 */
public class External extends People {
    private String occupation;

    public External(String name,String occupation){
        super(name);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
}
