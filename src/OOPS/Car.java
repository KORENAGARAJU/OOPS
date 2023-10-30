package OOPS;
public class Car{
    int seats ;
    String color ;
    int wheels ;
    boolean airBag ;
    Car(){

    }

    //constructor
    Car(int seats , String color , int wheels , boolean airBag){
        this.seats = seats ;
        this.color = color ;
        this.wheels = wheels ;
        this.airBag = airBag ;
    }
    public String speed(){
        return  "150kmph" ;
    }
}
