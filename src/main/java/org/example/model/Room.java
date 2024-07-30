package org.example.model;

public class Room {
    private String name;
    private Wall Wall1;
    private Wall Wall2;
    private Wall Wall3;
    private Wall Wall4;
    private Ceiling ceiling;
    private Carpet carpet;


    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Carpet carpet) {
        this.name = name;
        Wall1 = wall1;
        Wall2 = wall2;
        Wall3 = wall3;
        Wall4 = wall4;
        this.ceiling = ceiling;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return Wall1;
    }

    public Wall getWall2() {
        return Wall2;
    }

    public Wall getWall3() {
        return Wall3;
    }

    public Wall getWall4() {
        return Wall4;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", wall1=" + getWall1() +
                ", wall2=" + getWall2() +
                ", wall3=" + getWall3() +
                ", wall4=" +getWall4() +
                ", ceiling=" + ceiling +
                ", carpet=" + carpet +
                '}';
    }
}
