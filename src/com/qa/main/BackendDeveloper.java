package com.qa.main;

public class BackendDeveloper implements Developer {
    @Override
    public void doWork() {
        writeJava();
    }

    public void writeJava() {
        System.out.println("ay look at me i am a java dev lol");
    }

}