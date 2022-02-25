package com.company;

public enum Oblast {
    BATKEN("Orukzar"),
    NARIN("Tenir Too"),
    OSH("Kerme Too"),
    TALAS("Manas"),
    JALALABAD("Arslanbab"),
    YSYKKOL("Kyrgyz Bermeti"),
    CHUI("Sary Ozon");

    private String ozgocholuk;

    Oblast(){
        //empty constructor
    }

    Oblast(String ozgocholuk){
        this.ozgocholuk = ozgocholuk;
    }

    public String getOzgocholuk() {
        return ozgocholuk;
    }

    public void setOzgocholuk(String ozgocholuk) {
        this.ozgocholuk = ozgocholuk;
    }

    @Override
    public String toString() {
        return "Oblast{" +
                "ozgocholuk='" + ozgocholuk + '\'' +
                '}';
    }
}
