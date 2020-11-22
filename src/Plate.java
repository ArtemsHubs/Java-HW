public class Plate {
    private int food;
    static boolean en;
    public Plate(int food){
        this.food=food;}
        public void decreaseFood(int n){
        if(food>=n){
        food-=n;
        en=true;
        }
        else{
            en=false;
        }
    }

public void info() {
    System.out.println("plate: " + food);
}
public void addWhiskas(int add){
        if (add>0){
        food+=add;
System.out.println("  Вы добавили выскаса "+add+",  теперь в миске "+food);

}else{
            food+=0;
            System.out.println("Вы добавили выскаса 0,  теперь в миске "+food);}
}
}
