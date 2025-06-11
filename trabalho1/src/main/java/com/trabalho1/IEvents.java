package com.trabalho1;
/**
 * Interface that defines the basic operations for academic events.
 */
public interface IEvents {

    public int registerPeople(People p);
    public boolean isEmpty();
    public boolean isFull();
    public void report();

}