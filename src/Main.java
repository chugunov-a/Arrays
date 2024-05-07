
public class Main {
    public static void main(String[] args) {
        System.out.println("Задания 1, 2");
        {
            int[] arrayOne = new int[3];
            arrayOne[0] = 1;
            arrayOne[1] = 2;
            arrayOne[2] = 3;
            for (int i = 0; i < arrayOne.length; i++) {
                System.out.print(arrayOne[i]);
                if (i < arrayOne.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
            double[] arrayTwo = {1.57, 7.654, 9.986};
            for (int i = 0; i < arrayTwo.length; i++) {
                System.out.print(arrayTwo[i]);
                if (i < arrayTwo.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
            int[] arrayThree = new int[2];
            arrayThree[0] = 7;
            arrayThree[1] = 8;
            for (int i = 0; i < arrayThree.length; i++) {
                System.out.print(arrayThree[i]);
                if (i < arrayThree.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("Задание 3");
        {
            int[] arrayOne = new int[3];
            arrayOne[0] = 1;
            arrayOne[1] = 2;
            arrayOne[2] = 3;
            for (int i = 2; i > -1; i--) {
                System.out.print(arrayOne[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
            double[] arrayTwo = {1.57, 7.654, 9.986};
            for (int i = arrayTwo.length - 1; i > -1; i--) {
                System.out.print(arrayTwo[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
            int[] arrayThree = new int[2];
            arrayThree[0] = 7;
            arrayThree[1] = 8;
            for (int i = arrayThree.length - 1; i > -1; i--) {
                System.out.print(arrayThree[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("Задание 4");
        {
            int[] arrayOne = {1, 2, 3};
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] % 2 != 0) {
                    arrayOne[i]++;
                    System.out.print(arrayOne[i] + ", ");
                } 
            }
        }
    }
}
