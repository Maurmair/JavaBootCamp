package chapter10;

public class Bird extends Animal{
    public Bird(){
        this("ChangeMyName");
    }

    public Bird(String name){
        this.setName(name);
    }
    public void move(){
        System.out.println("Flies away");
    }

    public void makeNoise(){
        System.out.println("*Tweet*");
    }
}
