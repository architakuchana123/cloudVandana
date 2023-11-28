import java.util.*;

public class ArrayShuffler {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(array));
        shuffleArray(array);
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    private static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i >= 1; i--) {
            int randomIndex = random.nextInt(i + 1);
            swapElements(array, i, randomIndex);
        }
    }

    private static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
