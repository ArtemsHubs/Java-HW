public class Cat {
private String name;
    private int appetite;
    private boolean fedUp;
    public Cat(String name,int appetite){
        this.name= name;
        this.appetite= appetite;
        this.fedUp= fedUp;
    }
    public void eat(Plate p){
        p.decreaseFood(appetite);
    }
    public void IsFedUp(boolean full){
        fedUp=full;
        System.out.println(fedUp);
    }
    public void IsItEnough(Plate p){
        fedUp=Plate.en;
        System.out.println(fedUp);
    }
    public String getName(){
        return name;
    }
}



