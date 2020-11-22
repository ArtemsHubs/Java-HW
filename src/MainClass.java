import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){

//    Cat cat = new Cat("Barsik", 5);
        Cat cat[] = new Cat[3];
        cat[0]= new Cat("Barsik",50);
        cat[1]= new Cat("Mursik",30);
        cat[2]= new Cat("Kotenok Gav",28);
    Plate plate = new Plate(100);
    for(int j=0;j<2;j++) {
        for (int i = 0; i < cat.length; i++) {
//            plate.info();
            String tempName = cat[i].getName();
            System.out.println(tempName + ":");
            cat[i].eat(plate);
            System.out.println(tempName + " поел?");
            cat[i].IsItEnough(plate);
            plate.info();


        } System.out.println("Добавьте вискас,ввидите целое число");
        Scanner scanner = new Scanner(System.in);
        int portion = scanner.nextInt();
        plate.addWhiskas(portion);
        plate.info();
    }
}


}
//Расширить задачу про котов и тарелки с едой.
//     2.   Сделать  так,  чтобы  в  тарелке  с  едой  не  могло  получиться  отрицательного  количества  еды
//          (например, в миске  10 еды, а кот пытается покушать  15-20).
//     3.   Каждому  коту  нужно  добавить  поле  сытость  (когда  создаем  котов,  они  голодны).  Если  коту
//         удалось покушать (хватило еды), сытость                true.
//     4.   Считаем,  что  если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
//          наполовину сыт (​это сделано для упрощения логики программы​).
//     5.   Создать  массив  котов  и  тарелку  с  едой,  попросить  всех  котов  покушать  из  этой  тарелки  и
//          потом вывести информацию о сытости котов в консоль.
//     6.  Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.