package com.company;

public class Box <T> {
    private T size;

    public Box(T size) {
        this.size = size;
    }
    public static <T> Box<T> method(T num) {
        return new Box<T>(num);
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }
}
