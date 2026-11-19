package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currenVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;

    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
        this.maxVolume = 100;
        this.minVolume = 0;
    }

    public Radio(int stationCount, int volumeCount) {
        this.maxStation = stationCount - 1;
        this.maxVolume = volumeCount - 1;

    }

    public void nex() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void plus() {
        if (currenVolume != maxVolume) {
            currenVolume++;
        }
    }

    public void minus() {
        if (currenVolume != minVolume) {
            currenVolume--;
        } else {
            currenVolume = minVolume;
        }


    }

    public int getCurrenVolume() {

        return currenVolume;
    }

    public void setCurrenVolume(int currenVolume) {
        if (currenVolume < minVolume) {
            currenVolume = minVolume;
        }
        if (currenVolume > maxVolume) {
            currenVolume = maxVolume;
        }
        this.currenVolume = currenVolume;
    }
}

