//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int[][] Array = new int[10][10];
    int sum = 0;

    for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
            if (i==j) {
                Array[i][j] = i;
                sum += i;
            }
            else {
                Array[i][j] = 0;
            }

        }
    }

    for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
            System.out.print(Array[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println("Sum: " + sum);

  }

