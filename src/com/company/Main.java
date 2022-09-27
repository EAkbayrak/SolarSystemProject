package com.company;

public class Main {
    public static void main(String[] args) {

        SolarSystem inception = new SolarSystem();
        inception.Sun=1;
        inception.Planets=2;
        inception.Moon=3;

        System.out.println("The basic structure is ready");

        SUN d = new SUN();

        d.radius = 212312312;
        d.colour = "red";
        d.temp = "very hot";
        d.lol = "lollol";
    }
}
