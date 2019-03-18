package chapter10;

public class Fish extends Animal{

    public Fish(){
        this("ChangeMyName");
    }

    public Fish(String name){
        this.setName(name);
    }
    public void move(){
        System.out.println("Swims forward");
    }

    public void makeNoise(){
        System.out.println("*BLUP*");
    }
}
