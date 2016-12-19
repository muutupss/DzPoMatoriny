package ru.sbt.generici;

public class Main {
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();
        map.add(9);
        map.add(7);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(9);
        System.out.println(map.getCount(5));
        System.out.println(map.getCount(6));
    }
}
