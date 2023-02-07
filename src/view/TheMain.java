package view;

import polygon.AxisMap;
import polygon.Coordinate;
import polygon.PlaneMap;
import polygon.Rectangle;

import java.util.*;

public class TheMain {
    public static void print(Object message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int i=0;
        System.out.print("Give a number: ");
        //i=in.nextInt();
        i=4;
        switch (i) {
            case 1 -> axisMapTest();
            case 2 -> testflatIndexOf();
            case 3 -> testPlanedMap();
            default -> testPlanMapOf();
        }

    }
    public static void axisMapTest(){
        List<Integer> coordinates=new ArrayList<>() ;
        coordinates.add(10);
        coordinates.add(11);
        coordinates.add(21);

        System.out.println(coordinates);
        Collections.sort(coordinates);
        System.out.println(coordinates);
        AxisMap axis=AxisMap.from(coordinates);
        System.out.println(axis);

    }
    public static void testflatIndexOf(){
        List<Coordinate> coordinates=new ArrayList<>() ;
        coordinates.add(new Coordinate(10));
        coordinates.add(new Coordinate(9));
        Coordinate x=new Coordinate(11);
        coordinates.add(x);
        AxisMap axis=AxisMap.from(coordinates);
        System.out.println(axis);
        System.out.println(axis.indexOf(new Coordinate(11)));
        System.out.println(axis.indexOf(new Coordinate(100)));
        System.out.println("The size of the index is "+axis.size());

        System.out.println(axis.indexOf(11));
        System.out.println(axis.indexOf(9));
        axis.indexOf(11).ifPresent(System.out::println);
        axis.indexOf(9).ifPresent(System.out::println);
        if(axis.indexOf(11).isPresent()){
            int y=(int) axis.indexOf(11).get();
            System.out.println("the index of 11 is "+y);
        }

    }
    public static void testPlanedMap(){
        List<Double> Xcoordinates=new ArrayList<>() ;
        List<Double> Ycoordinates=new ArrayList<>() ;

        Xcoordinates.add(10.0);
        Xcoordinates.add(11.1);
        Xcoordinates.add(21.1);

        Ycoordinates.add(0.0);
        Ycoordinates.add(1.1);
        Ycoordinates.add(2.0);
        Ycoordinates.add(4.0);
        Ycoordinates.add(8.0);

        PlaneMap plan1=PlaneMap.of(Xcoordinates,Ycoordinates);
        print(plan1);
        print(plan1.xIndexOf(1.0));
        print(plan1.yIndexOf(4.0));
        print(plan1.xIndexOf(11.0 ));
        print(plan1.yIndexOf(0.0));

        print("xSize: "+plan1.xSize());
        print("ySize: "+plan1.ySize());
    }
    public static void testPlanMapOf(){
        Rectangle<Integer> rec1= Rectangle.of(1,2,3,4);
        Rectangle<Integer> rec2= Rectangle.of(2,3,4,5);
        Rectangle<Integer> rec3= Rectangle.of(3,4,5,6);
        Set<Rectangle> rectangles=new HashSet<>(Arrays.asList(rec1,rec2,rec3));
        print(rectangles);
        PlaneMap plan2=PlaneMap.from(rectangles);
        print(plan2);
    }
}