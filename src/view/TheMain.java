package view;


import geometry.Coordinate;
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
            Rectangle<Integer> rec2= rec1.of(3,5,8,9);
            Rectangle<Integer> copy1=rec1.copyOf(rec2);
            System.out.println("rec1 "+rec1);
            System.out.println("rec2 "+rec2);
            System.out.println("copy1 "+copy1);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        ;//TODO run EnumMap<Direction, T> getBorders(Collection<Direction> directions){
    }

}