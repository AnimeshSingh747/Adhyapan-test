public class overloading {
    //method overloading
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
    static double add(double a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(add(6,7));
    }
}
