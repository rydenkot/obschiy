import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
public class Task_14 {
    public static void main(String args[]) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 41) - 20);
            System.out.println(array[i]);
        }
        {
            IntStream intStream = Arrays.stream(array);
            OptionalInt optionalInt = intStream.max();
            int maxAsInt = optionalInt.getAsInt();

            System.out.println("Maximum number = " + maxAsInt);

        }
        {
            IntStream intStream = Arrays.stream(array);
            OptionalInt optionalInt = intStream.min();
            int minAsInt = optionalInt.getAsInt();

            System.out.println("Minimum number = " + minAsInt);

        }
    }
}
