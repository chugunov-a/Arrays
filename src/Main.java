
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
                if (i < 2) {
                    System.out.print(", ");
                }
            }
            double[] arrayTwo = {1.57, 7.654, 9.986};
            System.out.print("\n" + arrayTwo[0] + ", " + arrayTwo[1] + ", " + arrayTwo[2]);
            int[] arrayThree = new int[2];
            arrayThree[0] = 7;
            arrayThree[1] = 8;
            System.out.println("\n" + arrayThree[0] + ", " + arrayThree[1]);
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
            double[] arrayTwo = {1.57, 7.654, 9.986};
            System.out.print("\n" + arrayTwo[2] + ", " + arrayTwo[1] + ", " + arrayTwo[0]);
            int[] arrayThree = new int[2];
            arrayThree[0] = 7;
            arrayThree[1] = 8;
            System.out.println("\n" + arrayThree[1] + ", " + arrayThree[0]);
        }
        System.out.println("Задание 4");
        {
            int[] arrayOne = {1, 2, 3};
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] % 2 != 0) {
                    arrayOne[i]++;
                    System.out.print(arrayOne[i] + ", ");
                } else {
                    System.out.print(arrayOne[i] + ", ");
                }
            }
        }
    }
}
