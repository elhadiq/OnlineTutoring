package view;

import polygon.Rectangle;

public class TheMain {
    public static void print(Object message){
        System.out.println(message);
    }

    public static void main(String[] args) {

            Rectangle<Integer> rect= Rectangle.of(0,1,3,4);
            print(rect);
            Rectangle<Integer> rect_copy=Rectangle.copyOf(rect);
            print(rect_copy);


    }

}