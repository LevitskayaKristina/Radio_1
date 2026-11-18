package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void test(){
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.nex();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public  void testPlus(){
        Radio radio= new Radio();
        radio.setCurrenVolume(5);
        radio.plus();
        Assertions.assertEquals(6, radio.getCurrenVolume());
    }

    @Test
    public void test_1(){
        Radio radio = new Radio(20, 102);
        radio.setCurrentStation(15);
        radio.setCurrenVolume(5);
        Assertions.assertEquals(15, radio.getCurrentStation());
        Assertions.assertEquals(5, radio.getCurrenVolume());

    }
}