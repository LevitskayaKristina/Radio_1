package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currenVolume;

    public void nex() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void plus() {
        if (currenVolume != 100) {
            currenVolume++;
        }
    }

    public void minus() {
        if (currenVolume != 0) {
            currenVolume--;
        } else {
            currenVolume = 0;
        }


    }

    public int getCurrenVolume() {

        return currenVolume;
    }

    public void setCurrenVolume(int currenVolume) {
        if (currenVolume < 0) {
            currenVolume = 0;
        }
        if (currenVolume > 100) {
            currenVolume = 100;
        }
        this.currenVolume = currenVolume;
    }
}

