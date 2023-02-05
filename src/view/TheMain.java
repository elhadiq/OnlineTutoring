package view;

import polygon.AxisMap;
import polygon.Coordinate;
import polygon.Rectangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheMain {
    public static void print(Object message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        //axisMapTest();
        testflatIndexOf();

    }
    public static void axisMapTest(){
        List<Integer> coordinates=new ArrayList<Integer>() ;
        coordinates.add(10);
        coordinates.add(11);
        coordinates.add(21);

        System.out.println(coordinates);
        Collections.sort(coordinates);
        System.out.println(coordinates);
        AxisMap axis=AxisMap.from(coordinates);
        System.out.println(axis);
        System.out.println(axis.flatIndexOf(11));
    }
    public static void testflatIndexOf(){
        /**
         * Test with THe class Coordinate
         */
        List<Coordinate> coordinates=new ArrayList<Coordinate>() ;
        coordinates.add(new Coordinate(10));
        coordinates.add(new Coordinate(9));
        Coordinate x=new Coordinate(11);
        coordinates.add(x);
        AxisMap axis=AxisMap.from(coordinates);
        System.out.println(axis);
        System.out.println(axis.flatIndexOf(new Coordinate(11)));
        System.out.println(axis.flatIndexOf(11));
    }
}