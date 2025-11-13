import java.util.Random;

void main() {
    int[] array = new int[10];
    Random rand = new Random();

    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < array.length; i++) {
        array[i] = rand.nextInt(100) + 1;
        System.out.print(array[i] + " ");

        if (array[i] < smallest) {
            smallest = array[i];
        }
        if (array[i] > largest) {
            largest = array[i];
        }
    }
    System.out.println();

    System.out.println("The smallest number is: " + smallest);
    System.out.println("The largest number is: " + largest);


}
