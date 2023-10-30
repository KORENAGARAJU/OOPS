package OOPS;

public class CarClient {
    public static void main(String[] args) {
        Car car1 = new Car() ; // error if constructor is not declared in class Car ;
        Car car = new Car(6,"red",4,true) ;
        System.out.println(car.speed());
    }
//    int seats ;
//    String color ;
//    int wheels ;
//    boolean airBag ;
}
