import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Double, Integer> arithmetic = new Arithmetic<>(248.88, 4);
        System.out.println("Testing Arithmetic");
        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + arithmetic.multiply());
        System.out.println("Division: " + arithmetic.divide());
        System.out.println("Minimum: " + arithmetic.getMin());
        System.out.println("Maximum: " + arithmetic.getMax());
        Arithmetic<Long, Short> arithmetic1 = new Arithmetic<>(320000000L, (short) 1000);
        System.out.println("Testing Arithmetic 2...");
        System.out.println("Addition: " + arithmetic1.add());
        System.out.println("Subtraction: " + arithmetic1.subtract());
        System.out.println("Multiplication: " + arithmetic1.multiply());
        System.out.println("Division: " + arithmetic1.divide());
        System.out.println("Minimum: " + arithmetic1.getMin());
        System.out.println("Maximum: " + arithmetic1.getMax());

        System.out.println("//////////////////////////////////////////");
        System.out.println("Testing MyMap: ");
        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("0x0FA", 3);
        myMap.put("0x0FB", 22);
        myMap.put("0x0FC", 7);
        myMap.print();
        System.out.println("Replacing '0x0FA' key...");
        myMap.put("0x0FA", 300);
        myMap.print();
        System.out.println("Removing '0x0FB': " + myMap.remove("0x0FB"));
        myMap.print();
        System.out.println("Get '0x0FC' key -> " + myMap.get("0x0FC"));
    }

}