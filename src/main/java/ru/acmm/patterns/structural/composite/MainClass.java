package ru.acmm.patterns.composite;

public class MainClass {

    public static void main(String[] args) {
        Box allBox = new Box("AllBox");
        Box box1 = new Box("Box#1");
        box1.addItem(new Product("Meat", 10d));
        box1.addItem(new Product("Verdure", 5d));
        box1.addItem(new Product("Eggs", 1.4));

        Box box2 = new Box("Box#2");
        box2.addItem(new Product("Milk", 2.5));
        box2.addItem(new Product("Cream", 3d));

        allBox.addItem(box1);
        allBox.addItem(box2);
        allBox.addItem(new Product("Bag", 0.5));

        System.out.println(allBox.getPrice());

    }
}
