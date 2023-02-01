package view;


import geometry.Direction;
import geometry.Rectangle;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class TheMain {
    public static void print(Object message){
        System.out.print(message);
    }

    public static void main(String[] args) {

        EnumMap<Direction, Integer> borders =new EnumMap<>(Direction.class);
        borders.put(Direction.BOTTOM,10);
        borders.put(Direction.TOP,2);
        borders.put(Direction.LEFT,3);
        borders.put(Direction.RIGHT,40);
        Rectangle<Integer> rec1=new Rectangle<>(borders);

        List<Direction> directions =new ArrayList<Direction>();
        directions.add(Direction.TOP);
        directions.add(Direction.BOTTOM);


        try{
            Rectangle<Integer> rec2= Rectangle.of(3,5,8,9);
            Rectangle<Integer> rec3=Rectangle.copyOf(rec2);
            Rectangle<Double> rec4=Rectangle.of(0.2,3.1,8.9,10.0);
            System.out.println("rec1 "+rec1);
            System.out.println("rec2 "+rec2);
            System.out.println("rec3 copy of rec2 "+rec3);
            System.out.println("rec4 "+rec4);
            Rectangle<Integer> rec5=rec2;
            System.out.println("rec5 "+rec5);
            rec2.borders.put(Direction.TOP,10);
            System.out.println(" If we change the value of Top of rec2 what happend to rec3 and rec5");

            System.out.println("rec2 "+rec2);
            System.out.println("rec3 copy of rec2 "+rec3);
            System.out.println("rec5 "+rec5);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}