/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.icetask7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class ReservationTest {
    /**
     * Test of checkBookingCode method, of class Reservation.
     */
    //Test Valid Booking Code
    @Test
    public void testValidBookingCode() {
        System.out.println("checkBookingCode");
        String bookingcode = "Event_123";
        Reservation instance = new Reservation();
        boolean expResult = true;
        boolean result = instance.checkBookingCode(bookingcode);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPasswordComplexity method, of class Reservation.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        Reservation instance = new Reservation();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeReservation method, of class Reservation.
     */
    @Test
    public void testMakeReservation() {
        System.out.println("makeReservation");
        String bookingcode = "";
        String password = "";
        Reservation instance = new Reservation();
        String expResult = "";
        String result = instance.makeReservation(bookingcode, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
