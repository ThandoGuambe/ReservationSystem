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
    //Test Invalid Booking Code
    @Test
    public void testInvalidBookingCode() {
        System.out.println("checkBookingCode");
        String bookingcode = "Event.7!";
        Reservation instance = new Reservation();
        boolean expResult = false;
        boolean result = instance.checkBookingCode(bookingcode);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPasswordComplexity method, of class Reservation.
     */
    //Test Valid Password
    @Test
    public void testValidPassword() {
        System.out.println("checkPasswordComplexity");
        String password = "Password1!";
        Reservation instance = new Reservation();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }
    //Test Invalid Password
    @Test
    public void testInvalidPassword() {
        System.out.println("checkPasswordComplexity");
        String password = "Password";
        Reservation instance = new Reservation();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }
    /**
     * Test of makeReservation method, of class Reservation.
     */
    //Valid Reservation.
    @Test
    public void testValidReservation() {
        System.out.println("makeReservation");
        String bookingcode = "Event_123";
        String password = "Password1!";
        Reservation instance = new Reservation();
        String expResult = "Reservation successfully made!";
        String result = instance.makeReservation(bookingcode, password);
        assertEquals(expResult, result);
    }
     //Invalid Reservation. [Invalid Booking Code]
    @Test
    public void testInvalidReservation1() {
        System.out.println("makeReservation");
        String bookingcode = "Event.7!!";
        String password = "Password1!";
        Reservation instance = new Reservation();
        String expResult = "Booking code is incorrectly formatted.";
        String result = instance.makeReservation(bookingcode, password);
        assertEquals(expResult, result);
    }
     //Invalid Reservation. [Invalid password
    @Test
    public void testInvalidReservation2() {
        System.out.println("makeReservation");
        String bookingcode = "Event_123";
        String password = "Password";
        Reservation instance = new Reservation();
        String expResult = "Password does not meet the complexity requirements.";
        String result = instance.makeReservation(bookingcode, password);
        assertEquals(expResult, result);
    }
}
