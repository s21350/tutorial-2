package com.company;

public class phone {
    String brand;
    int resolution;
    int number;
    String sms;

    public phone (String brand, int resolution, int number){
        this.brand = brand;
        this.resolution = resolution;
        this.number = number;

    }

    String brand () { return this.brand; }
    int resolution () {return this.resolution;}
    int number () {return this.number;}

    public void SMS(String sms) {
        this.sms += sms;}

    public void sendSMS (String X, int Y) {
        System.out.println ("Send SMS + " +X + "to+ " +Y); }

}
