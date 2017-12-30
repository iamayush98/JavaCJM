package com.imayush;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("North") ;
        Wall wall2 = new Wall("East") ;
        Wall wall3 = new Wall("West") ;
        Wall wall4 = new Wall("South") ;

        Celing ceiling = new Celing(15,"Blue") ;

        Bed bed = new Bed("Modern",2,5,1,1) ;

        Lamp lamp = new Lamp("Classic",true,500) ;

        Bedroom bedroom = new Bedroom("Ayush's",wall1,wall2,wall3,wall4,ceiling,bed,lamp) ;

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
