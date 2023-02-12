package view;

import polygon.Grid;
import polygon.Rectangle;
import polygon.RectangleGroup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void print(Object message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        Rectangle rect1=Rectangle.of(3,2,1,2);
        Rectangle rect2=Rectangle.of(2,1,2,3);
        Rectangle rect3=Rectangle.of(1,0,0,3);
        Rectangle rect4=Rectangle.of(1,0,0,3);
        Set<Rectangle> rectangles=new HashSet<>(Arrays.asList(rect1,rect2,rect3,rect4));
        RectangleGroup rectGroup=RectangleGroup.from(rectangles);
        print(rectGroup);
        print("Is Overlaping "+rectGroup.isOverlapping());
    }
}
