import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 1, 5, 5, 9, 4, 1, 2, 4};

        printFrequency(numbers);
    }

    public static void printFrequency(int[] numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class FrequencyCounter {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int size = scanner.nextInt();

//         int[] array = new int[size];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             array[i] = scanner.nextInt();
//         }
//         scanner.close();
//     }

//     public static void printFrequency(int[] array) {
//         Map<Integer, Integer> frequencyMap = new HashMap<>();

//         for (int num : array) {
//             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//         }
//         System.out.println("Integer\tFrequency");
//         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//             System.out.println(entry.getKey() + "\t\t" + entry.getValue());
//         }
//     }
// }


// import java.util.HashMap;

// public class FrequencyCounter {

//     public static void main(String[] args) {

//         int arr[] = {1, 4, 1, 5, 5, 9, 4, 1, 2, 4};

//         HashMap<Integer, Integer> hs = new HashMap<>();

//         for(int num : arr){
//             if(hs.containsKey(num)){

//                 hs.put(num, hs.get(num)+1);
//             }
//             else{
//                 hs.put(num, 1);
//             }
//         }

//         System.out.println(hs);
//     }
// }