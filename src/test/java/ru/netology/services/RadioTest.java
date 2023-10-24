package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "2, 1",
            "31, 30",
            "99, 98",
            "100, 99",
            "100, 100"
    })
    public void increaseVolumeTest(int expected, int currentVolume) {
        Radio radio = new Radio();
        currentVolume = radio.setCurrentVolume(currentVolume);
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "0, 1",
            "1, 2",
            "30, 31",
            "98, 99",
            "99, 100"
    })
    public void decreaseVolumeTest(int expected, int currentVolume) {
        Radio radio = new Radio();
        currentVolume = radio.setCurrentVolume(currentVolume);
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "2, 1",
            "5, 4",
            "9, 8",
            "0, 9"
    })
    public void nextRadioStationTest(int expected, int currentRadioStation) {
        Radio radio = new Radio();
        currentRadioStation = radio.setCurrentRadioStation(currentRadioStation);
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "4, 5",
            "8, 9",
            "9, 0"
    })
    public void prevRadioStationTest(int expected, int currentRadioStation) {
        Radio radio = new Radio();
        currentRadioStation = radio.setCurrentRadioStation(currentRadioStation);
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);
    }

}