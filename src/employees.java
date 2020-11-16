public class employees {
    String name;
    String position;
    String email;
    String phoneNumber;
      int wage;
       int age;

  public employees(String name,String position,String email, String phoneNumber,int wage, int age){
     this.name=name;
     this.position=position;
     this.email=email;
     this.phoneNumber=phoneNumber;
     this.wage=wage;
     this.age=age;
 }
public void personInfo(){
     System.out.println("     ФИО: "+name);
    System.out.println("Должность: "+position);
    System.out.println("email: "+email);
    System.out.println("телефон: "+phoneNumber);
    System.out.println("ФИО: "+name);
    System.out.println("Зарплата: "+wage);
    System.out.println("Возраст: "+age);
    System.out.println("==========================================");
    System.out.println();
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
