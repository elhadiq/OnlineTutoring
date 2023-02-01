public class Test<T extends Comparable> {
    T x;

    public Test(T xx){
        this.x = xx;
    }

    static public  <T extends Comparable >Test<T> of(T xx) {
        return new Test<>(xx);
    }

    public static void main(String[] args) {
        Integer a=30;
        Integer b=20;
        System.out.println(a.compareTo(b));
    }
}