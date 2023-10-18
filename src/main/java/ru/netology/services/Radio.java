package ru.netology.services;

    public class Radio {
        public int currentVolume;
        public int currentRadioStation;

        public int increaseVolume() {
            if (currentVolume < 100) {
                currentVolume = currentVolume + 1;
            }
            return currentVolume;
        }

        public int decreaseVolume() {
            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            }
            return currentVolume;
        }

        public int nextStation() {
            if (currentRadioStation < 9) {
                currentRadioStation = currentRadioStation + 1;
            } else {
                currentRadioStation = 0;
            }
            return currentRadioStation;
        }

        public int prevStation() {
            if (currentRadioStation > 0) {
                currentRadioStation = currentRadioStation - 1;
            } else {
                currentRadioStation = 9;
            }
            return currentRadioStation;
        }
    }