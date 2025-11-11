import java.util.Random;

void main() {
    int[] Array = new int[10];
    Random rand = new Random();

    for (int i = 0; i < Array.length; i++) {
        Array[i] = rand.nextInt(100) + 1;
    }

    int smallest = Array[0];
    int largest = Array[0];

    for (int i = 0; i < Array.length; i++) {
        System.out.print(Array[i] + " ");
    }
    System.out.println();


    for (int i = 1; i < Array.length; i++) {
        if (Array[i] < smallest) {
            smallest = Array[i];
        }
        if (Array[i] > largest) {
            largest = Array[i];
        }
    }
    System.out.println("The smallest number is: " + smallest);
    System.out.println("The largest number is: " + largest);


}
