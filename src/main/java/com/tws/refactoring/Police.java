package com.tws.refactoring;

public class Police {
    private int AdultAge = 18;
    public boolean checkDriverAge(Driver driver) {
        return driver.getAge() >= AdultAge ;
    }
}
