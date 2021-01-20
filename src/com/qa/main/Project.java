package com.qa.main;

import java.util.List;

public class Project {
    private List<Developer> developers;

    public Project(List<Developer> devs) {
        this.developers = devs;
    }

    public void implement() {
        for (Developer d: developers) {
        	d.doWork();      
        }
    }
}