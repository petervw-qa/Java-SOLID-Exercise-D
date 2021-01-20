package com.qa.main;

public class FrontendDeveloper implements Developer {
    @Override
    public void doWork() {
        writeHTML();
    }

    public void writeHTML() {
        System.out.println("I'm wasting time... all this is done server side anyways >:( ");
    }

}