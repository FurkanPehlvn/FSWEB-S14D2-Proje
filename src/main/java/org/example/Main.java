package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

         Wall wall1 = new Wall("Kuzey");
        Wall wall2 = new Wall("Guney");
        Wall wall3 = new Wall("Dogu");
        Wall wall4 = new Wall("Bati");
        Ceiling ceiling= new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("King",4,60,2,1);
        Lamp lamp = new Lamp(LampType.LAVA,true,2);
        Wardrobe wardrobe = new Wardrobe(2,2,45.0);
        Carpet carpet=new Carpet(3,3,PaintColor.GREEN);
        Bedroom bedroom= new Bedroom("King Room",wall1,wall2,wall3,wall4,ceiling,bed,lamp,wardrobe,carpet);

        System.out.println(bedroom);

    }
}