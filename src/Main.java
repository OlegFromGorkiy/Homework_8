import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        // task_1
        Integer[] intArray = new Integer[]{rnd.nextInt(10), rnd.nextInt(10), rnd.nextInt(10)};
        Double[] doubleArray = {10 * Math.random(), 10 * Math.random(), 10 * Math.random()};
        String[] stringArray = {"один", "два", "три"};

        System.out.println("Задание 2");
        print(intArray);
        print(doubleArray);
        print(stringArray);
        System.out.println("***\n");

        System.out.println("Задание 3");
        print(reverse(intArray));
        print(reverse(doubleArray));
        print(reverse(stringArray));
        System.out.println("***\n");

        System.out.println("Задание 4");
        print(toEvenNumber(intArray));
        System.out.println("***\n");
    }
    public static <T> void print(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length-1) System.out.print(", ");
            else System.out.print("\n");
        }
    }
    public static <T> T[] reverse(T[] array){
        int size = array.length;
        T[] temp = array.clone();
        for (int i = 0; i < size; i++) {
            array[i] = temp[size-1-i];
        }
        return array;
    }
    public static Integer[] toEvenNumber(Integer[] array){
        Integer[] result = array.clone();
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0) result[i] = array[i]+1;
        }
        return result;
    }
}