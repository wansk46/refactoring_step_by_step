package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PoliceTest
{
    @Test
    void test_whether_driver_is_an_adult(){
        Driver adultDriver = new Driver( 18 );
        Driver notAdultDriver = new Driver( 15 );
        Police police = new Police();



        assertTrue(police.checkDriverAge( adultDriver ));
        assertFalse( police.checkDriverAge( notAdultDriver ) );

    }

}
