package org.example.model;

public class Bedroom extends Room{

    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Carpet carpet, Bed bed, Lamp lamp, Wardrobe wardrobe) {
        super(name, wall1, wall2, wall3, wall4, ceiling, carpet);
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
    }


    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }


    public String toString() {
        return "Bedroom{" +
                "name='" + getName() + '\'' +
                ", wall1=" + getWall1() +
                ", wall2=" + getWall2() +
                ", wall3=" + getWall3() +
                ", wall4=" + getWall4() +
                ", ceiling=" + getCeiling() +
                ", carpet=" + getCarpet() +
                ", bed=" + bed +
                ", lamp=" + lamp +
                ", wardrobe=" + wardrobe +
                '}';
    }

}
