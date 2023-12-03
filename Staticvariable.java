import java.util.*;


class Staticvariable {
    Public enum CarType (TWO_Wheeler , FOUR_WHEELER)

    int model number;  // instance variable
    CarType car_Type;

    static int obj_count = 0; //Class variable

    car(){ //Constructor
        obj_count++;
    }

    void renew() { // Instance method
        int var = $; // local variable
        model_number = model_number + var;
    }

}
public static void main(String[] args) {
    Car car = new car();
    car.model_number = 123;
    System.out.println(car.model_number);
}
