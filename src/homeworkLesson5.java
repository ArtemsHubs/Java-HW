public class homeworkLesson5 {

    public static void main(String[] args) {
       employees[] persArray = new employees[5];
//    Сотрудник 1
         persArray[0]= new employees("Ivanov Ivan",
                 "Engineer", "ivivan@mailbox.com",
                 "892312312", 30000, 30);

        //    Сотрудник 2
        persArray[1]= new employees("Ivanov Ivan1",
                "Engineer1", "ivivan1@mailbox.com",
                "8923123121", 31000, 31);

        //    Сотрудник 3
        persArray[2]= new employees("Ivanov Ivan2",
                "Engineer2", "ivivan2@mailbox.com",
                "8923123122", 32000, 32);

        //    Сотрудник 4
        persArray[3]= new employees("Ivanov Ivan3",
                "Engineer3", "ivivan3@mailbox.com",
                "8923123123", 33000, 41);

        //    Сотрудник 5
        persArray[4]= new employees("Ivanov Ivan4",
                "Engineer4", "ivivan4@mailbox.com",
                "8923123124", 44000, 44);


        for(int i=0;i<5;i++) {
        if (persArray[i].age>=40){
            persArray[i].personInfo();
        }
        }
    }
}

//    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        Конструктор класса должен заполнять эти поля при создании объекта.
//        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//        С помощью цикла вывести информацию только о сотрудниках старше 40 лет.