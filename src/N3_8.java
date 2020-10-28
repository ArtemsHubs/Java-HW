public class N3_8 {
//    Задания 3-8
    public static void main(String[] args){
        System.out.println(Task3(5,56,30,22)); //вызов метода 3
        System.out.println(Task4(5,6));//вызов метода 4
        Task5(10);// вызов метода 5
        System.out.println(Task6(3));// вызов метод 6
        Task7("Илья");//выхов метод 7
        Task8(2012);// вызов метода 8
    }
    //    метод к заданию 3
    public static int Task3(int a, int b, int c, int d) {
        return (a*(b+(c/d)));    }

//        метод задания 4
    public static boolean Task4(int a, int b){
                if ((10<=(a+b))&&((a+b)<=20)){
            return true;
        }
        return false;

    }
//    метод 5
    public static void Task5(int a){
        if (a>=0){
        System.out.println("положительное");}
        else{System.out.println("отрицательное");}
    }
//    Метод 6
    public static boolean Task6(int a){
       if (a<0){
           return true;
       }
      return false;
    }
//    метод 7
    public static void Task7(String Name){
        System.out.println("Привет, "+Name+"!");
    }
//    Метод 8
    public static void Task8(int a){
        if ((a%100 != 0) && (a%4 == 0) ||(a%400 ==0)){
            System.out.println("Високосный");}
        else {System.out.println("Обычный");
        };
    }
}
