package ru.netology.services;

public class Radio {

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;


    public Radio(int newMaxRadioStation) {
        this.maxRadioStation = newMaxRadioStation - 1;
    }

    public Radio() {
    }

    public int setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        return currentVolume;
    }


    public int setCurrentRadioStation(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
        return currentRadioStation;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int nextStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }

    public int prevStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
        return currentRadioStation;
    }
}