package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(-1);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(10);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }



    @Test
    public void testNext(){
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.nex();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testNegativMaxStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nex();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetValidVolume() {
        Radio radio = new Radio();
        radio.setCurrenVolume(50);

        Assertions.assertEquals(50, radio.getCurrenVolume());
    }

    @Test
    public void shouldClampVolumeBelowMinToMin() {
        Radio radio = new Radio();
        radio.setCurrenVolume(-1);

        Assertions.assertEquals(0, radio.getCurrenVolume());
    }

    @Test
    public void shouldClampVolumeAboveMaxToMax() {
        Radio radio = new Radio();
        radio.setCurrenVolume(101);

        Assertions.assertEquals(100, radio.getCurrenVolume());
    }


    @Test
    public  void testPlus(){
        Radio radio= new Radio();
        radio.setCurrenVolume(5);
        radio.plus();
        Assertions.assertEquals(6, radio.getCurrenVolume());
    }
    @Test
    public  void testMinus(){
        Radio radio= new Radio();
        radio.setCurrenVolume(5);
        radio.minus();
        Assertions.assertEquals(4, radio.getCurrenVolume());
    }

    @Test
    public  void testMinusMin(){
        Radio radio= new Radio();
        radio.setCurrenVolume(0);
        radio.minus();
        Assertions.assertEquals(0, radio.getCurrenVolume());
    }

    @Test
    public void testPrev(){
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void testPrevMinSt(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testStVo(){
        Radio radio = new Radio(20, 102);
        radio.setCurrentStation(15);
        radio.setCurrenVolume(5);
        Assertions.assertEquals(15, radio.getCurrentStation());
        Assertions.assertEquals(5, radio.getCurrenVolume());

    }

    @Test
    public void shouldSetCustomLimitsViaParameterizedConstructor() {
        Radio radio = new Radio(20, 50);

        radio.setCurrentStation(19);
        Assertions.assertEquals(19, radio.getCurrentStation());

        radio.nex();
        Assertions.assertEquals(0, radio.getCurrentStation());

        radio.setCurrenVolume(49);
        Assertions.assertEquals(49, radio.getCurrenVolume());

        radio.plus();
        Assertions.assertEquals(49, radio.getCurrenVolume());
    }
}