package com.trabalho1;

public class Teacher extends People {

    private String specionalization;

    public Teacher(String name, String specionalization){
        super(name);
        this.specionalization = specionalization;

    }

    public String getSpecionalization() {
        return specionalization;
    }

    public void setSpecionalization(String specionalization) {
        this.specionalization = specionalization;
    }
    
}
