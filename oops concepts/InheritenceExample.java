import java.util.List;

abstract class phone{
        String model_number;
        String color;
        String operating_system;
        String brand;

        String get_operating_system() {
            return "Default";
        }

        abstract List<String> features();
    }

    class Pixel extends phone{
        String get_operating_system() {
            return "Android";
        }
    }

    class Iphone extends phone{
        String get_operating_system() {
            return "IOS";
        }
    }
public class InheritenceExample {
    public static void main(String[] args) {
        
    }
}
