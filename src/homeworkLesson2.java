public class homeworkLesson2 {
    public static void main(String[] args){
        System.out.println("Задание 1");//Задание 1
invertArray();
        System.out.println("");
System.out.println("Задание 2 ");
fillingArray();
        System.out.println("");
        System.out.println("Задание 3 ");
        doubleNumberLessThanSix();
    }
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(" "+arr[i]);
        }
    }// метод задания1
    public static void fillingArray(){
        int[] arr = new int[8];
        for(int i=0;i< arr.length;i++){
            arr[i]=i*3;
            System.out.print(arr[i]+" ");
        }
    }//метод задания2
    public static void doubleNumberLessThanSix(){
        int[] arr= {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i=0; i<arr.length;i++){
            if(arr[i]<6){
                arr[i]=arr[i]*2;
            }
            System.out.print(arr[i]+" ");
        }

    }//метод задания3
}