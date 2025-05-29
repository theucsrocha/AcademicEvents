package com.trabalho1;

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
