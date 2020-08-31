package com.sp.exc.dto;


public class Araba {
    private String isim;
    private String marka;
    private int fiyat;

    public Araba(){

    }
    public Araba(String isim, String marka, int fiyat) {
        this.isim = isim;
        this.marka = marka;
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
