public class homeworkLesson2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");//Задание 1
        invertArray();
        System.out.println("");
        System.out.println("Задание 2 ");
        fillingArray();
        System.out.println("");
        System.out.println("Задание 3 ");
        doubleNumberLessThanSix();
        System.out.println("");
        System.out.println("Задание 4 ");
        squareArray(5);
        System.out.println("");
        System.out.println("Задание 5");
        findMinAndMax();
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(" " + arr[i]);
        }
    }// метод задания1

    public static void fillingArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
    }//метод задания2

    public static void doubleNumberLessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }

    }//метод задания3

    public static void squareArray(int arrLength) {
        int[][] arr = new int[arrLength][arrLength];
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void findMinAndMax() {
        int[] arr = {1, 2, 6, 4, 5, 8, 4, 5, 6, 32, 1, 1, 54, 87, 88, 78, 0};
        int minElement = -1;
        int maxElement=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int b = 0; b < arr.length; b++) {
                if (arr[i] < arr[b]) {
                    minElement = i;

                }

            }
        }
        for (int j = 0; j < arr.length; j++) {
            for (int a=0; a < arr.length; a++) {
                if (arr[j] > arr[a]){
                    maxElement = j;

                }
            }


    }
        System.out.println("Минимальный элемент массива: "+minElement);
        System.out.println("Максиальнгыц элемент массива: "+maxElement);
    }
}
