public class Singletonclass {

    private static Singletonclass singleton_obj = null;

    public static Singletonclass getInstance() {
         if(singleton_obj == null) {
            singleton_obj = new Singletonclass();
         }
         return singleton_obj;
    }
    public void printName() {
        System.out.println("is singleton");
    }
       public static void main(String[] args) {
        Singletonclass obj = Singletonclass.getInstance();
        Singletonclass obj2 = Singletonclass.getInstance();
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        obj.printName();
       } 
    }
