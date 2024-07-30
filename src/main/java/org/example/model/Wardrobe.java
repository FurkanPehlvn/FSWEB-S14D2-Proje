package org.example.model;

public class Wardrobe {
    private int width;
    private int height;
    private double weight;

    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }
    public String toString() {
        return "Wardrobe{" +
                "width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

}
