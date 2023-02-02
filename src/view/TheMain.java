package view;

import exceptions.RectangleException;
import polygon.Rectangle;

public class TheMain {
    public static void print(Object message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        try {
            Rectangle<Integer> rect= Rectangle.of(1,2,3,4);
            print(rect);
            Rectangle<Integer> rect_copy=Rectangle.copyOf(rect);
            print(rect_copy);
        }
        catch (RectangleException e){
            print(e.getMessage());
        }

    }

}