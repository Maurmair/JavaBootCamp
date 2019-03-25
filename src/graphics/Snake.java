package graphics;

import chapter10InheritanceAndClassHirarchy.Animal;

public class Snake extends Animal {
    public Snake(){
        this("ChangeMyName");
    }

    public Snake(String name){
        this.setName(name);
    }
    public void move(){
        System.out.println("Slithers away");
    }

    public void makeNoise(){
        System.out.println("*SSSSSSS*");
    }
}
