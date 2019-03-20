package chapter17;

public class ShoePair implements Pair<Shoe> {
    private Shoe leftShoe;
    private Shoe rightShoe;
    public ShoePair(Shoe left, Shoe right) {
        leftShoe = left;
        rightShoe = right;
    }

    public Shoe getLeft(){
        return leftShoe;
    }

    public void setLeft(Shoe left){
        leftShoe = left;
    }

    public Shoe getRight(){
        return rightShoe;
    }

    public void setRight(Shoe right){
        rightShoe = right;
    }
}
