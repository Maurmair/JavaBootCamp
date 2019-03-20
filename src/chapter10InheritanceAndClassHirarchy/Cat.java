package chapter10InheritanceAndClassHirarchy;

public class Cat extends Animal{
    public Cat(){
        this("ChangeMyName");
    }

    public Cat(String name){
        this.setName(name);
    }

    public void move(){
        System.out.println("I'm sneaking towards my prey");
    }

    public void makeNoise(){
        System.out.println("*PURR*");
    }

}
