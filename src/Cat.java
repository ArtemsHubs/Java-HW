public class Cat extends Animal{

    public Cat(float maxRunDistance, float maxJumpHeight) {
        super(maxRunDistance, 0, maxJumpHeight);
    }

    @Override
    public void swim(float swimDistance) {
                System.out.println("Cants can't swim");
    }

}