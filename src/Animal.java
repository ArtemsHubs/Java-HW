
public  class Animal {

    ;
    //        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу
//        передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.,
//        собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
    protected float maxRunDistance;
    protected float maxSwimDistance;
    protected float maxJumpHeight;

    public Animal(
            float maxRunDistance,
            float maxSwimDistance,
            float maxJumpHeight
    ) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    //        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
//        (Например, dog1.run(150); -> результат: run: true)
//    Метод команды бега.
    public void run(float runDistance) {
        System.out.println("run " + IsItPossibleAction(runDistance, maxRunDistance));
    }

    //    Метод команды плыть.
    public void swim(float swimDistance){
        System.out.println("To swim " + IsItPossibleAction(swimDistance, maxSwimDistance));
    }

    //    Метод команды плыть.
    public void jump(float jumpDistance) {
        System.out.println("To Swim " + IsItPossibleAction(jumpDistance, maxJumpHeight));
    }

    //        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть
//        400 м., у другой 600 м
//   метод проверки возможности действия животному
    private boolean IsItPossibleAction(float Distance, float maxDistance) {
                    return Distance <= maxDistance;
        }


}

//    private String IsItPossibleActionFloat(float Distance, float maxDistance) {
//        if (maxDistance <= Distance) {
//            return "comande is possible";
//        } else {
//            return "comande not possible, the setPoint is to much";
//        }
//    }
//}
